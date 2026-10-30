import 'package:flutter/material.dart';
import 'package:tenk/models/AprendizajeModel.dart';

class AprendizajeController extends ChangeNotifier{
  List<AprendizajeModel> aprendizaje = [];

  bool isLoading = false;
  String? errorMessage;

  Future<void> cargarAprendizaje() async{
    isLoading = true;
    errorMessage = null;

    notifyListeners();

    try {
      await Future.delayed(const Duration(seconds: 3));

      aprendizaje = [

        AprendizajeModel(
            id: '1',
            idLeccion: '1',
            name: 'Tnek 1.1',
            fechaCreacion: DateTime.now()
        ),

        AprendizajeModel(
            id: '2',
            idLeccion: '3',
            name: 'Tnek 1.3',
            fechaCreacion: DateTime.now()
        ),

        AprendizajeModel(
            id: '3',
            idLeccion: '1',
            name: 'Tnek 1.1.1',
            fechaCreacion: DateTime.now()
        ),

        AprendizajeModel(
            id: '4',
            idLeccion: '2',
            name: 'Tnek 1.2',
            fechaCreacion: DateTime.now()
        ),

        AprendizajeModel(
            id: '5',
            idLeccion: '3',
            name: 'Tnek 1.3.3',
            fechaCreacion: DateTime.now()
        ),

        AprendizajeModel(
            id: '6',
            idLeccion: '2',
            name: 'Tnek 1.2.2',
            fechaCreacion: DateTime.now()
        ),
      ];
    } catch (e) {
      errorMessage = 'Error al cargar el aprendizaje';
    } finally {
      isLoading = false;
      notifyListeners();
    }
  }
}