import 'package:flutter/cupertino.dart';

import '../models/UsuarioModel.dart';

// El ChangeNotifier notifica a la vista sobre algun cambio.
class LoginController extends ChangeNotifier{
  //Variables de estado.
  bool isLoading = false; //Se encarga de saber si esta cargando una peticion.

  //Mensaje que se muestra al haber un error.
  String? errorMenssage;

  //Metodo que se llama al presionar el boton login.
  Future<bool> loginUsuario(String email, String password) async{

    //Limpiamos errores anteriores.
    isLoading = false;
    errorMenssage = null;

    notifyListeners(); //Le decimos a la vista que muestre el icono de carga

    try {

      //Se simula la peticion al back.
      await Future.delayed(const Duration(seconds: 2));

      //Se crea los datos del modelo
      final usuario = UsuarioModel(email: email, password: password);

      //Se realiza la validacion de datos
      if(usuario.email == 's' && usuario.password == 's'){
        isLoading = true;
        notifyListeners();
        return true;
      }
      else{
        errorMenssage = 'Error en el correo o contraseña';
        isLoading = false;
        notifyListeners();
        return false;
      }
    } catch (e){
      errorMenssage = 'Error al iniciar sesion';
      isLoading = false;
      notifyListeners();
      return false;
    }
  }
}