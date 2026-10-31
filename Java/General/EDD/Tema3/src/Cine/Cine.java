package Cine;

public class Cine implements Comparable<Cine>{
    
    private String nombrePelicula, dia, horaInicio, horaFinal;
    private double precio;
    
    public Cine(){
        nombrePelicula= "";
        dia= "";
        horaInicio= "";
        horaFinal= "";
        precio= 0;
    }
    public Cine(String nombrePelicula, String dia, String horaInicio, String horaFinal, double precio){
        setNombrePelicula(nombrePelicula);
        setDia(dia);
        setHoraInicio(horaInicio);
        setHoraFinal(horaFinal);
        setPrecio(precio);
    }
    
    public void setNombrePelicula(String nombrePelicula){
        if(!nombrePelicula.isEmpty())
            this.nombrePelicula= nombrePelicula;
        else
            System.out.println("Error En Nombre De Pelicula");
    }
    public String getNombrePelicula(){
        return nombrePelicula;
    }
    
    public void setDia(String dia){
        if(!dia.isEmpty())
            this.dia= dia;
        else 
            System.out.println("Error En El Dia");
    }
    public String getDia(){
        return dia;
    }
    
    public void setHoraInicio(String horaInicio){
        if(!horaInicio.isEmpty())
            this.horaInicio= horaInicio;
        else 
            System.out.println("Error En La Hora De Inicio");
    }
    public String getHoraInicio(){
        return horaInicio;
    }
    
    public void setHoraFinal(String horaFinal){
        if(!horaFinal.isEmpty())
            this.horaFinal= horaFinal;
        else 
            System.out.println("Error En La Hora Final");
    }
    public String getHoraFinal(){
        return horaFinal;
    }
    
    public void setPrecio(double precio){
        if(precio>= 0)
            this.precio= precio;
        else
            System.out.println("Error En El Precio");
    }
    public double getPrecio(){
        return precio;
    }
    
    @Override
      public String toString(){
          return nombrePelicula+ " "+ dia+ " "+ horaInicio+ " "+ horaFinal+ " "+ precio;
      }

    @Override
    public int compareTo(Cine otro) {
        return Double.compare(this.precio, otro.precio);
    }
    
}
