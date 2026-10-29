package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.function.Consumer;

public class SocketC implements Runnable{

    private int puerto;
    private String host;

    private Consumer<String> mensajesTexto;
    private DataOutputStream out;

    public SocketC(String host, int puerto, Consumer<String> mensajesTexto){
        this.host = host;
        this.puerto = puerto;
        this.mensajesTexto = mensajesTexto;
    }

    @Override
    public void run() {
        try{
            Socket cliente = new Socket(host, puerto);

            DataInputStream in = new DataInputStream(cliente.getInputStream());

            out = new DataOutputStream(cliente.getOutputStream());

            while(true){
                String mensaje = in.readUTF();
                mensajesTexto.accept("Servidor: "+ mensaje);
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
