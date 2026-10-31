package Clases20;

public class Animal {
    
    String especie, color, abitad;
    int tamaño;
    
    public Animal(){
        this(" ", " ", " ", 0);
    }
    
    public Animal(String especie, String color, String abitad, int tamaño){
        setEspecie(especie);
        setColor(color);
        setAbitad(abitad);
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getAbitad() {
        return abitad;
    }
    public void setAbitad(String abitad) {
        this.abitad = abitad;
    }

    public int getTamaño() {
        return tamaño;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
}
