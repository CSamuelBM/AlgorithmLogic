package Examen;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int opcP;
        Main ObMain= new Main();
        
        while(true){
            System.out.println("Vendedor...1");
            System.out.println("Comerciante...2");
            System.out.println("Salir...3");
          switch(opcP= cs.nextInt()){
              case 1:
                   ObMain.Vendedor();
                  break;
                  
              case 2:
                  ObMain.Comerciante();
                  break;
                  
              case 3:
                  System.out.println("Saliendo..");
                  return;
                  
              default:
                  System.out.println("Opc No Valida");
                  
          }  
        }
        
    }
    
    public void Vendedor(){
        Scanner cs= new Scanner(System.in);
        
        String nombre, curp;
        String tipo;
        int area;
        
        Vendedor ObVendedor = new Vendedor();
        Vendedor ArVendedor[]= new Vendedor[5];
        
        int opcA= 0, i, posV= 0;
        boolean bandera;
        
        while(opcA!= 5){
            System.out.println("Registrar...1");
            System.out.println("Mostrar...2");
            System.out.println("Buscar...3");
            System.out.println("Actualizar...4");
            System.out.println("Volver...5");
             opcA= cs.nextInt();
          switch(opcA){
              case 1:
                 if(posV< ArVendedor.length){ 
                  System.out.println("Nombre");
                    nombre= cs.next();
                  System.out.println("Curp");
                    curp= cs.next();
                  System.out.println("Tipo");
                    tipo= cs.next();
                  System.out.println("Area");
                    area= cs.nextInt();
                  ObVendedor= new Vendedor(nombre, curp, tipo, area);  
                  ArVendedor[posV]= ObVendedor;
                   posV ++;
                 }else{
                     System.out.println("Maximo De Registro");
                 }  
                  break;
                   
              case 2:
                       ObVendedor.Mostrar();
                  break;
                  
              case 3:
                  System.out.println("Nombre");
                   nombre= cs.next();
                    bandera= false;
                   for(i= 0; i< posV; i++){
                       if(nombre.equals(ArVendedor[i].getNombre())){
                           bandera= true;
                            break;
                       }
                   } 
                   
                   if(bandera== true){
                       System.out.println("Se Encontro");
                   }else{
                       System.out.println("No Se Encontro");
                   }
                  break;
                  
              case 4:
                   System.out.println("Nombre");
                   nombre= cs.next();
                    bandera= false;
                   for(i= 0; i< posV; i++){
                       if(nombre.equals(ArVendedor[i].getNombre())){
                           bandera= true;
                          System.out.println("Crup A Actualizar");   
                           curp= cs.next();
                          ArVendedor[i].setCurp(curp);
                       }
                   } 
                   
                   if(bandera== true){
                       System.out.println("Se Actualizo");
                   }else{
                       System.out.println("No Se Actualizo");
                   }
                  break;
                  
              case 5:
                  System.out.println("Volviendo...");
                  break;
                  
              default: 
                  System.out.println("Opc No Valida...");
          }  
        }
        
    }
     
    public void Comerciante(){
        Scanner cs= new Scanner(System.in);
        
        String nombre, curp;
        String proveedor, ciudad;
        
        Comerciante ObComerciante= new Comerciante();
        Comerciante ArComerciante[]= new Comerciante[5];
        
        int opcA= 0, i, posC= 0;
        boolean bandera;
        
                while(opcA!= 5){
            System.out.println("Registrar...1");
            System.out.println("Mostrar...2");
            System.out.println("Buscar...3");
            System.out.println("Actualizar...4");
            System.out.println("Volver...5");
             opcA= cs.nextInt();
          switch(opcA){
              case 1:
                if(posC< ArComerciante.length){ 
                  System.out.println("Nombre");
                    nombre= cs.next();
                  System.out.println("Curp");
                    curp= cs.next();
                  System.out.println("proveedor");
                    proveedor= cs.next();
                  System.out.println("ciudad");
                    ciudad= cs.next();
                  ObComerciante= new Comerciante(nombre, curp, proveedor, ciudad);  
                  ArComerciante[posC]= ObComerciante;
                   posC ++;
                 }else{
                     System.out.println("Maximo De Registro");
                 }
                  break;
                   
              case 2:
                     ObComerciante.Mostrar();
                  break;
                  
              case 3:
                   System.out.println("Nombre");
                   nombre= cs.next();
                    bandera= false;
                   for(i= 0; i< posC; i++){
                       if(nombre.equals(ArComerciante[i].getNombre())){
                           bandera= true;
                            break;
                       }
                   } 
                   
                   if(bandera== true){
                       System.out.println("Se Encontro");
                   }else{
                       System.out.println("No Se Encontro");
                   }
                  break;
                  
              case 4:
                   System.out.println("Nombre");
                   nombre= cs.next();
                    bandera= false;
                   for(i= 0; i< posC; i++){
                       if(nombre.equals(ArComerciante[i].getNombre())){
                           bandera= true;
                          System.out.println("Crup A Actualizar");   
                           curp= cs.next();
                          ArComerciante[i].setCurp(curp);
                       }
                   } 
                   
                   if(bandera== true){
                       System.out.println("Se Actualizo");
                   }else{
                       System.out.println("No Se Actualizo");
                   }
                  break;
                  
              case 5:
                  System.out.println("Volviendo...");
                  break;
                  
              default: 
                  System.out.println("Opc No Valida...");
          }  
        }
        
    }
    
}
