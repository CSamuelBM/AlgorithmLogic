package Examen;

public class Comerciante extends Persona implements Accion{
    
    String proveedor, ciudad;
    
    public Comerciante(){
        proveedor= " ";
        ciudad= " ";
    }
    
    public Comerciante(String nombre, String curp, String proveedor, String ciudad){
        super(nombre, curp); 
        setProveedor(proveedor);
        setCiudad(ciudad);
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
     public void Cobrar(){
         System.out.println("Cobro En Electronico");
     }
     
    @Override
     public void Mostrar(){
         System.out.println("Nombre"+ getNombre());
         System.out.println("Curp"+ getCurp());
         System.out.println("Proveedor"+ getProveedor());
         System.out.println("Ciudad"+ getCiudad());
     }
    
    
}
