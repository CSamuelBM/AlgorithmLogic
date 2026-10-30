package org.example.reproductor.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class CancionRepositorioM {

    private static final Path RUTA_CANCION = Paths.get(
            System.getProperty("user.home"), "Downloads", "Canciones.txt"
    );

    public ObservableList<CancionM> cargarCancion(){
        ObservableList<CancionM> observableList = FXCollections.observableArrayList();

        if(!Files.exists(RUTA_CANCION))
            return observableList;

        try (BufferedReader br = Files.newBufferedReader(RUTA_CANCION, StandardCharsets.UTF_8)){
            String linea;
            while ( (linea = br.readLine()) != null ){
                if(linea.isBlank())
                    continue;
                String partes[] = linea.split("(?<!\\\\),", 2);
                if(partes.length == 2){
                    observableList.add(new CancionM(
                            unespace(partes[0].trim()),
                            escape(partes[1].trim())
                    ));
                }

            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return observableList;
    }

    public static void guardarCancion(List<CancionM> listCancion){
        try {
            Files.createDirectories((RUTA_CANCION.getParent()));
            try (BufferedWriter bw = Files.newBufferedWriter(RUTA_CANCION, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)){
                for(CancionM cM : listCancion){
                    bw.write(escape(cM.getNombre()) + "," +escape(cM.getUrl()));
                    bw.newLine();
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private static String escape(String s){
        return s.replace(",", "\\,").replace("\n", " ");
    }
    private static String unespace(String s){
        return s.replace("\\,", ",");
    }

}
