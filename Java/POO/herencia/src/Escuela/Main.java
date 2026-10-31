package Escuela;

public class Main {
    public static void main(String args[]){
        
      //Login
        int opcLp, opcLa;
        
    do{ 
      opcLp= Menu.LoginP();
       switch(opcLp){
           case Constante.Ingresar:
               do{
                   opcLa= Menu.LoginA();
                  switch(opcLa){
                      case Constante.IniciarSesion:
                          Login.login();
                        break;
                      case Constante.CerrarSesion:
                           System.out.println("Sesion Cerrada");
                        break;
                      default:
                          System.out.println("Opcion No Valida");
                  } 
               }while(opcLa!= 2);
                break;
                
           case Constante.Cerrar:
               System.out.println("Se Cerro");
            break;
            
           default:
               System.out.println("Opcion No Valida");
       }
        
    }while(opcLp!= 2);
    
  }
}
