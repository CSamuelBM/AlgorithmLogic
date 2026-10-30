package Servicios;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;

public class Main_Servidor {

    private static final int PUERTO = 5000;
    public static ConcurrentHashMap<Integer, ChatServidor> clientes =
            new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PUERTO);
        System.out.println("Servidor iniciado en puerto " + PUERTO);

        while (true) {
            Socket cliente = serverSocket.accept();
            System.out.println("Cliente conectado desde " +
                    cliente.getInetAddress().getHostAddress());

            new ChatServidor(cliente).start();
        }
    }

}
