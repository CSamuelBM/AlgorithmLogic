package Controlador;

import Servicios.InicioServicio;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MenuControlador {

    @FXML protected Button btInicio;
    @FXML protected Button btArchivo;
    @FXML protected Button btEditar;
    @FXML protected Button btPresentacion;
    @FXML protected Button btReferencias;
    @FXML protected Button btVista;
    @FXML protected Button btAyuda;
    @FXML protected HBox barraSecundaria;

    private InicioServicio inicioServicio;
    private ColorPicker colorPicker;

    public void setInicioServicio(InicioServicio inicioServicio) {
        this.inicioServicio = inicioServicio;

        this.colorPicker = new ColorPicker(Color.BLACK);
        this.colorPicker.setFocusTraversable(false);
        inicioServicio.setSelectorColor(colorPicker);

        // PROTOCOLO DE SEGURIDAD CORREGIDO: Evita el NullPointerException
        if (btInicio != null) btInicio.setOnAction(e -> menuFuente());
        if (btArchivo != null) btArchivo.setOnAction(e -> menuArchivo());
        if (btEditar != null) btEditar.setOnAction(e -> menuEditar());
        if (btPresentacion != null) btPresentacion.setOnAction(e -> menuPresentacion());
        if (btReferencias != null) btReferencias.setOnAction(e -> menuReferencias());
        if (btVista != null) btVista.setOnAction(e -> menuVista());
        if (btAyuda != null) btAyuda.setOnAction(e -> menuAyuda());

        menuFuente(); // Carga la pestaña de inicio por defecto
    }

    private void menuFuente() {
        barraSecundaria.getChildren().clear();
        barraSecundaria.setVisible(true);
        barraSecundaria.setManaged(true);

        ComboBox<String> f = new ComboBox<>();
        f.getItems().addAll(Font.getFamilies());
        f.setPromptText("Fuente");
        f.setFocusTraversable(false);
        f.setOnAction(e -> {
            if(f.getValue() != null) inicioServicio.tipoFuente(f.getValue());
        });

        ComboBox<Integer> t = new ComboBox<>();
        t.getItems().addAll(8, 10, 12, 14, 16, 18, 22, 24, 36, 48, 72);
        t.setPromptText("Tamaño");
        t.setFocusTraversable(false);
        t.setOnAction(e -> {
            if(t.getValue() != null) inicioServicio.tamanioFuente(t.getValue());
        });

        barraSecundaria.getChildren().addAll(
                f, t,
                crearBoton("Negrita", inicioServicio::negritas),
                crearBoton("Cursiva", inicioServicio::cursiva),
                crearBoton("Subrayada", inicioServicio::subrayado),
                colorPicker,
                crearBoton("Color", inicioServicio::colorFuente),
                crearBoton("Justificado", inicioServicio::justificado),
                crearBoton("Viñetas", inicioServicio::vinetas)
        );
    }

    private void menuArchivo() {
        barraSecundaria.getChildren().clear();
        barraSecundaria.getChildren().addAll(
                crearBoton("Abrir", () -> inicioServicio.abrirDocumento(barraSecundaria.getScene().getWindow())),
                crearBoton("Guardar como", inicioServicio::guardarComo),
                crearBoton("Imprimir", inicioServicio::imprimir),
                crearBoton("Guardar", inicioServicio::guardarDocumento)
        );
    }

    private void menuEditar() {
        barraSecundaria.getChildren().clear();
        barraSecundaria.getChildren().addAll(
                crearBoton("Copiar", inicioServicio::copiar),
                crearBoton("Pegar", inicioServicio::pegar),
                crearBoton("Cortar", inicioServicio::cortar),
                crearBoton("Eliminar", inicioServicio::eliminar),
                crearBoton("Buscar", inicioServicio::buscar),
                crearBoton("Reemplazar", inicioServicio::reemplazar)
        );
    }

    private void menuPresentacion() {
        barraSecundaria.getChildren().clear();
        barraSecundaria.getChildren().addAll(
                crearBoton("Hoja Vertical", () -> inicioServicio.cambiarOrientacion("Vertical")),
                crearBoton("Hoja Horizontal", () -> inicioServicio.cambiarOrientacion("Horizontal")),
                crearBoton("Márgenes Normales", () -> inicioServicio.ajustarMargenes("Normal")),
                crearBoton("Márgenes Estrechos", () -> inicioServicio.ajustarMargenes("Estrecho"))
        );
    }

    private void menuReferencias() {
        barraSecundaria.getChildren().clear();
        barraSecundaria.getChildren().addAll(
                crearBoton("Generar Cita APA", inicioServicio::insertarCitaAPA),
                crearBoton("Índice Automático", inicioServicio::generarIndice),
                crearBoton("Nota al Pie", inicioServicio::insertarNotaAlPie)
        );
    }

    private void menuVista() {
        barraSecundaria.getChildren().clear();
        barraSecundaria.getChildren().addAll(
                crearBoton("Acercar (+)", () -> inicioServicio.aplicarZoom(1.1)),
                crearBoton("Alejar (-)", () -> inicioServicio.aplicarZoom(0.9)),
                crearBoton("Restaurar 100%", () -> inicioServicio.aplicarZoom(1.0)),
                crearBoton("Modo Oscuro", () -> inicioServicio.toggleModoOscuro(barraSecundaria.getScene()))
        );
    }

    private void menuAyuda() {
        barraSecundaria.getChildren().clear();
        barraSecundaria.getChildren().addAll(
                crearBoton("Atajos de Teclado", inicioServicio::mostrarAtajos),
                crearBoton("Acerca de Dhu-Text", inicioServicio::acercaDe)
        );
    }

    private Button crearBoton(String texto, Runnable accion) {
        Button b = new Button(texto);
        b.getStyleClass().add("menu-secundario");
        b.setFocusTraversable(false);
        b.setOnAction(e -> accion.run());
        return b;
    }
}