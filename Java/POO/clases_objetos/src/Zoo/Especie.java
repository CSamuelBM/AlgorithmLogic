package Zoo;

public class Especie {
    
    String nombre, nom_Cientifico, descripcion, habitat, zona;
    
    public Especie(){
        this(" ", " ", " ", " ", " ");
    }
    
    public Especie(String nombre, String nom_Cientifico, String descripcion, String habitat,String zona){
        setNombre(nombre);
        setNom_Cientifico(nom_Cientifico);
        setDescripcion(descripcion);
        setHabitat(habitat);
        setZona(zona);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getNom_Cientifico(){
        return nom_Cientifico;
    }
    public void setNom_Cientifico(String nom_Cientifico){
        this.nom_Cientifico= nom_Cientifico;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion= descripcion;
    }
    
    public String getHabitat(){
        return habitat;
    }
    public void setHabitat(String habitat){
        this.habitat= habitat;
    }
    
    public String getZona(){
        return zona;
    }
    public void setZona(String zona){
        this.zona= zona;
    }
    
}
