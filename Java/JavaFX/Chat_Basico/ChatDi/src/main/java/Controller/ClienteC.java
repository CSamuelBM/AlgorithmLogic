package Controller;

import Modelo.PaqueteM;
import Modelo.SesionActual;
import Modelo.UsuarioM;
import Servicios.ChatClient;
import Util.Navegacion;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

public class ClienteC implements BaseC{

    @FXML protected HBox rootPane;
    @FXML protected ToggleButton btnModoOscuro;
    @FXML protected TextField tfMensaje;
    @FXML protected VBox vbMostrarMensajes;
    @FXML protected ScrollPane spMostrarMensajes;
    @FXML protected MenuItem documento;
    @FXML protected MenuItem imagen;
    @FXML protected MenuItem video;
    @FXML protected MenuItem audio;
    @FXML protected MenuItem animacion;
    @FXML protected MenuItem musica;
    @FXML private MenuButton mbPerfil;
    @FXML protected Label lbNombreUsuario;
    @FXML protected ImageView ivFotoPerfil;
    @FXML protected Button btnEmoji;
    @FXML protected Button btnBuzz;
    @FXML protected ListView<UsuarioM> listaContactos;
    @FXML protected Label lbNombreUsuarioChat;
    @FXML protected Label lbEstadoUsuarioChat;
    @FXML protected TextField tfBuscar;

    private ObservableList<UsuarioM> contactosOriginales = FXCollections.observableArrayList();
    private ChatClient chatClient;
    private int idReceptor = 0;
    private ContextMenu menuEmojis;

    @FXML
    public void initialize() {
        Platform.runLater(() -> {
            Stage stage = (Stage) rootPane.getScene().getWindow();
            if (stage != null) {
                stage.setResizable(true);
                stage.setWidth(1050);
                stage.setHeight(650);
                stage.centerOnScreen();
                stage.setTitle("ChatLID! - Panel Principal");
            }
        });

        vbMostrarMensajes.heightProperty().addListener((obs, oldVal, newVal) -> {
            spMostrarMensajes.setVvalue(1.0);
        });

        if (SesionActual.getUsuario() != null) {
            mbPerfil.setText(SesionActual.getUsuario().getNombre());
        }

        listaContactos.getSelectionModel()
                .selectedItemProperty()
                .addListener((obs, oldVal,
                              newVal) -> {
                    if (newVal != null) {
                        idReceptor = newVal.getId();
                        System.out.println("Chat con: " + newVal.getNombre());

                        lbNombreUsuarioChat.setText(newVal.getNombre());

                        if (newVal.getEstado() != null) {
                            lbEstadoUsuarioChat.setText(newVal.getEstado());
                        } else {
                            lbEstadoUsuarioChat.setText("Desconocido");
                        }

                        vbMostrarMensajes.getChildren().clear();

                        PaqueteM p = PaqueteM.historial(
                                SesionActual.getUsuario().getId(),
                                idReceptor
                        );
                        chatClient.enviar(p);
                    }
                });

        documento.setOnAction(e -> abrirSelector(
                "Seleccionar documento",
                new FileChooser.ExtensionFilter(
                        "Documentos", "*.pdf", "*.docx", "*.txt", "*.xlsx", "*.zip"),
                PaqueteM.TipoMensaje.ARCHIVO
        ));

        imagen.setOnAction(e -> abrirSelector(
                "Seleccionar imagen",
                new FileChooser.ExtensionFilter("Imágenes", "*.png", "*.jpg", "*.jpeg", "*.gif", "*.webp"),
                PaqueteM.TipoMensaje.IMAGEN
        ));

        video.setOnAction(e -> abrirSelector(
                "Seleccionar video",
                new FileChooser.ExtensionFilter(
                        "Videos", "*.mp4", "*.avi", "*.mkv", "*.mov"
                ),
                PaqueteM.TipoMensaje.VIDEO
        ));

        audio.setOnAction(e -> abrirSelector(
                "Seleccionar audio",
                new FileChooser.ExtensionFilter(
                        "Audio", "*.mp3", "*.wav", "*.ogg", "*.aac"
                ),
                PaqueteM.TipoMensaje.AUDIO
        ));

        animacion.setOnAction(e -> abrirSelector(
                "Seleccionar animación",
                new FileChooser.ExtensionFilter(
                        "Animaciones", "*.gif", "*.webp"
                ),
                PaqueteM.TipoMensaje.ANIMACION
        ));

        musica.setOnAction(e -> abrirSelector(
                "Seleccionar música",
                new FileChooser.ExtensionFilter(
                        "Música", "*.mp3", "*.wav", "*.flac"
                ),
                PaqueteM.TipoMensaje.MUSICA
        ));

        crearEmoticon();

        tfBuscar.textProperty().addListener((obs, oldText, newText) -> {
            filtrarContactos(newText);
        });

        configurarListaContactos();
    }

    @FXML
    private void cambiarTema() {
        if (btnModoOscuro.isSelected()) {
            rootPane.getStyleClass().add("dark-mode");
        } else {
            rootPane.getStyleClass().remove("dark-mode");
        }
    }

    @FXML
    private void agregarContacto() {
        Navegacion.cambiarVista("/View/ContactoV.fxml",
                (ContactoC contactoC) -> contactoC.setChatClient(chatClient));
    }

    @FXML
    private void estadoDisponible() {
        enviarEstado(PaqueteM.EstadoUsuario.DISPONIBLE);
    }

    @FXML
    private void estadoAusente() {
        enviarEstado(PaqueteM.EstadoUsuario.AUSENTE);
    }

    @FXML
    private void estadoOcupado() {
        enviarEstado(PaqueteM.EstadoUsuario.OCUPADO);
    }

    @FXML
    private void estadoNoDisponible() {
        enviarEstado(PaqueteM.EstadoUsuario.NO_DISPONIBLE);
    }

    @FXML
    private void estadoInvisible() {
        enviarEstado(PaqueteM.EstadoUsuario.INVISIBLE);
    }

    @FXML
    private void cerrarSesion() {
        PaqueteM p = PaqueteM.logout(
                SesionActual.getUsuario().getId()
        );
        chatClient.enviar(p);

        SesionActual.cerrar();

        Navegacion.cambiarVista("/View/LoginV.fxml",
                (LoginC c) -> c.iniciar()
        );
    }

    @FXML
    protected void enviarMensaje() {
        String mensaje = tfMensaje.getText().trim();
        if (mensaje.isEmpty()) return;

        if(idReceptor == 0)
        {
            mostrarTexto("Selecciona un contacto", true);
            return;
        }

        PaqueteM p = PaqueteM.texto(
                SesionActual.getUsuario().getId(),
                idReceptor,
                mensaje
        );

        chatClient.enviar(p);
        tfMensaje.clear();
    }

    @FXML
    protected void solicitudUsuario(){
        Navegacion.cambiarVista("/View/SolicitudesV.fxml",
                (SolicitudesC solicitudesC) -> {
                    chatClient.setControladorActivo(solicitudesC);
                    solicitudesC.setChatClient(chatClient);
                });
    }

    @FXML
    protected void mostrarEmoticon() {
        if (menuEmojis.isShowing()) {
            menuEmojis.hide();
        } else {
            menuEmojis.show(btnEmoji, Side.TOP, 0, 0);
        }
    }

    @FXML
    protected void enviarZumbador(){
        if (idReceptor == 0) {
            mostrarTexto("Selecciona un contacto", true);
            return;
        }

        PaqueteM p = PaqueteM.zumbador(
                SesionActual.getUsuario().getId(),
                idReceptor
        );

        chatClient.enviar(p);
        mostrarTexto("Zumbador enviado", true);
    }


    @FXML
    private void bloquearContacto() {
        if (idReceptor == 0) {
            mostrarTexto("Selecciona un contacto", true);
            return;
        }

        PaqueteM p = PaqueteM.bloquear(
                SesionActual.getUsuario().getId(),
                idReceptor
        );
        chatClient.enviar(p);
        mostrarTexto("Contacto bloqueado", true);
    }

    @FXML
    private void desbloquearContacto() {
        if (idReceptor == 0) {
            mostrarTexto("Selecciona un contacto", true);
            return;
        }

        PaqueteM p = PaqueteM.desbloquear(
                SesionActual.getUsuario().getId(),
                idReceptor
        );
        chatClient.enviar(p);
        mostrarTexto("Contacto desbloqueado", true);
    }

    @FXML
    private void borrarHistorial() {
        if (idReceptor == 0) {
            mostrarTexto("Selecciona un contacto", true);
            return;
        }

        PaqueteM p = PaqueteM.borrarHistorial(
                SesionActual.getUsuario().getId(),
                idReceptor
        );
        chatClient.enviar(p);

        vbMostrarMensajes.getChildren().clear();
        mostrarTexto("Historial borrado", true);
    }

    @Override
    public void procesarPaquete(PaqueteM p) {
        if (p == null) return;
        if (SesionActual.getUsuario() == null) return;

        switch (p.getTipoOperacion()) {
            case CONTACTO ->{
                System.out.println("Contacto recibido: " + p.getUsuarioM().getNombre());
                listaContactos.getItems().add(p.getUsuarioM());
                contactosOriginales.add(p.getUsuarioM());
            }

            case MENSAJE -> {
                boolean enviadoPorMi =
                        p.getIdEmisor() == SesionActual.getUsuario().getId();
                renderizarMensaje(p, enviadoPorMi);
            }

            case CAMBIAR_ESTADO ->
                    Platform.runLater(() -> {
                        if (p.getIdEmisor() == idReceptor)
                            lbEstadoUsuarioChat.setText(p.getMensajeSistema());

                        actualizarEstado(p.getMensajeSistema());
                    });

            case ZUMBADOR -> Platform.runLater(this::activarZumbador);
        }
    }

    public void setContacto(int idUsuario) {
        this.idReceptor = idUsuario;
    }

    private void filtrarContactos(String texto) {
        if (texto == null || texto.isBlank()) {
            listaContactos.setItems(contactosOriginales);
            return;
        }

        String filtro = texto.toLowerCase();

        ObservableList<UsuarioM> filtrados = FXCollections.observableArrayList();

        for (UsuarioM u : contactosOriginales) {
            if (u.getNombre().toLowerCase().contains(filtro)) {
                filtrados.add(u);
            }
        }

        listaContactos.setItems(filtrados);
    }

    private void enviarEstado(PaqueteM.EstadoUsuario estado) {

        PaqueteM p = PaqueteM.cambiarEstado(
                SesionActual.getUsuario().getId(),
                estado
        );

        chatClient.enviar(p);
    }

    private void actualizarEstado(String estado) {
        UsuarioM u = SesionActual.getUsuario();
        if (u == null) return;

        String icono = switch (estado) {
            case "DISPONIBLE" -> "\uD83D\uDFE2";
            case "AUSENTE" -> "\uD83D\uDFE0";
            case "OCUPADO" -> "\uD83D\uDD34";
            case "NO_DISPONIBLE" -> "⚪";
            case "INVISIBLE" -> "⚫";
            default -> "\uD83D\uDFE1";
        };
        mbPerfil.setText(icono + " " + u.getNombre());
    }

    public void iniciarConexion(ChatClient chatClient) {
        this.chatClient = chatClient;
        chatClient.setControladorActivo(this);

        UsuarioM u = SesionActual.getUsuario();
        System.out.println(">>> Usuario en iniciarConexion: " + u);

        if (u != null){
            mbPerfil.setText(u.getNombre());

            byte[] foto = u.getAvatar();
            if (foto != null) {
                ivFotoPerfil.setImage(
                        new Image(new ByteArrayInputStream(foto))
                );
            } else
                ivFotoPerfil.setImage(cargarImagenDefecto());

            PaqueteM pM = PaqueteM.contactosAceptados(u.getId());
            System.out.println("Cliente pide CONTACTOS_ACEPTADOS para id="
                    + SesionActual.getUsuario().getId());

            chatClient.enviar(pM);
        }
    }

    private Image cargarImagenDefecto() {
        InputStream is = getClass().getResourceAsStream("/Images/flor.png");

        if (is == null) {
            System.out.println("⚠ No se encontró "+ is.toString());
            return null;
        }

        return new Image(is);
    }

    private void configurarListaContactos() {
        listaContactos.setCellFactory(listView -> new ListCell<>() {
            private final ImageView img = new ImageView();
            {
                img.setFitWidth(35);
                img.setFitHeight(35);
                img.setPreserveRatio(true);
            }

            @Override
            protected void updateItem(UsuarioM usuario, boolean empty) {
                super.updateItem(usuario, empty);

                if (empty || usuario == null) {
                    setText(null);
                    setGraphic(null);
                    return;
                }

                setText(usuario.getNombre());

                if (usuario.getAvatar() != null && usuario.getAvatar().length > 0) {
                    img.setImage(
                            new Image(new ByteArrayInputStream(usuario.getAvatar()))
                    );
                } else
                    img.setImage(cargarImagenDefecto());
                setGraphic(img);
            }
        });
    }

    private void activarZumbador() {
        java.awt.Toolkit.getDefaultToolkit().beep();

        Stage stage = (Stage) vbMostrarMensajes.getScene().getWindow();

        double x = stage.getX();
        double y = stage.getY();

        int distancia = 10;

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    double dx = (i % 2 == 0 ? -distancia : distancia);
                    Platform.runLater(() -> stage.setX(x + dx));
                    Thread.sleep(30);
                }
                Platform.runLater(() -> stage.setX(x));
            } catch (Exception ignored) {}
        }).start();

        mostrarTexto("Te enviaron un zumbador", false);
    }

    private void abrirSelector(String titulo, FileChooser.ExtensionFilter filtro, PaqueteM.TipoMensaje tipoMensaje) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle(titulo);
        chooser.getExtensionFilters().add(filtro);
        Stage stage = (Stage) vbMostrarMensajes.getScene().getWindow();

        File archivo = chooser.showOpenDialog(stage);
        if (archivo == null) return;

        byte datos[] = leerBytes(archivo);

        if (idReceptor == 0) {
            mostrarTexto("Selecciona un contacto antes de enviar archivos", true);
            return;
        }

        PaqueteM p = PaqueteM.archivo(
                tipoMensaje,
                SesionActual.getUsuario().getId(),
                idReceptor,
                archivo.getName(),
                datos
        );

        System.out.println("Enviando archivo:");
        System.out.println("   Nombre: " + archivo.getName());
        System.out.println("   TipoMensaje: " + tipoMensaje);
        System.out.println("   Bytes: " + datos.length);

        chatClient.enviar(p);
    }

    private byte[] leerBytes(File archivo) {
        try {
            return java.nio.file.Files.readAllBytes(archivo.toPath());
        } catch (Exception e) {
            return new byte[0];
        }
    }

    private void renderizarMensaje(PaqueteM paqueteM, boolean enviado) {
        switch (paqueteM.getTipoMensaje()) {
            case TEXTO ->
                    mostrarTexto(paqueteM.getContenido(), enviado);
            case IMAGEN -> {
                if (paqueteM.getDatos() != null)
                    mostrarImagen(paqueteM.getNombreArchivo(),
                            paqueteM.getDatos(), enviado);
                else
                    mostrarTexto("Imagen no disponible", enviado);
            }
            case ARCHIVO ->
                    mostrarDocumento(paqueteM.getNombreArchivo(),
                            paqueteM.getDatos(), enviado);
            case EMOTICON -> mostrarEmoticon(paqueteM.getContenido(), enviado);
            case VIDEO ->
                    mostrarDocumento(paqueteM.getNombreArchivo(), paqueteM.getDatos(),
                            enviado);
            case AUDIO ->
                    mostrarDocumento(paqueteM.getNombreArchivo(), paqueteM.getDatos(),
                            enviado);
            case ANIMACION ->
                    mostrarDocumento(paqueteM.getNombreArchivo(), paqueteM.getDatos(),
                            enviado);
            case MUSICA ->
                    mostrarDocumento(paqueteM.getNombreArchivo(), paqueteM.getDatos(),
                            enviado);
        }
    }

    private void mostrarTexto(String texto, boolean enviadoPorMi) {
        if (!Platform.isFxApplicationThread()) {
            Platform.runLater(() -> mostrarTexto("texto", enviadoPorMi));
            return;
        }

        if (texto == null || texto.isBlank())
            texto = "Mensaje vacío";

        HBox contenedor = new HBox();
        StackPane burbuja = new StackPane();
        Label lblTexto = new Label(texto);

        lblTexto.setWrapText(true);
        lblTexto.setMaxWidth(400);

        if (enviadoPorMi) {
            contenedor.setAlignment(Pos.CENTER_RIGHT);
            burbuja.getStyleClass().add("sp-burbuja-enviada");
            lblTexto.getStyleClass().add("lbl-texto-enviado");
        } else {
            contenedor.setAlignment(Pos.CENTER_LEFT);
            burbuja.getStyleClass().add("sp-burbuja-recibida");
            lblTexto.getStyleClass().add("lbl-texto-recibido");
        }

        burbuja.getChildren().add(lblTexto);
        contenedor.getChildren().add(burbuja);
        contenedor.setStyle("-fx-padding: 0 0 10 0;");

        vbMostrarMensajes.getChildren().add(contenedor);
        spMostrarMensajes.setVvalue(1.0);
    }

    private void mostrarImagen(String nombre, byte[] datos, boolean enviado) {
        if (datos == null || datos.length == 0) {
            mostrarTexto("Imagen no disponible", enviado);
            return;
        }

        HBox contenedor = new HBox();
        VBox burbuja = new VBox(6);

        ImageView iv = new ImageView(
                new Image(new ByteArrayInputStream(datos))
        );
        iv.setFitWidth(220);
        iv.setPreserveRatio(true);

        Button btnDescargar = new Button("Guardar");
        btnDescargar.setOnAction(e -> guardarArchivo(nombre, datos));

        if (enviado) {
            contenedor.setAlignment(Pos.CENTER_RIGHT);
            burbuja.getStyleClass().add("sp-burbuja-enviada");
        } else {
            contenedor.setAlignment(Pos.CENTER_LEFT);
            burbuja.getStyleClass().add("sp-burbuja-recibida");
        }

        burbuja.getChildren().addAll(iv, btnDescargar);
        contenedor.getChildren().add(burbuja);
        contenedor.setStyle("-fx-padding: 0 0 10 0;");
        vbMostrarMensajes.getChildren().add(contenedor);
    }

    private void mostrarDocumento(String nombre, byte[] datos, boolean enviado) {
        if (datos == null || datos.length == 0) {
            mostrarTexto("Documento no disponible", enviado);
            return;
        }

        HBox contenedor = new HBox();
        VBox burbuja = new VBox(6);

        Label lbl = new Label(" " + nombre);
        lbl.setWrapText(true);
        lbl.setMaxWidth(300);

        Button btnDescargar = new Button("Guardar");
        btnDescargar.setStyle("-fx-font-size: 11px; -fx-cursor: hand;");
        btnDescargar.setOnAction(e -> guardarArchivo(nombre, datos));

        if (enviado) {
            contenedor.setAlignment(Pos.CENTER_RIGHT);
            burbuja.getStyleClass().add("sp-burbuja-enviada");
            lbl.getStyleClass().add("lbl-texto-enviado");
        } else {
            contenedor.setAlignment(Pos.CENTER_LEFT);
            burbuja.getStyleClass().add("sp-burbuja-recibida");
            lbl.getStyleClass().add("lbl-texto-recibido");
        }

        burbuja.getChildren().addAll(lbl, btnDescargar);
        contenedor.getChildren().add(burbuja);
        contenedor.setStyle("-fx-padding: 0 0 10 0;");

        vbMostrarMensajes.getChildren().add(contenedor);
    }

    private void crearEmoticon() {
        menuEmojis = new ContextMenu();

        String[] emojis = {
                "😀", "😂", "😍", "😎",
                "😭", "😡", "👍", "👎",
                "🙏", "❤️", "🔥", "🎉"
        };

        for (String emoji : emojis) {
            MenuItem item = new MenuItem(emoji);
            item.setStyle("-fx-font-size: 20px;");
            item.setOnAction(e -> enviarEmoticon(emoji));
            menuEmojis.getItems().add(item);
        }
    }

    private void enviarEmoticon(String emoji) {
        if (idReceptor == 0) {
            mostrarTexto("Selecciona un contacto", true);
            return;
        }

        PaqueteM p = PaqueteM.texto(
                SesionActual.getUsuario().getId(),
                idReceptor,
                emoji
        );

        p.setTipoMensaje(PaqueteM.TipoMensaje.EMOTICON);

        chatClient.enviar(p);

        menuEmojis.hide();

    }

    private void mostrarEmoticon(String emoji, boolean enviado) {

        HBox contenedor = new HBox();
        Label lblEmoji = new Label(emoji);

        lblEmoji.setStyle("""
        -fx-font-size: 36px;
        -fx-padding: 6 10 6 10;
    """);

        contenedor.setAlignment(enviado ? Pos.CENTER_RIGHT : Pos.CENTER_LEFT);
        contenedor.getChildren().add(lblEmoji);
        contenedor.setStyle("-fx-padding: 0 0 10 0;");

        vbMostrarMensajes.getChildren().add(contenedor);
    }

    private void guardarArchivo(String nombreSugerido, byte[] datos) {
        if (datos == null || datos.length == 0) {
            mostrarTexto("Archivo no disponible", true);
            return;
        }

        if (nombreSugerido == null || nombreSugerido.isBlank()) {
            nombreSugerido = "archivo";
        }

        FileChooser chooser = new FileChooser();
        chooser.setTitle("Guardar archivo");
        chooser.setInitialFileName(nombreSugerido);

        String ext = "*.*";
        if (nombreSugerido.contains(".")) {
            ext = "*." + nombreSugerido.substring(
                    nombreSugerido.lastIndexOf('.') + 1
            );
        }

        chooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Archivo", ext)
        );

        Stage stage = (Stage) vbMostrarMensajes.getScene().getWindow();
        File destino = chooser.showSaveDialog(stage);

        if (destino != null) {
            new Thread(() -> {
                try {
                    java.nio.file.Files.write(destino.toPath(), datos);

                    Platform.runLater(() ->
                            mostrarTexto("Guardado: " + destino.getName(), true)
                    );

                } catch (Exception e) {
                    Platform.runLater(() ->
                            mostrarTexto("Error al guardar archivo", true)
                    );
                }
            }).start();
        }
    }
}