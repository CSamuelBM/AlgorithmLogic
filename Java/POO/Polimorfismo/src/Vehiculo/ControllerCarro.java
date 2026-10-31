package Vehiculo;

import java.util.Scanner;

public class ControllerCarro {
     Scanner cs= new Scanner(System.in);
    
    private String color, marca, modelo;
    private boolean arrancar, mover, chocar;
    private String cilindrada, capacidadTanque;
    
    ModelCarro ObCarro= new ModelCarro();
    ModelCarro ArCarro[]= new ModelCarro[5];
    
    int opc= 0, i, pos= 0;
    private boolean bandera;
    
    public void MenuCarro(){
        while(opc!= 6){
            System.out.println("Registrar...1");
            System.out.println("Mostrar...2");
            System.out.println("Buscar...3");
            System.out.println("Actualizar...4");
            System.out.println("Eliminar...5");
            System.out.println("Volver...6");
             opc= cs.nextInt();
            switch(opc){
                case 1:
                    if(opc< ArCarro.length){
                        System.out.println("Color");
                         color= cs.next();
                        System.out.println("Marca");
                         marca= cs.next();
                        System.out.println("Modelo");
                         modelo= cs.next();
                        System.out.println("Arrancar(true/false)");
                         arrancar= cs.nextBoolean();
                        System.out.println("Mover(true/false)");
                         mover= cs.nextBoolean();
                        System.out.println("Chocar(true/false)");
                         chocar= cs.nextBoolean();
                        System.out.println("Cilindrada");
                         cilindrada= cs.next();
                        System.out.println("Capacidad Del Tanque");
                         capacidadTanque= cs.next();
                        ObCarro= new ModelCarro(color, marca, modelo, arrancar, mover, 
                                                 chocar, cilindrada, capacidadTanque); 
                        ArCarro[pos]= ObCarro;
                         pos ++;
                    }else{
                        System.out.println("Maximo De Registros");
                    }
                    break;
                case 2:
                    if(opc== 0){
                        System.out.println("No Hay Registro");
                    }else{
                        for(i= 0; i< pos; i++){
                            System.out.println("Color: "+ ArCarro[i].getColor());
                            System.out.println("Marca: "+ ArCarro[i].getMarca());
                            System.out.println("Modelo: "+ ArCarro[i].getModelo());
                            ArCarro[i].Arrancar();
                            ArCarro[i].Mover();
                            ArCarro[i].Chocar();
                            System.out.println("Cilindrada: "+ ArCarro[i].getCilindrada());
                            System.out.println("Capacidad Del Tanque: "+ ArCarro[i].getCapacidadTanque());
                        }
                    }
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Volviendo");
                    break;
                default:
                    System.out.println("Opcion No Valida");
            } 
        }
    }
     
}
