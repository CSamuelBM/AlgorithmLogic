package Autobus;

public class Autobus {
    
    private String nombreChofer;
    private String lugarPartida;
    private String lugarLlegada;
    private String horaPartida;
    private String horaLlegada;
    
    public Autobus(){
        nombreChofer= "";
        lugarPartida= "";
        lugarLlegada= "";
        horaPartida= "";
        horaLlegada= "";
    }
     
    public Autobus(String nombreChofer, String lugarPartida, String lugarLlegada, String horaPartida, String horaLlegada){
        setNombreChofer(nombreChofer);
        setLugarPartida(lugarPartida);
        setLugarLlegada(lugarLlegada);
        setHoraPartida(horaPartida);
        setHoraLlegada(horaLlegada);
    }
     
    public void setNombreChofer(String nombreChofer){
        if(!nombreChofer.isEmpty())
            this.nombreChofer= nombreChofer;
        else 
            System.out.println("Hay Error En Nombre Chofer");
    }
    public String getNombreChofer(){
        return nombreChofer;
    }
    
    public void setLugarPartida(String lugarPartida){
        if(!lugarPartida.isEmpty())
            this.lugarPartida= lugarPartida;
        else 
             System.out.println("Hay Error En Lugar De Partida");
    }
    public String getLugarPartida(){
        return lugarPartida;
    }
    
    public void setLugarLlegada(String lugarLlegada){
        if(!lugarLlegada.isEmpty())
            this.lugarLlegada= lugarLlegada;
        else 
            System.out.println("Hay Error En Lugar De Llegada");
    }
    public String getLugarLlegada(){
        return lugarLlegada;
    }
    
    public void setHoraPartida(String horaPartida){
        if(!horaPartida.isEmpty())
            this.horaPartida= horaPartida;
        else 
            System.out.println("Hay Error En Hora De Partida");
    }
    public String getHoraPartida(){
        return horaPartida;
    } 
    
    public void setHoraLlegada(String horaLlegada){
        if(!horaLlegada.isEmpty())
            this.horaLlegada= horaLlegada;
        else 
            System.out.println("Hay Error En Hora De Llegada");
    }
    public String getHoraLlegada(){
        return horaLlegada;
    }
    
    @Override
    public String toString(){
        return nombreChofer+ " "+ lugarPartida+ " "+ lugarLlegada+ " "+ horaPartida+ " "+ horaLlegada;
    }
    
}
