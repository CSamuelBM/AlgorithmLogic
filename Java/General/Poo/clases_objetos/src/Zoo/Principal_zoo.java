package Zoo;
   
import java.util.Scanner;

public class Principal_zoo {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        //Especie
         String descripcion, habitat, zona, nom_Cientifico, nombre;
        //Habitat 
         String clima, vegetacion, continente;
        //Zona 
         int num_Especie, extencion;
        //Itinerario 
         int codigo, tim_Recorrido, tamaño, num_Visitantes;
        //Guia  
         String direccion, fecha, itinerario;
        //Cuidador  
         int telefono;
           
          int Opc= 0, opc= 0, pos= 0, i;
          boolean bandera= false;
          
          //Objetos y Arreglos
          Especie objEspecie;
          Especie arrEspecie[]= new Especie[50];
          
          Habitat objHabitat;
          Habitat arrHabitat[]= new Habitat[20];
          
          Zona objZona;
          Zona arrZona[]= new Zona[20];
          
          Itinerario objItinerario;
          Itinerario arrItinerario[]= new Itinerario[30];
          
          Guia objGuia;
          Guia arrGuia[]= new Guia[20];
          
          Cuidador objCuidador;
          Cuidador arrCuidador[]= new Cuidador[20];
          
          do{
             System.out.println("Opciones ZOO"); 
              System.out.println("1.- Especie");
              System.out.println("2.- Habitat");
              System.out.println("3.- Zona");
              System.out.println("4.- Itinerario");
              System.out.println("5.- Guia");
              System.out.println("6.- Cuidador");
              System.out.println("7.- Salir");
               Opc= cs.nextInt();
            switch(Opc){
                case 1:
                    do{
                        System.out.println("Especie");
                         System.out.println("1.- Registrar");
                         System.out.println("2.- Mostrar");
                         System.out.println("3.- Buscar");
                         System.out.println("4.- Actualizar Habitat");
                         System.out.println("5.- Volver");
                          opc= cs.nextInt();
                        switch(opc){
                            case 1:
                                System.out.println("Nombre");
                                 nombre= cs.next();
                                System.out.println("Nombre Cientifico");
                                 nom_Cientifico= cs.next();
                                System.out.println("Descripcion");
                                 descripcion= cs.next();
                                System.out.println("Habitat");
                                 habitat= cs.next();
                                System.out.println("Zona");
                                 zona= cs.next();
                                objEspecie= new Especie(nombre, nom_Cientifico, descripcion, habitat, zona);
                               arrEspecie[pos]= objEspecie;
                                pos++;
                               break;
                               
                            case 2:
                                for(i= 0; i< pos; i++){
                                    System.out.println("Nombre: "+ arrEspecie[i].getNombre());
                                    System.out.println("Nombre Cientifico: "+ arrEspecie[i].getNom_Cientifico());
                                    System.out.println("Descripcion: "+ arrEspecie[i].getDescripcion());
                                    System.out.println("Habitat: "+ arrEspecie[i].getHabitat());
                                    System.out.println("Zona: "+ arrEspecie[i].getZona());
                                }
                               break;
                            case 3:
                                System.out.println("Especie A Buscar");
                                 nombre= cs.next();
                                for(i= 0; i< pos; i++){
                                    if(nombre.equals(arrEspecie[i].getNombre())){
                                        bandera= true;
                                         break;
                                    }
                                }
                              if(bandera== true){
                                  System.out.println("Se Encontro: "+ nombre);
                              }else{
                                  System.out.println("No Se Encontro: "+ nombre);
                              }
                               break;
                            case 4:
                                System.out.println("Especie A Buscar");
                                 nombre= cs.next();
                                for(i= 0; i< pos; i++){
                                    if(nombre.equals(arrEspecie[i].getNombre())){
                                        bandera= true;
                                      System.out.println("Habitat a Actualizar");
                                       habitat= cs.next();
                                      arrEspecie[i].setHabitat(habitat);
                                    }
                                }
                               if(bandera== true){
                                   System.out.println("Se Actualizo: "+ nombre);
                               }else{
                                   System.out.println("No Se Actualizo: "+ nombre);
                               }
                                break;
                            case 5:
                                System.out.println("Volviendo");
                                 break;
                            default:
                                System.out.println("Opcion No Valida");
                        }  
                    }while(opc!= 5);
                        break;
                        
                case 2:
                   do{ 
                    System.out.println("Habitat");
                     System.out.println("1.- Registrar");
                     System.out.println("2.- Mostrar");
                     System.out.println("3.- Buscar");
                     System.out.println("4.- Actualizar Clima");
                     System.out.println("5.- Volver");
                       opc= cs.nextInt();
                    switch(opc){
                        case 1:
                            System.out.println("Nombre"); 
                             nombre= cs.next();
                            System.out.println("Clima");
                             clima= cs.next();
                            System.out.println("Vegetacion");
                             vegetacion= cs.next();
                            System.out.println("Continente");
                             continente= cs.next();
                           objHabitat= new Habitat(nombre, clima, vegetacion, continente);
                           arrHabitat[pos]= objHabitat;
                            pos ++;
                        break;
                            
                        case 2:
                            for(i= 0; i< pos; i++){
                                System.out.println("Nombre: "+ arrHabitat[i].getNombre());
                                System.out.println("Clima: "+ arrHabitat[i].getClima());
                                System.out.println("Vegetacion: "+ arrHabitat[i].getVegetacion());
                                System.out.println("Continente: "+ arrHabitat[i].getContinente());
                            }
                        break;
                            
                        case 3:
                            System.out.println("Habitat A Buscar");
                             nombre= cs.next();
                            for(i= 0; i< pos; i++){
                                if(nombre.equals(arrHabitat[i].getNombre())){
                                    bandera= true;
                                   break;
                                }
                            }
                          if(bandera== true){
                             System.out.println("Se Encontro: "+ nombre);
                           }else {
                             System.out.println("No Se Encontro"+ nombre);
                           }
                        break;
                            
                        case 4:
                            System.out.println("Habitat A Buscar");
                             nombre= cs.next();
                            for(i= 0; i< pos; i++){
                                if(nombre.equals(arrHabitat[i].getNombre())){
                                    bandera= true;
                                System.out.println("Clima A Actualizar");
                                  clima= cs.next();
                                 arrHabitat[i].setClima(clima);
                                }
                            }
                           if(bandera== true){
                               System.out.println("Se Encontro: "+ nombre);
                           }else {
                               System.out.println("No Se Encontro: "+ nombre);
                           }
                        break;
                            
                        case 5:
                            System.out.println("Volviendo");
                        break;
                        default:
                            System.out.println("Opcion No Valida");
                    }
                   }while(opc!=5);
                     break;
                     
                case 3:
                    do{
                        System.out.println("Zona");
                         System.out.println("1.- Registrar");
                         System.out.println("2.- Mostrar");
                         System.out.println("3.- Buscar");
                         System.out.println("4.- Actualizar Extencion");
                         System.out.println("5.- Volviendo");
                          opc= cs.nextInt();
                       switch(opc){
                           case 1:
                               System.out.println("Nombre");
                                nombre= cs.next();
                               System.out.println("Numero Especies");
                                num_Especie= cs.nextInt();
                               System.out.println("Extencion");
                                extencion= cs.nextInt();
                              objZona=new Zona(nombre, num_Especie, extencion);  
                              arrZona[pos]= objZona;
                               pos ++;
                            break;
                            
                           case 2:
                               for(i= 0; i< pos; i++){
                                 System.out.println("Nombre: "+ arrZona[i].getNombre());
                                 System.out.println("Numero Especies:"+ arrZona[i].getNum_Especie());
                                 System.out.println("Extencion: "+ arrZona[i].getExtencion());
                               }
                            break;
                            
                           case 3:
                               System.out.println("Zona A Buscar");
                                nombre= cs.next();
                               for(i= 0; i< pos; i++){
                                   if(nombre.equals(arrZona[i].getNombre())){
                                       bandera= true;
                                        break;
                                   }
                               }
                              if(bandera== true){
                                  System.out.println("Se Encontro: "+ nombre);
                              }else {
                                  System.out.println("No Se Encontro: "+ nombre);
                              }
                            break;
                            
                           case 4:
                               System.out.println("Zona A Buscar");
                                nombre= cs.next();
                               for(i= 0; i< pos; i++){
                                   if(nombre.equals(arrZona[i].getNombre())){
                                       bandera= true;
                                    System.out.println("Extencion A Actualizar");
                                     extencion= cs.nextInt();
                                    arrZona[i].setExtencion(extencion);
                                   }
                               }
                              if(bandera== true){
                                  System.out.println("Se Actualizo: "+ nombre);
                              }else {
                                  System.out.println("No Se Actualizo: "+ nombre);
                              }
                            break;
                            
                           case 5:
                               System.out.println("Volviendo");
                            break;
                           default:
                               System.out.println("Opcion No Valida");
                       }   
                    }while(opc!= 5);
                      break;
                      
                case 4:
                    do{
                        System.out.println("Itinerario");
                          System.out.println("1.- Registrar");
                          System.out.println("2.- Mostrar");
                          System.out.println("3.- Buscar");
                          System.out.println("4.- Actualizar Tamaño");
                          System.out.println("5.- Volviendo");
                           opc= cs.nextInt();
                        switch(opc){
                            case 1:
                                System.out.println("Zona");
                                 zona= cs.next();
                                System.out.println("Codigo");
                                 codigo= cs.nextInt();
                                System.out.println("Tiempo Del Recorrido");
                                 tim_Recorrido= cs.nextInt();
                                System.out.println("Tamaño");
                                 tamaño= cs.nextInt();
                                System.out.println("Numero De Visitantes");
                                 num_Visitantes= cs.nextInt();
                                System.out.println("Numero De Especies");
                                 num_Especie= cs.nextInt();
                              objItinerario=new Itinerario(zona, codigo, tim_Recorrido, tamaño, num_Visitantes, num_Especie);
                              arrItinerario[pos]= objItinerario;
                               pos ++;
                            break;
                            
                            case 2:
                                for(i= 0; i< pos; i++){
                                    System.out.println("Zona: "+ arrItinerario[i].getZona());
                                    System.out.println("Codigo: "+ arrItinerario[i].getCodigo());
                                    System.out.println("Tiempo Del Recorrido: "+ arrItinerario[i].getTim_Recorrido());
                                    System.out.println("Tamaño: "+ arrItinerario[i].getTamaño());
                                    System.out.println("Numero De Visitantes: "+ arrItinerario[i].getNum_Visitantes());
                                    System.out.println("Numero De Especies: "+ arrItinerario[i].getNum_Especies());
                                }
                               break;
                               
                            case 3:
                                System.out.println("Zona A Buscar");
                                 zona= cs.next();
                                for(i= 0; i< pos; i++){
                                    if(zona.equals(arrItinerario[i].getZona())){
                                        bandera= true;
                                         break;
                                    }
                                }
                               if(bandera== true){
                                   System.out.println("Se Encontro: "+ zona);
                               }else {
                                   System.out.println("No Se Encontro: "+ zona);
                               }
                            break;
                            
                            case 4:
                                System.out.println("Zona A Buscar");
                                 zona= cs.next();
                                for(i= 0; i< pos; i++){
                                    if(zona.equals(arrItinerario[i].getZona())){
                                        bandera= true;
                                      System.out.println("Tamaño A Actualizar");
                                       tamaño= cs.nextInt();
                                      arrItinerario[i].setTamaño(tamaño);
                                    }
                                } 
                               if(bandera== true){
                                   System.out.println("Se Actualizo: "+ zona);
                               }else {
                                   System.out.println("No Se Actualizo: "+ zona);
                               }
                            break;
                            
                            case 5:
                                System.out.println("Volviendo");
                            break;
                            default :
                                System.out.println("Opcion No Valida");
                        }   
                    }while(opc!= 5);
                      break;
                      
                case 5:
                    do{
                        System.out.println("Guia");
                          System.out.println("1.- Registrar");
                          System.out.println("2.- Mostrar");
                          System.out.println("3.- Buscar");
                          System.out.println("4.- Actualizar Direccion");
                          System.out.println("5.- Volviendo");
                           opc= cs.nextInt();
                      switch(opc){
                          case 1:
                              System.out.println("Nombre");
                               nombre= cs.next();
                              System.out.println("Direccion");
                               direccion= cs.next();
                              System.out.println("Itinerarios");
                               itinerario= cs.next(); 
                              System.out.println("Telefono");
                               telefono= cs.nextInt();
                              System.out.println("Fecha");
                               fecha= cs.next();
                             objGuia=new Guia(nombre, direccion, itinerario, telefono, fecha);
                             arrGuia[pos]= objGuia;
                              pos ++;
                           break;   
                           
                          case 2:
                              for(i= 0; i< pos; i++){
                                  System.out.println("Nombre: "+ arrGuia[i].getNombre());
                                  System.out.println("Direccion: "+ arrGuia[i].getDireccion());
                                  System.out.println("Itinerario: "+ arrGuia[i].getItinerario());
                                  System.out.println("Telefono: "+ arrGuia[i].getTelefono());
                                  System.out.println("Fecha: "+ arrGuia[i].getFecha());
                              }
                           break;
                           
                          case 3:
                              System.out.println("Guia A Buscar");
                               nombre= cs.next();
                              for(i= 0; i< pos; i++){
                                  if(nombre.equals(arrGuia[i].getNombre())){
                                      bandera= true;
                                       break;
                                  }
                              }
                             if(bandera== true){
                                 System.out.println("Se Encontro: "+ nombre);
                             }else {
                                 System.out.println("No Se Encontro: "+ nombre);
                             }
                          break;
                          
                          case 4:
                              System.out.println("Guia A Buscar");
                               nombre= cs.next();
                              for(i= 0; i< pos; i++){
                                  if(nombre.equals(arrGuia[i].getNombre())){
                                      bandera= true;
                                    System.out.println("Direccion A Actualizar");
                                    direccion= cs.next();
                                   arrGuia[i].setDireccion(direccion);
                                  }
                              }
                             if(bandera== true){
                                 System.out.println("Se Actualizo: "+ nombre);
                             }else {
                                 System.out.println("No Se Actualizo: "+ nombre);
                             }
                          break;
                          
                          case 5:
                              System.out.println("Volviendo");
                          break;
                          default:
                              System.out.println("Opcion No Validad");
                       }   
                    }while(opc!= 5);
                     break;
                     
                case 6:
                    do{
                        System.out.println("Cuidador");
                          System.out.println("1.- Registrar");
                          System.out.println("2.- Mostrar");
                          System.out.println("3.- Buscar");
                          System.out.println("4.- Actualizar Telefono");
                          System.out.println("5.- Volviendo");
                           opc= cs.nextInt();
                      switch(opc){
                          case 1:
                              System.out.println("Nombre");
                               nombre= cs.next();
                              System.out.println("Direccion");
                               direccion= cs.next();
                              System.out.println("Telefono");
                               telefono= cs.nextInt();
                              System.out.println("Fecha");
                               fecha= cs.next();
                              System.out.println("Numero De Especies");
                               num_Especie= cs.nextInt();
                             objCuidador= new Cuidador(nombre, direccion, num_Especie, telefono, fecha); 
                             arrCuidador[pos]= objCuidador;
                              pos ++;
                           break;
                           
                         case 2:
                            for(i= 0; i< pos; i++){ 
                              System.out.println("Nombre: "+ arrCuidador[i].getNombre());
                              System.out.println("Direccion: "+ arrCuidador[i].getDireccion());
                              System.out.println("Telefono: "+ arrCuidador[i].getTelefono());
                              System.out.println("Fecha: "+ arrCuidador[i].getFecha());
                              System.out.println("Numero De Especies: "+ arrCuidador[i].getNum_Especie());
                            }
                         break;
                         
                         case 3:
                             System.out.println("Cuidador A Buscar");
                              nombre= cs.next();
                             for(i= 0; i< pos; i++){
                                 if(nombre.equals(arrCuidador[i].getNombre())){
                                     bandera= true;
                                      break;
                                 }
                             }
                            if(bandera== true){
                                System.out.println("Se Encontro: "+ nombre);
                            }else {
                                System.out.println("No Se Encontro: "+ nombre);
                            }
                         break;
                         
                         case 4:
                             System.out.println("Cuidador A Buscar");
                              nombre= cs.next();
                             for(i= 0; i< pos; i++){
                                 if(nombre.equals(arrCuidador[i].getNombre())){
                                     bandera= true;
                                   System.out.println("Telefono A Actualizar");
                                    telefono= cs.nextInt();
                                   arrCuidador[i].setTelefono(telefono);
                                 }
                             } 
                           if(bandera== true){
                               System.out.println("Se Actualizo: "+ nombre);
                           }else {
                               System.out.println("No Se Encontro: "+ nombre);
                           }
                         break;
                         
                         case 5:
                             System.out.println("Volviendo");
                         break;
                         default: 
                             System.out.println("Opcion No Validad");
                      }  
                    }while(opc!= 5);
                      break; 
                      
                case 7:
                    System.out.println("Saliendo");
                break;
            }
          }while(Opc!= 7);
    }
}
