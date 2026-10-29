package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class SocketS implements Runnable{

    private Consumer<String> mensajesTexto;
    private int puerto;
    private DataOutputStream out;

    public SocketS(int puerto, Consumer<String> mensajesTexto){
        this.puerto = puerto;
        this.mensajesTexto = mensajesTexto;
    }

    @Override
    public void run() {
        try{
            ServerSocket servidor = new ServerSocket(puerto);
            Socket cliente = servidor.accept();

            DataInputStream in = new DataInputStream(cliente.getInputStream());

            out = new DataOutputStream(cliente.getOutputStream());

            while (true){
                String mensaje = in.readUTF();
                mensajesTexto.accept("Cliente: " + mensaje);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void enviarMensaje(String mensaje){
        try{
            if(out != null)
                out.writeUTF(mensaje);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
