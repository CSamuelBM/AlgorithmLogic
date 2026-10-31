package Escuela;

import java.util.Scanner;

public class Logica {
    private static Scanner cs= new Scanner(System.in);
    private static String nombre, edad, sexo;
    private static int opc, i;
    private static boolean bandera;
    private static Alumno ArAlumno[]= new Alumno[1];
    private static Docente ArDocente[]= new Docente[10];
    private static Administrativo ArAdministrativo[]= new Administrativo[10];
    private static Intendente ArIntendente[]= new Intendente[10];
    
    public static void menuAlumno(){
       System.out.println("<----- Menu Alumno ----->");  
        String num_Control, carrera, especialidad, semestre, horario;
        Alumno ObAlumno;
        
        do{
            opc= Menu.Menu();
          switch(opc){
                     case Constante.Registrar:
                            if(Constante.Pos_Alumno< ArAlumno.length){
                                System.out.println("Nombre");
                                  nombre= cs.next();
                                System.out.println("Edad");
                                  edad= cs.next();
                                System.out.println("Sexo");
                                  sexo= cs.next();
                                System.out.println("Numero De Control");
                                  num_Control= cs.next(); 
                                 carrera= Lista.opcCarrera();
                                 especialidad= Lista.opcEspecialidad();
                                System.out.println("Semestre");
                                  semestre= cs.next();
                                 horario= Lista.opcHorario();
                                ObAlumno=new Alumno(nombre, edad, sexo, num_Control, carrera, especialidad, semestre, horario); 
                                ArAlumno[Constante.Pos_Alumno]= ObAlumno;
                                 Constante.Pos_Alumno ++;
                            }else{
                                System.out.println("Maximo De Registros");
                            }
                        break;
                        
                        case Constante.Mostrar:
                            if(Constante.Pos_Alumno== 0){
                                System.out.println("No Hay Registro");
                                 break;
                            }else{
                                for(i= 0; i< Constante.Pos_Alumno; i++){
                                    System.out.println("Nombre: "+ ArAlumno[i].getNombre());
                                    System.out.println("Edad: "+ ArAlumno[i].getEdad()+" Anios");
                                    System.out.println("Sexo: "+ ArAlumno[i].getSexo());
                                    System.out.println("Numero De Control: "+ ArAlumno[i].getNum_Control());
                                    System.out.println("Carrera: "+ ArAlumno[i].getCarrera());
                                    System.out.println("Especialidad: "+ ArAlumno[i].getEspecialidad());
                                    System.out.println("Semestre: "+ ArAlumno[i].getSemestre()+" Semestre");
                                    System.out.println("Horario: "+ ArAlumno[i].getHorario()+" Hrs");
                                }
                            }
                        break;
                        
                        case Constante.Buscar:
                            if(Constante.Pos_Alumno== 0){
                                System.out.println("No Hay Registro");
                                 break;
                            }else {
                                System.out.println("Numero De Control");
                                 num_Control= cs.next();
                                bandera= false; 
                                for(i= 0; i< Constante.Pos_Alumno; i++){ 
                                if(num_Control.equals(ArAlumno[i].getNum_Control())){
                                    bandera= true;
                                     break;
                                } 
                              }
                                if(bandera== true){
                                    System.out.println("Se Encontro A: "+ num_Control);
                                }else{
                                    System.out.println("No Se Encontro A: "+ num_Control);
                                }
                            }
                        break;
                        
                        case Constante.Actualizar:
                             if(Constante.Pos_Alumno== 0){
                                 System.out.println("No Hay Registro");
                                  break;
                             }else {
                                System.out.println("Numero De Control");
                                  num_Control= cs.next();
                                 bandera= false;
                                for(i= 0; i< Constante.Pos_Alumno; i++){
                                    if(num_Control.equals(ArAlumno[i].getNum_Control())){
                                        bandera= true;
                                      System.out.println("Nombre A Actualizar");
                                         nombre= cs.next();
                                       ArAlumno[i].setNombre(nombre);
                                    }
                                }
                                if(bandera== true){
                                    System.out.println("Se Actualizo A: "+ num_Control);
                                }else{
                                    System.out.println("No Se Actualizo A: "+ num_Control);
                                }
                             }    
                        break;
                            
                       case Constante.Salir:
                            System.out.println("Saliendo");
                              break;
                        default:
                            System.out.println("Opcion No Valida");
                    } 
                 
            }while(opc!= 5);        
    }
    
    public static void menuDocente(){
       System.out.println("<----- Menu Docente ----->");     
        String id_Docente, academia, horario, especialidad;
        Docente ObDocente;
        
        do{
            opc= Menu.Menu();
           switch(opc){
               case Constante.Registrar:
                 if(Constante.Pos_Docente< ArDocente.length){ 
                   System.out.println("Nombre");
                    nombre= cs.next();
                   System.out.println("Edad");
                    edad= cs.next();
                   System.out.println("Sexo");
                    sexo= cs.next();
                   System.out.println("Numero De Control");
                    id_Docente= cs.next();
                   academia= Lista.opcAcademia();
                   horario= Lista.opcHorario();
                   especialidad= Lista.Especialidad();
                  ObDocente= new Docente(nombre, edad, sexo, id_Docente, academia, horario, especialidad);
                  ArDocente[Constante.Pos_Docente]= ObDocente;
                   Constante.Pos_Docente ++;
                 }else{
                     System.out.println("Maximo De Registros");
                 }
                 break;
                 
               case Constante.Mostrar:
                   if(Constante.Pos_Docente== 0){
                       System.out.println("No Hay Registro");
                        break;
                   }else{
                   for(i= 0; i< Constante.Pos_Docente; i++){
                       System.out.println("Nombre: "+ ArDocente[i].getNombre());
                       System.out.println("Edad: "+ ArDocente[i].getEdad());
                       System.out.println("Sexo: "+ ArDocente[i].getSexo());
                       System.out.println("Identificador: "+ ArDocente[i].getId_Docente());
                       System.out.println("Academia: "+ ArDocente[i].getAcademia());
                       System.out.println("Horario: "+ ArDocente[i].getHorario());
                       System.out.println("Especialidad: "+ ArDocente[i].getEspecialidad());
                   }
                  } 
                 break;
                 
               case Constante.Buscar:
                   if(Constante.Pos_Docente== 0){
                       System.out.println("No Hay Registro");
                        break;
                   }else{
                       System.out.println("Numero De Control");
                        id_Docente= cs.next();
                       bandera= false;
                       for(i= 0; i< Constante.Pos_Docente; i++){
                           if(id_Docente.equals(ArDocente[i].getId_Docente())){
                               bandera= true;
                                break;
                           }
                       }
                        if(bandera== true){
                            System.out.println("Se Encontro A: "+ id_Docente);
                        }else{
                            System.out.println("No Se Encontro A: "+ id_Docente);
                        }
                   }  
                 break;
                 
               case Constante.Actualizar:
                   if(Constante.Pos_Docente== 0){
                       System.out.println("No Hay Registro");
                        break;
                   }else{
                       System.out.println("Numero De Control");
                        id_Docente= cs.next();
                       bandera= false;
                        for(i= 0; i< Constante.Pos_Docente; i++){
                            if(id_Docente.equals(ArDocente[i].getId_Docente())){
                                bandera= true;
                               System.out.println("Nombre A Actualizar");
                                nombre= cs.next();
                               ArDocente[i].setNombre(nombre);
                            }
                        }
                         if(bandera== true){
                             System.out.println("Se Actualizo A: "+ id_Docente);
                         }else{
                             System.out.println("No Se Actualizo A: "+ id_Docente);
                         }
                   }
                   
               case Constante.Salir:
                   System.out.println("Saliendo");
                 break;
               default:
                   System.out.println("Opcion No Valida");
           } 
        }while(opc!= 5);
    }
    
    public static void menuAdministrativo(){
       System.out.println("<----- Menu Administrativo ----->");    
       String id_Administrativo, area, funcion, jefe;
       Administrativo ObAdministrativo;
       
       do{
           opc= Menu.Menu();
          switch(opc){
              case Constante.Registrar:
                  if(Constante.Pos_Administrativo< ArAdministrativo.length){
                      System.out.println("Nombre");
                       nombre= cs.next();
                      System.out.println("Edad");
                       edad= cs.next();
                      System.out.println("Sexo");
                       sexo= cs.next();
                      System.out.println("Identificador");
                       id_Administrativo= cs.next();
                      System.out.println("Area");
                       area= cs.next();
                      System.out.println("Funcion");
                       funcion= cs.next();
                      System.out.println("Jefe");
                       jefe= cs.next();
                      ObAdministrativo= new Administrativo(nombre, edad, sexo, id_Administrativo, area, funcion, jefe);
                      ArAdministrativo[Constante.Pos_Administrativo]= ObAdministrativo;
                       Constante.Pos_Administrativo ++;
                  }else{
                      System.out.println("Maximo De Registros");
                  }
               break;
                  
              case Constante.Mostrar:
                  if(Constante.Pos_Administrativo== 0){
                      System.out.println("No Hay Registro");
                       break;
                  }else{
                      for(i= 0; i< Constante.Pos_Administrativo; i++){
                          System.out.println("Nombre: "+ ArAdministrativo[i].getNombre());
                          System.out.println("Edad: "+ ArAdministrativo[i].getEdad());
                          System.out.println("Sexo: "+ ArAdministrativo[i].getSexo());
                          System.out.println("Identificador: "+ ArAdministrativo[i].getId_Administrativo());
                          System.out.println("Area: "+ ArAdministrativo[i].getArea());
                          System.out.println("Funcion: "+ ArAdministrativo[i].getFuncion());
                          System.out.println("Jefe: "+ ArAdministrativo[i].getJefe());
                      }
                  }
                break;  
                
              case Constante.Buscar:
                  if(Constante.Pos_Administrativo== 0){
                      System.out.println("No Hay Registro");
                       break;
                  }else{
                      System.out.println("Numero De Control");
                       id_Administrativo= cs.next();
                        bandera= false;
                      for(i= 0; i< Constante.Pos_Administrativo; i++){
                          if(id_Administrativo.equals(ArAdministrativo[i].getId_Administrativo())){
                              bandera= true;
                               break;
                          }
                      }
                       if(bandera== true){
                           System.out.println("Se Encontro A: "+ id_Administrativo);
                       }else{
                           System.out.println("No Se Encontro A: "+ id_Administrativo);
                       }
                  }
                break;  
                  
              case Constante.Actualizar:
                  if(Constante.Pos_Administrativo== 0){
                      System.out.println("No Hay Registro");
                       break;
                  }else{
                      System.out.println("Numero De Control");
                       id_Administrativo= cs.next();
                        bandera= true;
                      for(i= 0; i< Constante.Pos_Administrativo; i++){
                          if(id_Administrativo.equals(ArAdministrativo[i].getId_Administrativo())){
                              bandera= true;
                             System.out.println("Nombre A Actualizar");
                              nombre= cs.next();
                            ArAdministrativo[i].setNombre(nombre);
                          }
                      }
                       if(bandera== true){
                            System.out.println("Se Actualizo A: "+ id_Administrativo);
                        }else{
                            System.out.println("No Se Actualizo A: "+ id_Administrativo);
                        }
                  }
                break;
                
              case Constante.Salir:
                   System.out.println("Saliendo");
                 break;
              default:
                  System.out.println("Opcion No Valida");
          } 
       }while(opc!= 5);
    }
    
    public static void menuIntendente(){
       System.out.println("<----- Menu Intendente ----->");   
       String id_Intendente, area, uso_Producto;
       Intendente ObIntendente;
       
       do{
           opc= Menu.Menu();
          switch(opc){
              case Constante.Registrar:
                  if(Constante.Pos_Intendente< ArIntendente.length){
                       System.out.println("Nombre");
                       nombre= cs.next();
                       System.out.println("Edad");
                        edad= cs.next();
                       System.out.println("Sexo");
                        sexo= cs.next();
                       System.out.println("Identificador");
                        id_Intendente= cs.next();
                       System.out.println("Area");
                        area= cs.next();
                       System.out.println("Uso De Productos");
                        uso_Producto= cs.next();
                       ObIntendente= new Intendente(nombre, edad, sexo, id_Intendente, area, uso_Producto); 
                       ArIntendente[Constante.Pos_Intendente]= ObIntendente;
                        Constante.Pos_Intendente ++;
                  }else{
                      System.out.println("Maxio De Registro");
                  }
                break;
                  
              case Constante.Mostrar:
                  if(Constante.Pos_Intendente== 0){
                      System.out.println("No Hay Registro");
                       break;
                  }else{
                      for(i= 0; i< Constante.Pos_Intendente; i++){
                          System.out.println("Nombre: "+ ArIntendente[i].getNombre());
                          System.out.println("Edad: "+ ArIntendente[i].getEdad());
                          System.out.println("Sexo: "+ ArIntendente[i].getSexo());
                          System.out.println("Identificador: "+ ArIntendente[i].getId_Intendente());
                          System.out.println("Area: "+ ArIntendente[i].getArea());
                          System.out.println("Uso De Productos"+ ArIntendente[i].getUso_Producto());
                      }
                  }
                break;
                
              case Constante.Buscar:
                  if(Constante.Pos_Intendente== 0){
                      System.out.println("No Hay Registro");
                       break;
                  }else{
                      System.out.println("Numero De Control");
                       id_Intendente= cs.next(); 
                        bandera= false;
                      for(i= 0; i< Constante.Pos_Intendente; i++){
                          if(id_Intendente.equals(ArIntendente[i].getId_Intendente())){
                              bandera= true;
                               break;
                          }
                      }
                       if(bandera== true){
                           System.out.println("Se Encontro A: "+ id_Intendente);
                       }else{
                           System.out.println("No Se Encontro A: "+ id_Intendente);
                       }
                  }
                break;
                
              case Constante.Actualizar:
                  if(Constante.Pos_Intendente== 0){
                      System.out.println("No Hay Registro");
                       break;
                  }else{
                      System.out.println("Numero De Control");
                       id_Intendente= cs.next();
                        bandera= false;
                      for(i= 0; i< Constante.Pos_Intendente; i++){
                          if(id_Intendente.equals(ArIntendente[i].getId_Intendente())){
                              bandera= true;
                             System.out.println("Nombre A Actualizar");
                              nombre= cs.next();
                             ArIntendente[i].setNombre(nombre); 
                          }
                      }
                       if(bandera== true){
                           System.out.println("Se Actualizo A: "+ id_Intendente);
                       }else{
                           System.out.println("No Se Actualizo A: "+ id_Intendente);
                       }
                  }
                break;
               
              case Constante.Salir:
                  System.out.println("Saliendo");
                break;
              default:
                  System.out.println("Opcion No Valida");
          } 
       }while(opc!= 5);
    }
    
}
