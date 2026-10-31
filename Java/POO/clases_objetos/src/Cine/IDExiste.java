package Cine;

public class IdExiste {
    public static boolean ExisteIdCl(int id_Cliente, Cliente[] ArCliente) {
        for (Cliente c : ArCliente) {
            if (c != null&& c.getId_Cliente()== id_Cliente) {
                return true;
            }
        }
        return false;
    }
    public static int ValidarIdCl(java.util.Scanner cs, Cliente[] ArCliente){
        int id_Cliente;
         do{
             Util.print("Identificador");
              id_Cliente= cs.nextInt();
             if(ExisteIdCl(id_Cliente, ArCliente)){
                 Util.print("Ya Existe El Identificador");
             } 
         }while(ExisteIdCl(id_Cliente, ArCliente));
           return id_Cliente;
    }
    
    public static boolean ExisteIdPe(int id_Pelicula, Pelicula[] ArPelicula){
        for(Pelicula p : ArPelicula){
            if(p!= null&& p.getId_Pelicula()== id_Pelicula){
                return true;
            }
        }
         return false;
    }
    public static int ValidarIdPe(java.util.Scanner cs, Pelicula[] ArPelicula){
        int id_Pelicula;
         do{
             Util.print("Identificador");
              id_Pelicula= cs.nextInt();
             if(ExisteIdPe(id_Pelicula, ArPelicula)){
                 Util.print("Ys Existe El Identificador");
             }
         }while(ExisteIdPe(id_Pelicula, ArPelicula));
           return id_Pelicula;
    }
    
    public static boolean ExisteIdPr(int id_Producto, Producto[] ArProducto){
        for(Producto P : ArProducto){
            if(P!= null&& P.getId_Producto()== id_Producto){
                return true;
            }
        }
         return false;
    }
    public static int ValidarIdPr(java.util.Scanner cs, Producto[] ArProducto){
        int id_Producto;
         do{
             Util.print("Identificador");
              id_Producto= cs.nextInt();
             if(ExisteIdPr(id_Producto, ArProducto)){
                 return id_Producto;
             } 
         }while(ExisteIdPr(id_Producto, ArProducto));
          return id_Producto;
    }
    
    public static boolean ExisteIdT(int id_Trabajador, Trabajador[] ArTrabajador){
        for(Trabajador t : ArTrabajador){
            if(t!= null&& t.getId_Trabajador()== id_Trabajador){
                return true;
            }
        }
         return false;
    }
    public static int ValidarIdT(java.util.Scanner cs, Trabajador[] ArTrabajador){
        int id_Trabajador;
         do{
             Util.print("Identificador");
              id_Trabajador= cs.nextInt();
             if(ExisteIdT(id_Trabajador, ArTrabajador)){
                 return id_Trabajador;
             } 
         }while(ExisteIdT(id_Trabajador, ArTrabajador));
          return id_Trabajador;
    }
    
    public static boolean ExisteIdCa(int id_Cartelera, Cartelera[] ArCartelera){
        for(Cartelera C : ArCartelera){
            if(C!= null&& C.getId_Cartelera()== id_Cartelera){
                return true;
            }
        }
         return false;
    }
    public static int ValidarIdCa(java.util.Scanner cs, Cartelera[] ArCartelera){
        int id_Cartelera;
         do{
             Util.print("Identificador");
              id_Cartelera= cs.nextInt();
             if(ExisteIdCa(id_Cartelera, ArCartelera)){
                 return id_Cartelera;
             } 
         }while(ExisteIdCa(id_Cartelera, ArCartelera));
          return id_Cartelera;
    }
    
}
