package Figuras_Geometricas;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int opc= 0;
        
        Triangulo ObTriangulo= new Triangulo();
        Cuadrado ObCuadrado= new Cuadrado();
        Rectangulo ObRectangulo= new Rectangulo();
        Rombo ObRombo= new Rombo();
        Pentagono ObPentagono= new Pentagono();
        Circulo ObCirculo= new Circulo();
        Trapecio ObTrapecio= new Trapecio();
        Trapezoide ObTrapezoide= new Trapezoide();
        Octagono ObOctagono= new Octagono();
        Hexagono ObHexagono= new Hexagono();
        Elipse ObElipse= new Elipse();
        TrapecioIsosceles ObTrapecioIsosceles= new TrapecioIsosceles();
        Heptagono ObHeptagono= new Heptagono();
        Decagono ObDecagono= new Decagono();
        Eneagono ObEneagono= new Eneagono();
        Ovalo ObOvalo= new Ovalo();
        Deltoide ObDeltoide= new Deltoide();
        Romboide ObRomboide= new Romboide();
        
        while(true){
             System.out.println(" ");
            System.out.println("<-Geometria-->");
             ObTriangulo.Menu();
             ObCuadrado.Menu();
             ObRectangulo.Menu();
             ObRombo.Menu();
             ObPentagono.Menu();
             ObCirculo.Menu();
             ObTrapecio.Menu();
             ObTrapezoide.Menu();
             ObOctagono.Menu();
             ObHexagono.Menu();
             ObElipse.Menu();
             ObTrapecioIsosceles.Menu();
             ObHeptagono.Menu();
             ObDecagono.Menu();
             ObEneagono.Menu();
             ObOvalo.Menu();
             ObDeltoide.Menu();
             ObRomboide.Menu();
             System.out.println("Salir......19");
          switch(opc= cs.nextInt()){
              case C.Triangulo:
                   ObTriangulo.Base();
                   ObTriangulo.Altura();
                   ObTriangulo.Lado();
                  System.out.println(C.Area+ ObTriangulo.cArea());
                  System.out.println(C.Perimetro+ ObTriangulo.cPerimetro());
                break;  
               
              case C.Cuadrado:
                   ObCuadrado.Datos();
                  System.out.println(C.Area+ ObCuadrado.cArea());
                  System.out.println(C.Perimetro+ ObCuadrado.cPerimetro());
                break;
                
              case C.Rectangulo:
                   ObRectangulo.Datos();
                  System.out.println(C.Area+ ObRectangulo.cArea());
                  System.out.println(C.Perimetro+ ObRectangulo.cPerimetro());
                break;
                
              case C.Rombo:
                   ObRombo.Datos();
                  System.out.println(C.Area+ ObRombo.cArea());
                  System.out.println(C.Perimetro+ ObRombo.cPerimetro());
                break;
                
              case C.Pentagono:
                   ObPentagono.Datos();
                  System.out.println(C.Perimetro+ ObPentagono.cPerimetro());
                  System.out.println(C.Area+ ObPentagono.cArea());
                break;
                
              case C.Circulo:
                   ObCirculo.Datos();
                  System.out.println(C.Area+ ObCirculo.cArea());
                  System.out.println(C.Perimetro+ ObCirculo.cPerimetro());
                break;
                
              case C.Trapecio:
                   ObTrapecio.Datos();
                  System.out.println(C.Area+ ObTrapecio.cArea());
                  System.out.println(C.Perimetro+ ObTrapecio.cPerimetro());
                break;
                
              case C.Trapezoide:
                   ObTrapezoide.Datos();
                  System.out.println(C.Area+ ObTrapezoide.cArea());
                  System.out.println(C.Perimetro+ ObTrapezoide.cPerimetro());
                break;
                
              case C.Octagono:
                   ObOctagono.Datos();
                  System.out.println(C.Area+ ObOctagono.cArea());
                  System.out.println(C.Perimetro+ ObOctagono.cPerimetro());
                break;
                
              case C.Hexagono:
                   ObHexagono.Datos();
                  System.out.println(C.Area+ ObHexagono.cArea());
                  System.out.println(C.Perimetro+ ObHexagono.cPerimetro());
                break;
                
              case C.Elipse:
                   ObElipse.Datos();
                  System.out.println(C.Area+ ObElipse.cArea());
                  System.out.println(C.Perimetro+ ObElipse.cPerimetro());
                break;
                
              case C.TrapecioIsosceles:
                   ObTrapecioIsosceles.Datos();
                  System.out.println(C.Area+ ObTrapecioIsosceles.cArea());
                  System.out.println(C.Perimetro+ ObTrapecioIsosceles.cPerimetro());
                break;
                
              case C.Heptagono:
                   ObHeptagono.Datos();
                  System.out.println(C.Area+ ObHeptagono.cArea());
                  System.out.println(C.Perimetro+ ObHeptagono.cPerimetro());
                break;
                
              case C.Decagono:
                   ObDecagono.Datos();
                  System.out.println(C.Area+ ObDecagono.cArea());
                  System.out.println(C.Perimetro+ ObDecagono.cPerimetro());
                break;
                
              case C.Eneagono:
                   ObEneagono.Datos();
                  System.out.println(C.Area+ ObEneagono.cArea());
                  System.out.println(C.Perimetro+ ObEneagono.cPerimetro());
                break;
                
              case C.Ovalo:
                   ObOvalo.Datos();
                  System.out.println(C.Area+ ObOvalo.cArea());
                  System.out.println(C.Perimetro+ ObOvalo.cPerimetro());
                break;
                
              case C.Deltoide:
                   ObDeltoide.Datos();
                  System.out.println(C.Area+ ObDeltoide.cArea());
                  System.out.println(C.Perimetro+ ObDeltoide.cPerimetro());
                break;
                
              case C.Romboide:
                   ObRomboide.Datos();
                  System.out.println(C.Area+ ObRomboide.cArea());
                  System.out.println(C.Perimetro+ ObRomboide.cPerimetro());
                break;
                
              case C.Salir:
                  System.out.println("Saliendo...");
                return;
                
              default:
                  System.out.println("Opcion No Valida");
          }
        }
        
    }
}
