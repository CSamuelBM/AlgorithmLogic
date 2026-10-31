package Carta;

public class Carta {
    
    private String lugar;
    private String fecha;
    private String remitente;
    private String destinatario;
    private String mensaje;
    
    public Carta(){
        lugar= "";
        fecha= "";
        remitente= "";
        destinatario= "";
        mensaje= "";
    }
    
    public Carta(String lugar, String fecha, String remitente, String destinatario, String mensaje){
        setLugar(lugar);
        setFecha(fecha);
        setRemitente(remitente);
        setDestinatario(destinatario);
        setMensaje(mensaje);
    }
    
    public void setLugar(String lugar){
        if(!lugar.isEmpty())
            this.lugar= lugar;
        else
            System.out.println("Tiene Que Rellenar El Campo Lugar");
    }
    public String getLugar(){
        return lugar;
    }
    
    public void setFecha(String fecha){
        if(!fecha.isEmpty())
            this.fecha= fecha;
        else
            System.out.println("Tiene Que Rellenar El Campo Fecha");
    }
    public String getFecha(){
        return fecha;
    }
    
    public void setRemitente(String remitente){
        if(!remitente.isEmpty())
            this.remitente= remitente;
        else
            System.out.println("Tiene Que Rellenar El Campo Remitente");
    }
    public String getRemitente(){
        return remitente;
    }
    
    public void setDestinatario(String destinatario){
        if(!destinatario.isEmpty())
            this.destinatario= destinatario;
        else
            System.out.println("Tiene Que Rellenar El Campo Destinatario");
    }
    public String getDestinatario(){
        return destinatario;
    }
    
    public void setMensaje(String mensaje){
        if(!mensaje.isEmpty())
            this.mensaje= mensaje;
        else 
            System.out.println("Tienes Que Rellenar El Campo Mensaje");
    }
    public String getMensaje(){
        return mensaje;
    }
    
    @Override
    public String toString(){
        return lugar+ " "+ fecha+ " "+ remitente+ " "+ destinatario+ " "+ mensaje;
    }
    
}
