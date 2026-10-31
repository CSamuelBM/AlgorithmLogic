package Cine;

import java.util.Scanner;

public class Principal_Cine {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
      //Cliente
        String nombre, tarjeta;
        int id_Cliente, num_Visita;
      //Dulceria
        String marca;
        long cod_Barra;
        double precio, cantidad;
      //Pelicula
        String genero, horario, duracion;
        int id_Pelicula;
      //Producto
        int id_Producto;
        double tim_Preparar;
      //Trabajador
        String direccion;
        int id_Trabajador;
        long telefono;
      //Cartelera
        String hora, num_Sala, num_Asistente;
        int id_Cartelera;
      //General
        int opcP, opcA, i;
        boolean bandera;
        
      //Objetos
        Cliente ObCliente;
        Dulceria ObDulceria;
        Pelicula ObPelicula;
        Producto ObProducto;
        Trabajador ObTrabajador;
        Cartelera ObCartelera;
      //Arreglos
        Cliente ArCliente[]= new Cliente[2];
        Dulceria ArDulceria[]= new Dulceria[10];
        Pelicula ArPelicula[]= new Pelicula[10];
        Producto ArProducto[]= new Producto[10];
        Trabajador ArTrabajador[]= new Trabajador[10];
        Cartelera ArCartelera[]= new Cartelera[5];
        
        do{
             opcP= MenuP.MenuPrincipal();
          switch(opcP){
              case Constantes.CLIENTE:
                  do{
                      Util.print("Cliente");
                         opcA= MenuA.MenuSecundario();
                    switch(opcA){
                        case Constantes.REGISTRAR:
                           if(Constantes.POS_CLIENTE< ArCliente.length){ 
                            Util.print("Nombre");
                             nombre= cs.next();
                            id_Cliente= IdExiste.ValidarIdCl(cs, ArCliente);
                            Util.print("Numero De Visitas");
                             num_Visita= cs.nextInt();
                            Util.print("Tarjeta"); 
                             tarjeta= cs.next();
                            ObCliente= new Cliente(nombre, id_Cliente, num_Visita, tarjeta); 
                            ArCliente[Constantes.POS_CLIENTE]= ObCliente; 
                             Constantes.POS_CLIENTE ++;
                           }else {
                               Util.print("Maximo De Registros");
                           }  
                        break;   
                        
                         case Constantes.MOSTRAR:
                           if(Constantes.POS_CLIENTE== 0){  
                               Util.print("No Hay Registro");
                           }else {
                            for(i= 0; i< Constantes.POS_CLIENTE; i++){
                                  Util.print("Nombre: "+ ArCliente[i].getNombre());
                                  Util.print("Identificador: "+ ArCliente[i].getId_Cliente());
                                  Util.print("Numero De Visitas: "+ ArCliente[i].getNum_Visita());
                                  Util.print("Tarjeta: "+ ArCliente[i].getTarjeta());
                            }
                           }
                        break;
                        
                        case Constantes.BUSCAR:
                            if(Constantes.POS_CLIENTE== 0){
                                Util.print("No Hay Registro");
                            }else {
                             Util.print("Cliente A Buscar");
                                 nombre= cs.next(); 
                               bandera= false;  
                                for(i= 0; i< Constantes.POS_CLIENTE; i++){
                                    if(nombre.equals(ArCliente[i].getNombre())){
                                        bandera= true;
                                         break;
                                    }
                                }
                              if(bandera== true){
                                  Util.print("Se Encontro: "+ nombre);
                              }else{
                                  Util.print("No Se Encontro: "+ nombre);
                              }
                            }
                        break;
                        
                        case Constantes.ACTUALIZAR:
                            if(Constantes.POS_CLIENTE== 0){
                                Util.print("No Hay Registro");
                            }else {
                             Util.print("Cliente A Actualizar");
                                 nombre= cs.next(); 
                               bandera= false;  
                                for(i= 0; i< Constantes.POS_CLIENTE; i++){
                                    if(nombre.equals(ArCliente[i].getNombre())){
                                        bandera= true;
                                     Util.print("Tarjeta A Actualizar");
                                      tarjeta= cs.next();
                                     ArCliente[i].setTarjeta(tarjeta); 
                                    }
                                }
                              if(bandera== true){
                                  Util.print("Se Actualizo: "+ nombre);
                              }else{
                                  Util.print("No Se Actualizo: "+ nombre);
                              }
                            } 
                        break;
                       
                        case Constantes.VOLVER:
                            Util.print("Volviendo");
                        break;
                        default:
                            Util.print("Opcion No Valida");
                    }     
                  }while(opcA!= 5);
                    break;
                    
              case Constantes.DULCERIA: 
                  do{
                     Util.print("Dulceria");
                         opcA= MenuA.MenuSecundario();
                    switch(opcA){  
                        case Constantes.REGISTRAR:
                           if(Constantes.POS_DULCERIA< ArDulceria.length){ 
                            Util.print("Nombre");
                             nombre= cs.next();
                            Util.print("Marca");
                             marca= cs.next();
                            Util.print("Codigo De Barra");
                             cod_Barra= cs.nextLong();
                            Util.print("Precio");
                             precio= cs.nextDouble();
                            Util.print("Cantidad");
                             cantidad= cs.nextDouble();
                            ObDulceria= new Dulceria(nombre, marca, cod_Barra, precio, cantidad); 
                            ArDulceria[Constantes.POS_DULCERIA]= ObDulceria;
                             Constantes.POS_DULCERIA ++;
                           }else {
                               Util.print("Maxio De Registro");
                           }
                        break;
                        
                        case Constantes.MOSTRAR:
                           if(Constantes.POS_DULCERIA== 0){
                               Util.print("No Hay Registro");
                           }else { 
                            for(i= 0; i< Constantes.POS_DULCERIA; i++){
                                   Util.print("Nombre: "+ ArDulceria[i].getNombre());
                                   Util.print("Marca: "+ ArDulceria[i].getMarca());
                                   Util.print("Codigo De Barra: "+ ArDulceria[i].getCod_Barra());
                                   Util.print("Precio: "+ ArDulceria[i].getPrecio()+"$");
                                   Util.print("Cantidad En Gramos: "+ ArDulceria[i].getCantidad()+"g");
                            }
                           }
                        break;
                        
                        case Constantes.BUSCAR:
                           if(Constantes.POS_DULCERIA== 0){
                               Util.print("No Hay Registro");
                           }else {
                            Util.print("Dulce A Buscar");
                             nombre= cs.next();
                            bandera= false; 
                            for(i= 0; i< Constantes.POS_DULCERIA; i++){
                               if(nombre.equals(ArDulceria[i].getNombre())){
                                    bandera= true;
                                     break;
                                }
                            }
                           if(bandera== true){
                               Util.print("Se Encontro: "+ nombre);
                           }else{
                                Util.print("No Se Encontro: "+ nombre);
                            }
                           }
                        break;
                        
                        case Constantes.ACTUALIZAR:
                              if(Constantes.POS_DULCERIA== 0){
                               Util.print("No Hay Registro");
                           }else {
                            Util.print("Dulce A Actualizar");
                             nombre= cs.next();
                            bandera= false; 
                            for(i= 0; i< Constantes.POS_DULCERIA; i++){
                               if(nombre.equals(ArDulceria[i].getNombre())){
                                    bandera= true;
                                   Util.print("Marca A Actualizar");
                                    marca= cs.next();
                                   ArDulceria[i].setMarca(marca);
                                }
                             }
                            if(bandera== true){
                               Util.print("Se Actualizo: "+ nombre);
                           }else{
                                Util.print("No Se Actualizo: "+ nombre);
                            }
                          }
                        break;
                        
                        case Constantes.VOLVER:
                            Util.print("Volviendo");
                        break;
                        default:
                            Util.print("Opcion No Valida");
                    }   
                  }while(opcA!= 5);
                   break;
                   
              case Constantes.PRODUCTO:
                    do{
                      Util.print("Producto");
                         opcA= MenuA.MenuSecundario();
                    switch(opcA){
                        case Constantes.REGISTRAR:
                           if(Constantes.POS_PRODUCTO< ArProducto.length){
                            Util.print("Nombre");
                             nombre= cs.next();
                            id_Producto= IdExiste.ValidarIdPr(cs, ArProducto);
                            Util.print("Precio");
                             precio= cs.nextDouble();
                            Util.print("Tiempo De Preparacion");
                             tim_Preparar= cs.nextDouble();
                            Util.print("Cantidad");
                             cantidad= cs.nextDouble();
                            ObProducto= new Producto(nombre, id_Producto, precio, tim_Preparar, cantidad);
                            ArProducto[Constantes.POS_PRODUCTO]= ObProducto;
                             Constantes.POS_PRODUCTO ++;
                           }else {
                               Util.print("Maximo De Registro");
                           } 
                        break;
                        
                        case Constantes.MOSTRAR:
                           if(Constantes.POS_PRODUCTO== 0){
                               Util.print("No Hay Registro");
                           }else { 
                            for(i= 0; i< Constantes.POS_PRODUCTO; i++){
                                    Util.print("Nombre: "+ ArProducto[i].getNombre());
                                    Util.print("Identificador: "+ ArProducto[i].getId_Producto());
                                    Util.print("Precio: "+ ArProducto[i].getPrecio()+"$");
                                    Util.print("Tiempo De Preparacion: "+ ArProducto[i].getTim_Preparar()+"min");
                                    Util.print("Cantidad: "+ ArProducto[i].getCantidad()+"g");
                            }
                           }
                        break;
                        
                        case Constantes.BUSCAR:
                           if(Constantes.POS_PRODUCTO== 0){
                               Util.print("No Hay Registro");
                           }else { 
                            Util.print("Producto A Buscar");
                             nombre= cs.next();
                            bandera= false; 
                            for(i= 0; i< Constantes.POS_PRODUCTO; i++){
                                if(nombre.equals(ArProducto[i].getNombre())){
                                    bandera= true;
                                     break;
                                }
                            }
                           if(bandera== true){
                               Util.print("Se Encontro: "+ nombre);
                           }else {
                               Util.print("No Se Encontro: "+ nombre);
                           }
                          }
                        break;
                        
                        case Constantes.ACTUALIZAR:
                            if(Constantes.POS_PRODUCTO== 0){
                               Util.print("No Hay Registro");
                           }else { 
                            Util.print("Producto A Actualizar");
                             nombre= cs.next();
                            bandera= false; 
                            for(i= 0; i< Constantes.POS_PRODUCTO; i++){
                                if(nombre.equals(ArProducto[i].getNombre())){
                                    bandera= true;
                                  Util.print("Precio A Actualizar");
                                   precio= cs.nextDouble();
                                  ArProducto[i].setPrecio(precio); 
                                }
                            }
                           if(bandera== true){
                               Util.print("Se Actualizo: "+ nombre);
                           }else {
                               Util.print("No Se Actualizo: "+ nombre);
                           }
                          }
                        break;
                        
                        case Constantes.VOLVER:
                            Util.print("Volviendo");
                        break;
                        default:
                            Util.print("Opcion No Valida");
                    }     
                   }while(opcA!= 5);
                      break;
                      
              case Constantes.TRABAJADOR:
                  do{
                      Util.print("Trabajador");
                         opcA= MenuA.MenuSecundario();
                    switch(opcA){
                        case Constantes.REGISTRAR:
                           if(Constantes.POS_TRABAJADOR< ArTrabajador.length){ 
                            Util.print("Nombre");
                             nombre= cs.next();
                            Util.print("Direccion");
                             direccion= cs.next();
                            id_Trabajador= IdExiste.ValidarIdT(cs, ArTrabajador);
                            Util.print("Telefono");
                             telefono= cs.nextLong();
                            Util.print("Horario");
                             horario= cs.next();
                            ObTrabajador= new Trabajador(nombre, direccion, id_Trabajador, telefono, horario); 
                            ArTrabajador[Constantes.POS_TRABAJADOR]= ObTrabajador;
                             Constantes.POS_TRABAJADOR ++;
                           }else {
                               Util.print("Maximo De Registro");
                           }
                        break;
                        
                        case Constantes.MOSTRAR:
                           if(Constantes.POS_TRABAJADOR== 0){
                               Util.print("No Hay Registro");
                           }else { 
                            for(i= 0; i< Constantes.POS_TRABAJADOR; i++){ 
                                    Util.print("Nombre: "+ ArTrabajador[i].getNombre());
                                    Util.print("Direccion: "+ ArTrabajador[i].getDireccion());
                                    Util.print("Horario: "+ ArTrabajador[i].getHorario()+"hrs");
                                    Util.print("Identificador: "+ ArTrabajador[i].getId_Trabajador());
                                    Util.print("Telefono: "+ ArTrabajador[i].getTelefono());
                            }
                           }
                        break;
                        
                        case Constantes.BUSCAR:
                           if(Constantes.POS_TRABAJADOR== 0){
                               Util.print("No Hay Registro");
                           }else { 
                            Util.print("Trabajador A Buscar");
                             nombre= cs.next();
                            bandera= false; 
                            for(i= 0; i< Constantes.POS_TRABAJADOR; i++){
                                if(nombre.equals(ArTrabajador[i].getNombre())){
                                    bandera= true;
                                     break;
                                }
                            }
                           if(bandera== true){
                               Util.print("Se Encontro: "+ nombre);
                           }else {
                               Util.print("No Se Encontro: "+ nombre);
                           }
                          }
                        break;
                        
                        case Constantes.ACTUALIZAR:
                            if(Constantes.POS_TRABAJADOR== 0){
                               Util.print("No Hay Registro");
                           }else { 
                            Util.print("Trabajador A Actualizar");
                             nombre= cs.next();
                            bandera= false; 
                            for(i= 0; i< Constantes.POS_TRABAJADOR; i++){
                                if(nombre.equals(ArTrabajador[i].getNombre())){
                                    bandera= true;
                                   Util.print("Horario A Actualizar");
                                    horario= cs.next();
                                   ArTrabajador[i].setHorario(horario);
                                }
                            }
                           if(bandera== true){
                               Util.print("Se Actualizo: "+ nombre);
                           }else {
                               Util.print("No Se Actualizo: "+ nombre);
                           }
                          }
                        break;
                        
                        case Constantes.VOLVER:
                            Util.print("Volviendo");
                        break;
                        default:
                            Util.print("Opcion No Valida");
                    }     
                    }while(opcA!= 5);
                      break;
                      
              case Constantes.PELICULA:
                  do{
                     Util.print("Pelicula");
                         opcA= MenuA.MenuSecundario();
                    switch(opcA){
                        case Constantes.REGISTRAR:
                            
                          if(Constantes.POS_PELICULA < ArPelicula.length){  
                            Util.print("Nombre");
                             nombre= cs.next();
                            Util.print("Hora");
                             hora= cs.next();
                            id_Pelicula= IdExiste.ValidarIdPe(cs, ArPelicula);
                            Util.print("Numero De Sala");
                             num_Sala= cs.next();
                            Util.print("Numero De Asistentes");
                             num_Asistente= cs.next(); 
                            Util.print("Genero");
                             genero= cs.next(); 
                            Util.print("Duracion");
                             duracion= cs.next();
                            Util.print("Horario");
                             horario= cs.next();
                            ObPelicula= new Pelicula(nombre, genero, id_Pelicula, duracion, horario); 
                            ArPelicula[Constantes.POS_PELICULA]= ObPelicula;
                             Constantes.POS_PELICULA ++;
                            
                            Pelicula Pelicula1= new Pelicula(" ", " ", 0, " ", " "); 
                             if(Constantes.POS_CARTELERA< ArCartelera.length){
                                 ArCartelera[Constantes.POS_CARTELERA]= new Cartelera(Pelicula1, nombre, hora, id_Pelicula, 
                                                                            num_Sala, num_Asistente, genero, duracion, horario);
                                  Constantes.POS_CARTELERA ++;
                             }else {
                                 Util.print("No Hay Espacio");
                             }
                             
                          }else{
                              Util.print("Maximo De Registro");
                          } 
                        break;
                        
                        case Constantes.MOSTRAR:
                           if(Constantes.POS_PELICULA== 0){
                               Util.print("No Hay Registro");
                           }else { 
                            for(i= 0; i< Constantes.POS_PELICULA; i++){
                                    Util.print("Nombre: "+ ArPelicula[i].getNombre());
                                    Util.print("Genero: "+ ArPelicula[i].getGenero());
                                    Util.print("Identificador: "+ ArPelicula[i].getId_Pelicula());
                                    Util.print("Duracion: "+ ArPelicula[i].getDuracion()+"hrs");
                                    Util.print("Horario: "+ ArPelicula[i].getHorario()+"hrs");
                            }
                          } 
                        break;
                        
                        case Constantes.BUSCAR:
                           if(Constantes.POS_PELICULA== 0){
                               Util.print("No Hay Registro");
                           }else {
                            Util.print("Pelicula A Buscar");
                             nombre= cs.next();
                            bandera= false; 
                            for(i= 0; i< Constantes.POS_PELICULA; i++){
                                if(nombre.equals(ArPelicula[i].getNombre())){
                                    bandera= true; 
                                     break;
                                }
                            }
                           if(bandera== true){
                               Util.print("Se Encontro: "+ nombre);
                           }else {
                               Util.print("No Se Encontro: "+ nombre);
                           } 
                          } 
                        break;
                        
                        case Constantes.ACTUALIZAR:
                           if(Constantes.POS_PELICULA== 0){
                               Util.print("No Hay Registro");
                                break;
                           }else { 
                            Util.print("Pelicula A Actualizar");
                             nombre= cs.next();
                            bandera= false;
                            for(i= 0; i< Constantes.POS_PELICULA; i++){
                                if(nombre.equals(ArPelicula[i].getNombre())){
                                    bandera= true;
                                  Util.print("Genero A Actualizar");
                                   genero= cs.next();
                                  ArPelicula[i].setGenero(genero);
                                }
                            }
                           if(bandera== true){
                               Util.print("Se Actualizo: "+ nombre);
                           }else {
                               Util.print("No Se Actualizo: "+ nombre);
                           } 
                         } 
                        break;
                        
                        case Constantes.VOLVER:
                            Util.print("Volviendo");
                        break;
                        default:
                            Util.print("Opcion No Valida");
                    }    
                  }while(opcA!= 5);
                   break;
                      
              case Constantes.CARTELERA:
                  do{
                      Util.print("Cartelera");
                         opcA= MenuA.MenuCartelera();
                    switch(opcA){
                        case Constantes.REGISTRAR:
                           if(Constantes.POS_CARTELERA< ArCartelera.length){
                            Util.print("Nombre");
                             nombre= cs.next();
                            Util.print("Hora");
                             hora= cs.next();
                            id_Cartelera= IdExiste.ValidarIdCa(cs, ArCartelera);
                            Util.print("Numero De Sala");
                             num_Sala= cs.next();
                            Util.print("Numero De Asistentes");
                             num_Asistente= cs.next();
                            Util.print("Genero");
                             genero= cs.next();
                            Util.print("Duracion");
                             duracion= cs.next();
                            Util.print("Horario");
                             horario= cs.next();
                             
                            Util.print("Identificador");
                             id_Pelicula= cs.nextInt();
                            
                            Pelicula Pelicula1 = new Pelicula(nombre, genero, id_Pelicula, duracion, horario); 
                            ObCartelera= new Cartelera(Pelicula1, nombre, hora, id_Cartelera, num_Sala, num_Asistente, 
                                                                    genero, duracion, horario);
                            ArCartelera[Constantes.POS_CARTELERA]= ObCartelera;
                             Constantes.POS_CARTELERA ++;                    
                             
                           }else {
                               Util.print("Maximo De Registro");
                           }
                        break;
                        
                        case Constantes.MOSTRAR:
                           if(Constantes.POS_CARTELERA== 0){
                               Util.print("No Hay Registro");
                           }else {
                            for(i= 0; i< Constantes.POS_CARTELERA; i++){
                                    Util.print("Nombre: "+ ArCartelera[i].getNombre());
                                    Util.print("Hora: "+ ArCartelera[i].getHora()+"hr");
                                    Util.print("Identificador: "+ ArCartelera[i].getId_Cartelera());
                                    Util.print("Numero De Sala: "+ ArCartelera[i].getNum_Sala());
                                    Util.print("Numero De Asistentes: "+ ArCartelera[i].getNum_Asistente());
                            }
                           }
                        break;
                        
                        case Constantes.BUSCAR:
                           if(Constantes.POS_CARTELERA== 0){
                               Util.print("No Hay Registro");
                           }else { 
                            Util.print("Cartelera A Buscar");
                             nombre= cs.next();
                            bandera= false; 
                            for(i= 0; i< Constantes.POS_CARTELERA; i++){
                                if(nombre.equals(ArCartelera[i].getNombre())){
                                    bandera= true;
                                     break;
                                }
                            }
                           if(bandera== true){
                               Util.print("Se Encontro: "+ nombre);
                           }else {
                               Util.print("No Se Encontro: "+ nombre);
                           }
                         }
                        break;
                        
                        case Constantes.ACTUALIZAR:
                            if(Constantes.POS_CARTELERA== 0){
                               Util.print("No Hay Registro");
                           }else { 
                            Util.print("Cartelera A Actualizar");
                             nombre= cs.next();
                            bandera= false; 
                            for(i= 0; i< Constantes.POS_CARTELERA; i++){
                                if(nombre.equals(ArCartelera[i].getNombre())){
                                    bandera= true;
                                   Util.print("Hora A Actualizar");
                                     hora= cs.next();
                                   ArCartelera[i].setHora(hora);
                                }
                            }
                           if(bandera== true){
                               Util.print("Se Actualizo: "+ nombre);
                           }else {
                               Util.print("No Se Actualizo: "+ nombre);
                           }
                         }
                        break;
                        
                        case Constantes.VOLVER:
                            Util.print("Volviendo");
                        break;
                        default:
                            Util.print("Opcion No Valida");

                    }     
                   }while(opcA!= 5);
                      break;
                      
              case Constantes.SALIR:
                  Util.print("Saliendo");
              break;
              default: 
                  Util.print("Opcion No Valida");
          }  
        }while(opcP!= 7);
   
    }
   
}
