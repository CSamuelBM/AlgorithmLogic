package Servicios;

import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import org.fxmisc.richtext.InlineCssTextArea;
import javafx.scene.control.IndexRange;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;

public class InicioServicio {

    private Node nodoActual;
    private ColorPicker selectorColor;
    private boolean esModoOscuro = false;

    public void setNodoActual(Node nodo) {
        this.nodoActual = nodo;
    }

    public void setSelectorColor(ColorPicker picker) {
        this.selectorColor = picker;
    }

    // --- MÓDULO: MODO OSCURO ---
    public void toggleModoOscuro(Scene scene) {
        if (scene == null) return;
        esModoOscuro = !esModoOscuro;

        if (esModoOscuro) {
            scene.getRoot().setStyle("-fx-base: #2b2b2b; -fx-control-inner-background: #3c3f41;");
            System.out.println("Modo nocturno activado.");
        } else {
            scene.getRoot().setStyle("");
            System.out.println("Modo nocturno desactivado.");
        }
    }

    // --- MÓDULO: ÍNDICE AUTOMÁTICO ---
    public void generarIndice() {
        VBox espacio = buscarContenedorPrincipal();
        if (espacio == null) return;

        StringBuilder indice = new StringBuilder("--- ÍNDICE AUTOMÁTICO ---\n\n");
        int contador = 1;

        for (Node hoja : espacio.getChildren()) {
            if (hoja instanceof AnchorPane) {
                InlineCssTextArea lienzo = (InlineCssTextArea) ((AnchorPane) hoja).getChildren().get(0);

                for (int i = 0; i < lienzo.getParagraphs().size(); i++) {
                    String estilo = lienzo.getStyleOfChar(lienzo.getAbsolutePosition(i, 0));
                    if (estilo != null && estilo.contains("-fx-font-size: 22px")) {
                        indice.append(contador).append(". ").append(lienzo.getParagraph(i).getText()).append("\n");
                        contador++;
                    }
                }
            }
        }

        if (espacio.getChildren().get(0) instanceof AnchorPane) {
            InlineCssTextArea primeraHoja = (InlineCssTextArea) ((AnchorPane) espacio.getChildren().get(0)).getChildren().get(0);
            primeraHoja.insertText(0, indice.toString() + "\n------------------------\n\n");
        }
    }

    // --- MÓDULO: NOTA AL PIE ---
    public void insertarNotaAlPie() {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        InlineCssTextArea area = (InlineCssTextArea) nodoActual;

        TextInputDialog d = new TextInputDialog();
        d.setTitle("Nota al Pie");
        d.setHeaderText("Contenido de la referencia");

        d.showAndWait().ifPresent(contenido -> {
            area.insertText(area.getCaretPosition(), "[*]");

            AnchorPane hoja = (AnchorPane) area.getParent();
            Label nota = new Label("* " + contenido);
            nota.setStyle("-fx-font-size: 9px; -fx-text-fill: gray;");

            AnchorPane.setBottomAnchor(nota, 20.0);
            AnchorPane.setLeftAnchor(nota, 60.0);
            hoja.getChildren().add(nota);
        });
    }

    // --- MÓDULO: ESTILOS CSS ---
    private void aplicarEstiloSeleccion(String propiedad, String nuevoValor) {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        InlineCssTextArea area = (InlineCssTextArea) nodoActual;
        IndexRange seleccion = area.getSelection();
        if (seleccion.getLength() == 0) return;

        String estiloOriginal = area.getStyleOfChar(seleccion.getStart());
        StringBuilder nuevoEstilo = new StringBuilder();
        boolean propiedadExistente = false;

        if (estiloOriginal != null && !estiloOriginal.isEmpty()) {
            String[] reglas = estiloOriginal.split(";");
            for (String regla : reglas) {
                if (regla.trim().startsWith(propiedad)) {
                    if (!nuevoValor.equals("normal") && !nuevoValor.equals("false")) {
                        nuevoEstilo.append(propiedad).append(": ").append(nuevoValor).append("; ");
                    }
                    propiedadExistente = true;
                } else if (!regla.trim().isEmpty()) {
                    nuevoEstilo.append(regla.trim()).append("; ");
                }
            }
        }
        if (!propiedadExistente && !nuevoValor.equals("normal") && !nuevoValor.equals("false")) {
            nuevoEstilo.append(propiedad).append(": ").append(nuevoValor).append("; ");
        }
        area.setStyle(seleccion.getStart(), seleccion.getEnd(), nuevoEstilo.toString());
    }

    // --- SECCIÓN: FUENTE ---
    public void tipoFuente(String familia) {
        aplicarEstiloSeleccion("-fx-font-family", "'" + familia + "'");
    }

    public void tamanioFuente(int tamanio) {
        aplicarEstiloSeleccion("-fx-font-size", tamanio + "px");
    }

    public void negritas() {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        InlineCssTextArea area = (InlineCssTextArea) nodoActual;
        if (area.getSelection().getLength() == 0) return;
        String estilo = area.getStyleOfChar(area.getSelection().getStart());
        boolean esNegrita = estilo != null && estilo.contains("-fx-font-weight: bold");
        aplicarEstiloSeleccion("-fx-font-weight", esNegrita ? "normal" : "bold");
    }

    public void cursiva() {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        InlineCssTextArea area = (InlineCssTextArea) nodoActual;
        if (area.getSelection().getLength() == 0) return;
        String estilo = area.getStyleOfChar(area.getSelection().getStart());
        boolean esCursiva = estilo != null && estilo.contains("-fx-font-style: italic");
        aplicarEstiloSeleccion("-fx-font-style", esCursiva ? "normal" : "italic");
    }

    public void subrayado() {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        InlineCssTextArea area = (InlineCssTextArea) nodoActual;
        if (area.getSelection().getLength() == 0) return;
        String estilo = area.getStyleOfChar(area.getSelection().getStart());
        boolean esSubrayado = estilo != null && estilo.contains("-fx-underline: true");
        aplicarEstiloSeleccion("-fx-underline", esSubrayado ? "false" : "true");
    }

    public void colorFuente() {
        if (selectorColor == null) return;
        Color c = selectorColor.getValue();
        String hex = String.format("#%02X%02X%02X", (int)(c.getRed()*255), (int)(c.getGreen()*255), (int)(c.getBlue()*255));
        aplicarEstiloSeleccion("-fx-fill", hex);
    }

    public void justificado() {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        InlineCssTextArea area = (InlineCssTextArea) nodoActual;
        area.setParagraphStyle(area.getCurrentParagraph(), "-fx-text-alignment: justify;");
    }

    public void vinetas() {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        InlineCssTextArea area = (InlineCssTextArea) nodoActual;
        int parrafoActual = area.getCurrentParagraph();
        area.insertText(area.getAbsolutePosition(parrafoActual, 0), "• ");
    }

    // --- SECCIÓN: EDICIÓN ---
    public void copiar() {
        if (nodoActual instanceof InlineCssTextArea) ((InlineCssTextArea) nodoActual).copy();
    }

    public void pegar() {
        if (nodoActual instanceof InlineCssTextArea) ((InlineCssTextArea) nodoActual).paste();
    }

    public void cortar() {
        if (nodoActual instanceof InlineCssTextArea) ((InlineCssTextArea) nodoActual).cut();
    }

    public void eliminar() {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        InlineCssTextArea area = (InlineCssTextArea) nodoActual;
        if (area.getSelection().getLength() > 0) area.deleteText(area.getSelection());
    }

    public void buscar() {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        InlineCssTextArea area = (InlineCssTextArea) nodoActual;
        TextInputDialog d = new TextInputDialog();
        d.setTitle("Buscar");
        d.setHeaderText("Módulo de Búsqueda");
        d.setContentText("Palabra a localizar:");

        d.showAndWait().ifPresent(s -> {
            int i = area.getText().indexOf(s);
            if (i != -1) {
                area.selectRange(i, i + s.length());
                area.requestFollowCaret();
            }
        });
    }

    public void reemplazar() {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        InlineCssTextArea area = (InlineCssTextArea) nodoActual;
        TextInputDialog d1 = new TextInputDialog();
        d1.setTitle("Reemplazar");
        d1.setHeaderText("Fase 1: Búsqueda");
        d1.setContentText("Palabra original:");

        d1.showAndWait().ifPresent(busqueda -> {
            TextInputDialog d2 = new TextInputDialog();
            d2.setTitle("Reemplazar");
            d2.setHeaderText("Fase 2: Sustitución");
            d2.setContentText("Reemplazar con:");

            d2.showAndWait().ifPresent(reemplazo -> {
                int i = area.getText().indexOf(busqueda);
                if (i != -1) area.replaceText(i, i + busqueda.length(), reemplazo);
            });
        });
    }

    // --- SECCIÓN: PRESENTACIÓN ---
    public void cambiarOrientacion(String orientacion) {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        Node hoja = nodoActual.getParent();
        if (hoja instanceof AnchorPane) {
            InlineCssTextArea lienzo = (InlineCssTextArea) nodoActual;
            if (orientacion.equals("Horizontal")) {
                ((AnchorPane) hoja).setPrefSize(1123, 794);
                lienzo.setPrefSize(1123, 670);
            } else {
                ((AnchorPane) hoja).setPrefSize(794, 1123);
                lienzo.setPrefSize(794, 1000);
            }
        }
    }

    public void ajustarMargenes(String tipo) {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        InlineCssTextArea area = (InlineCssTextArea) nodoActual;
        if (tipo.equals("Estrecho")) {
            area.setStyle("-fx-padding: 10;");
        } else if (tipo.equals("Ancho")) {
            area.setStyle("-fx-padding: 50;");
        } else {
            area.setStyle("-fx-padding: 25 35 25 35;");
        }
    }

    // --- SECCIÓN: REFERENCIAS ---
    public void insertarCitaAPA() {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        InlineCssTextArea area = (InlineCssTextArea) nodoActual;
        TextInputDialog dAutor = new TextInputDialog();
        dAutor.setTitle("Cita APA");
        dAutor.setHeaderText("Autor (Ej. Apellido, N.)");

        dAutor.showAndWait().ifPresent(autor -> {
            TextInputDialog dAnio = new TextInputDialog();
            dAnio.setTitle("Cita APA");
            dAnio.setHeaderText("Año de publicación");

            dAnio.showAndWait().ifPresent(anio -> {
                TextInputDialog dTitulo = new TextInputDialog();
                dTitulo.setTitle("Cita APA");
                dTitulo.setHeaderText("Título de la obra");

                dTitulo.showAndWait().ifPresent(titulo -> {
                    area.insertText(area.getCaretPosition(), String.format("(%s, %s. %s)", autor, anio, titulo));
                });
            });
        });
    }

    // --- SECCIÓN: VISTA ---
    public void aplicarZoom(double factor) {
        if (!(nodoActual instanceof InlineCssTextArea)) return;
        Node hoja = nodoActual.getParent();
        if (hoja != null) {
            if (factor == 1.0) {
                hoja.setScaleX(0.9);
                hoja.setScaleY(0.9);
            } else {
                hoja.setScaleX(hoja.getScaleX() * factor);
                hoja.setScaleY(hoja.getScaleY() * factor);
            }
        }
    }

    // --- SECCIÓN: AYUDA ---
    public void mostrarAtajos() {
        mostrarAlerta("Atajos de Teclado", "Ctrl+C : Copiar\nCtrl+V : Pegar\nCtrl+X : Cortar", Alert.AlertType.INFORMATION);
    }

    public void acercaDe() {
        mostrarAlerta("Acerca de", "Dhu-Text v1.0\nProcesador de texto avanzado con soporte RichTextFX.", Alert.AlertType.INFORMATION);
    }

    // --- SECCIÓN: ARCHIVO ---
    public void abrirDocumento(Window ventana) {
        FileChooser selector = new FileChooser();
        selector.setTitle("Abrir - Dhu-Text");
        selector.getExtensionFilters().add(new FileChooser.ExtensionFilter("Texto", "*.txt"));
        File archivo = selector.showOpenDialog(ventana);

        if (archivo != null) {
            try {
                String contenido = new String(Files.readAllBytes(archivo.toPath()));
                InlineCssTextArea lienzoActivo = (nodoActual instanceof InlineCssTextArea) ?
                        (InlineCssTextArea) nodoActual : buscarPrimerLienzo(ventana.getScene().getRoot());

                if (lienzoActivo != null) {
                    lienzoActivo.replaceText(contenido);
                    lienzoActivo.requestFocus();
                    setNodoActual(lienzoActivo);
                }
            } catch (Exception e) {
                mostrarAlerta("Error", "Fallo de lectura.", Alert.AlertType.ERROR);
            }
        }
    }

    public void guardarDocumento() {
        ejecutarGuardado("Guardar");
    }

    public void guardarComo() {
        ejecutarGuardado("Guardar como");
    }

    private void ejecutarGuardado(String titulo) {
        if (nodoActual == null) return;
        FileChooser sc = new FileChooser();
        sc.setTitle(titulo + " - Dhu-Text");
        sc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Texto", "*.txt"));
        File f = sc.showSaveDialog(nodoActual.getScene().getWindow());
        if (f != null) {
            try (FileWriter w = new FileWriter(f)) {
                VBox espacio = buscarContenedorPrincipal();
                if (espacio != null) {
                    for (Node h : espacio.getChildren()) {
                        if (h instanceof AnchorPane) {
                            InlineCssTextArea l = (InlineCssTextArea) ((AnchorPane) h).getChildren().get(0);
                            w.write(l.getText() + "\n");
                        }
                    }
                } else {
                    w.write(((InlineCssTextArea) nodoActual).getText());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void imprimir() {
        if (nodoActual == null) return;
        PrinterJob job = PrinterJob.createPrinterJob();
        if (job != null && job.showPrintDialog(nodoActual.getScene().getWindow())) {
            if (job.printPage(nodoActual)) job.endJob();
        }
    }

    // --- AUXILIARES ---
    private VBox buscarContenedorPrincipal() {
        Node t = nodoActual;
        while (t != null) {
            if (t instanceof VBox) return (VBox) t;
            t = t.getParent();
        }
        return null;
    }

    private InlineCssTextArea buscarPrimerLienzo(Node nodo) {
        if (nodo instanceof InlineCssTextArea) return (InlineCssTextArea) nodo;
        if (nodo instanceof Parent) {
            for (Node h : ((Parent) nodo).getChildrenUnmodifiable()) {
                InlineCssTextArea e = buscarPrimerLienzo(h);
                if (e != null) return e;
            }
        }
        return null;
    }

    private void mostrarAlerta(String titulo, String contenido, Alert.AlertType tipo) {
        Alert a = new Alert(tipo);
        a.setTitle(titulo);
        a.setHeaderText(null);
        a.setContentText(contenido);
        a.showAndWait();
    }
}