package Vendedor_Cliente;

import java.util.Scanner;

public class Main {
    public static Scanner cs= new Scanner(System.in);
    public static String nombre, edad, peso, sexo, curp;
    
    public static void main(String[]args){
        
      int opcP= 0;
      
      while(true){
          try{
           System.out.println("<-----Bienvenido----->");
             System.out.println(" 1.- Vendedor..");
             System.out.println(" 2.- Cliente..");
             System.out.println(" 3.- Salir.....");
              opcP= cs.nextInt();
              
              if(opcP== 3){
                 System.out.println(Mensaje.salir);
                  return;
               }
              
          }catch(Exception e){
              System.out.println(Mensaje.solNum);
               cs.nextLine();
          }
          
         switch(opcP){
             case Constante.Vendedor:
                  Vendedor();
                 break;
                 
             case Constante.Cliente:
                  Cliente();
                 break;
         } 
      }
   }
    
    public static void Vendedor() {
         
        String id_Vendedor, cuenta, area, venta_Dia;
        
        int opcA= 0, i;
        boolean bandera;
        
         Vendedor ObVendedor;
         Vendedor ArVendedor[]= new Vendedor[5];
         
         while(true){
               bandera= false;
            try{ 
              System.out.println("<-----Vendedor----->");
               System.out.println("1.- Registrar");
               System.out.println("2.- Mostrar");
               System.out.println("3.- Buscar");
               System.out.println("4.- Actualizar");
               System.out.println("5.- Volver==>");
                opcA= cs.nextInt();
                
               if(opcA== 5){
                   System.out.println(Mensaje.volver);
                    return;
               }
               
            }catch(Exception e){
                System.out.println(Mensaje.solNum);
                 cs.nextLine();
            }  
            
            switch(opcA){
                case Constante.Registrar:
                    try{
                      if(Constante.Pos_Vendedor< ArVendedor.length){ 
                        System.out.println("Nombre");
                         nombre= cs.next();
                        System.out.println("Edad");
                         edad= cs.next();
                        System.out.println("Peso");
                         peso= cs.next();
                        System.out.println("Sexo");
                         sexo= cs.next();
                        System.out.println("Curp");
                         curp= cs.next(); 
                        System.out.println("Identificador");
                         id_Vendedor= cs.next(); 
                        System.out.println("Cuenta");
                         cuenta= cs.next();
                        System.out.println("Area");
                         area= cs.next();
                        System.out.println("Ventas Al Dia");
                         venta_Dia= cs.next(); 
                        ObVendedor= new Vendedor(nombre, edad, peso, sexo, curp, id_Vendedor, cuenta, area, venta_Dia); 
                        ArVendedor[Constante.Pos_Vendedor]= ObVendedor;
                         Constante.Pos_Vendedor ++;
                       }else{
                          throw new ArrayIndexOutOfBoundsException(Mensaje.maxRegistro);
                      }
                    }catch(ArrayIndexOutOfBoundsException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case Constante.Mostrar:
                        if(Constante.Pos_Vendedor== 0){
                            System.out.println(Mensaje.sinRegistro);
                        }else{
                            for(i= 0; i< Constante.Pos_Vendedor; i++){
                                System.out.println("Nombre: "+ ArVendedor[i].getNombre());
                                System.out.println("Edad: "+ ArVendedor[i].getEdad());
                                System.out.println("Peso: "+ ArVendedor[i].getPeso());
                                System.out.println("Sexo: "+ ArVendedor[i].getSexo());
                                System.out.println("Curp: "+ ArVendedor[i].getCurp().toUpperCase());
                                System.out.println("Identificador: "+ ArVendedor[i].getId_Vendedor());
                                System.out.println("Cuenta: "+ ArVendedor[i].getCuenta());
                                System.out.println("Area: "+ ArVendedor[i].getArea());
                                System.out.println("Ventas Al Dia: "+ ArVendedor[i].getVenta_Dia());
                            }
                        }
                    break;
                    
                case Constante.Buscar:
                    if(Constante.Pos_Vendedor== 0){
                        System.out.println(Mensaje.sinRegistro);
                          break;
                    }else{
                        System.out.println("Nombre");
                         nombre= cs.next();
                        for(i= 0; i< Constante.Pos_Vendedor; i++){
                            if(nombre.equals(ArVendedor[i].getNombre())){
                                bandera= true; 
                                 break;
                            }
                        }
                    }
                    
                   if(bandera== true){
                       System.out.println(Mensaje.siEncontro+" A "+nombre);
                   }else{
                       System.out.println(Mensaje.noEncontro+" A "+nombre);
                   }
                break;
                    
                case Constante.Actualizar:
                    if(Constante.Pos_Vendedor== 0){
                        System.out.println(Mensaje.sinRegistro);
                         break;
                    }else{
                        System.out.println("Nombre");
                         nombre= cs.next();
                        for(i= 0; i< Constante.Pos_Vendedor; i++){
                            if(nombre.equals(ArVendedor[i].getNombre())){
                                bandera= true;
                               System.out.println("Peso A Actualizar"); 
                                peso= cs.next();
                               ArVendedor[i].setPeso(peso);
                            }
                        } 
                    }
                    
                   if(bandera== true){
                       System.out.println(Mensaje.siActualizo+" A "+nombre);
                   }else{
                       System.out.println(Mensaje.noActualizo+" A "+nombre);
                   }
                   break;
                   
            }   
         }
         
      } 
     
     public static void Cliente(){
        
         String id_Cliente, saldo, fecha_Registro, credito;
         
         int opcA= 0, i; 
         boolean bandera;
         
         Cliente ObCliente;
         Cliente ArCliente[]= new Cliente[5];
         
         while(true){
              bandera= false;
              
            try{
                System.out.println("<-----Cliente----->");
                 System.out.println("1.- Registrar");
                 System.out.println("2.- Mostrar");
                 System.out.println("3.- Buscar");
                 System.out.println("4.- Actualizar");
                 System.out.println("5.- Volver==>");
                opcA= cs.nextInt();
                
                if(opcA== 5){
                    System.out.println(Mensaje.salir);
                     return;
                }
                
            }catch(Exception e){
                System.out.println(Mensaje.solNum);
                 cs.nextLine();
            }
            
            switch(opcA){
                
                case Constante.Registrar:
                    
                    try{
                      if(Constante.Pos_Cliente< ArCliente.length){
                            System.out.println("Nombre");
                              nombre= cs.next();
                            System.out.println("Edad");
                              edad= cs.next();
                            System.out.println("Peso");
                              peso= cs.next();
                            System.out.println("Sexo");
                              sexo= cs.next();
                            System.out.println("Curp");
                              curp= cs.next(); 
                            System.out.println("Identificador");
                              id_Cliente= cs.next(); 
                            System.out.println("Saldo");
                             saldo= cs.next();
                            System.out.println("Fecha De Registro");
                             fecha_Registro= cs.next();
                            System.out.println("Credito");
                             credito= cs.next(); 
                        ObCliente= new Cliente(nombre, edad, peso, sexo, curp, id_Cliente, saldo, fecha_Registro, credito); 
                        ArCliente[Constante.Pos_Cliente]= ObCliente;
                         Constante.Pos_Cliente ++;
                        }else{
                            throw new ArrayIndexOutOfBoundsException(Mensaje.maxRegistro);
                        }
                        
                    }catch(ArrayIndexOutOfBoundsException e){
                        System.out.println(e.getMessage());
                    }
                    
                    break;
                  
                case Constante.Mostrar:
                    if(Constante.Pos_Cliente== 0){
                        System.out.println(Mensaje.sinRegistro);
                         break;
                    }else{
                        for(i= 0; i< Constante.Pos_Cliente; i++){
                                System.out.println("Nombre: "+ ArCliente[i].getNombre());
                                System.out.println("Edad: "+ ArCliente[i].getEdad());
                                System.out.println("Peso: "+ ArCliente[i].getPeso());
                                System.out.println("Sexo: "+ ArCliente[i].getSexo());
                                System.out.println("Curp: "+ ArCliente[i].getCurp().toUpperCase());
                                System.out.println("Identificador: "+ ArCliente[i].getId_Cliente());
                                System.out.println("Saldo: "+ ArCliente[i].getSaldo());
                                System.out.println("Fecha De Registro: "+ ArCliente[i].getFecha_Registro());
                                System.out.println("Credito: "+ ArCliente[i].getCredito());
                            }
                    }
                    break;
                    
                case Constante.Buscar:
                        if(Constante.Pos_Cliente== 0){
                        System.out.println(Mensaje.sinRegistro);
                         break;
                    }else{
                        System.out.println("Nombre");
                         nombre= cs.next();
                        for(i= 0; i< Constante.Pos_Cliente; i++){
                            if(nombre.equals(ArCliente[i].getNombre())){
                                bandera= true;
                                 break;
                            }
                        } 
                    }
                    
                   if(bandera== true){
                       System.out.println(Mensaje.siEncontro+" A "+nombre);
                   }else{
                       System.out.println(Mensaje.noEncontro+" A "+nombre);
                   }
                    break;
                    
                case Constante.Actualizar:
                    if(Constante.Pos_Cliente== 0){
                        System.out.println(Mensaje.sinRegistro);
                         break;
                    }else{
                        System.out.println("Nombre");
                         nombre= cs.next();
                        for(i= 0; i< Constante.Pos_Cliente; i++){
                            if(nombre.equals(ArCliente[i].getNombre())){
                                bandera= true;
                               System.out.println("Peso A Actualizar"); 
                                peso= cs.next();
                               ArCliente[i].setPeso(peso);
                            }
                        } 
                    }
                    
                   if(bandera== true){
                       System.out.println(Mensaje.siActualizo+" A "+nombre);
                   }else{
                       System.out.println(Mensaje.noActualizo+" A "+nombre);
                   }
                    break;
                
            }
             
         }
     }

}
