import 'package:flutter/cupertino.dart';
import 'package:tenk/models/LeccionesModel.dart';

class LeccionesController extends ChangeNotifier{
  //Lista donde se guardan las n lecciones.
  List<LeccionesModel> lecciones = [];

  bool isLoading = false;
  String? errorMessage;

  Future<void> cargarLecciones() async{
    isLoading = true;
    errorMessage = null;
    notifyListeners();

    try {
      await Future.delayed(const Duration(seconds: 2));

      lecciones = [

        const LeccionesModel(
            id: '1',
            name: 'Principios Basicos',
            description: 'Tnek 1',
            urlImage: 'assets/img/pes.png',
            backColor: 'rgb(153, 232, 223, 50.0)'
        ),

        const LeccionesModel(
            id: '2',
            name: 'Palabras',
            description: 'Tnek 2',
            urlImage: 'assets/img/leccion.png',
            backColor: 'rgb(153, 212, 232, 50.0)'
        ),

        const LeccionesModel(
            id: '3',
            name: 'Alfabeto',
            description: 'Tnek 3',
            urlImage: 'assets/img/perr.png',
            backColor: 'rgb(15, 212, 232, 50.0)'
        ),
      ];
    } catch (e){
      errorMessage = 'Error al cargar la leccion';
    } finally {
      isLoading = false;
      notifyListeners();
    }
  }
}