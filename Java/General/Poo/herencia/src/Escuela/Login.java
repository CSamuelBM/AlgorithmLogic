package Escuela;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
    private static Scanner cs= new Scanner(System.in);
    private static Map<String, String[]> usuario= new HashMap<>(); 
     
    public static void login(){
                String user, password, tipUser;
                        usuario.put("Alumno", new String[]{"1", "Alumno"});
                        usuario.put("Docente", new String[]{"12", "Docente"});
                        usuario.put("Administrativo", new String[]{"123", "Administrativo"});
                        usuario.put("Intendente",  new String[]{"1234", "Intendente"});
                          
                         System.out.println("Usuario");
                          user= cs.next();
                         System.out.println("Password");
                          password= cs.next();
                        if(usuario.containsKey(user)&& usuario.get(user)[0].equals(password)){
                            tipUser= usuario.get(user)[1];
                           System.out.println("Inicio Correcto");
                          
                           switch(tipUser){
                               case "Alumno":
                                   Logica.menuAlumno();
                                break;
                               case "Docente":
                                   Logica.menuDocente();
                                break;
                               case "Administrativo":
                                   Logica.menuAdministrativo();
                                break;
                               case "Intendente":
                                   Logica.menuIntendente();
                                break;
                               default:
                                   System.out.println("Opcion No Valida");
                           }
                        }else{
                            System.out.println("Usuario O Contraseña No Validos");
                        }  
    }
}
