import 'package:flutter/cupertino.dart';
import 'package:tenk/Models/ActividadModel.dart';

class ActividadController extends ChangeNotifier{
  List<ActividadModel> actividad = [];

  bool isLoading = false;
  String? errorMessage;

  Future<void> cargarActividades() async{
    isLoading = true;
    errorMessage = null;

    notifyListeners();

    try{
      await Future.delayed(const Duration(seconds: 3));

      actividad = [

        ActividadModel(
            id: '1',
            idAprendizaje: '6',
            titulo: 'Tnek 1.6',
            instrucciones: 'Tnek es algo que no se que es pero es algo bueno tnek es algo que no se que es pero es algo bueno tnek es algo que no se que es pero es algo bueno.',
            contenido: 'La palabra que es una consonate se llama tenek la palabra que es una consonate se llama tenek Tnek es algo que no se que es pero es algo bueno tnek es algo que no se que es pero es algo bueno tnek es algo que no se que es pero es algo bueno Tnek es algo que no se que es pero es algo bueno tnek es algo que no se que es pero es algo bueno tnek es algo que no se que es pero es algo bueno Tnek es algo que no se que es pero es algo bueno tnek es algo que no se que es pero es algo bueno tnek es algo que no se que es pero es algo bueno Tnek es algo que no se que es pero es algo bueno tnek es algo que no se que es pero es algo bueno tnek es algo que no se que es pero es algo bueno Tnek es algo que no se que es pero es algo bueno tnek es algo que no se que es pero es algo bueno tnek es algo que no se que es pero es algo bueno la palabra que es una consonate se llama tenek la palabra que es una consonate se llama tenek la palabra que es una consonate se llama tenek la palabra que es una consonate se llama tenek la palabra que es una consonate se llama tenek la palabra que es una consonate se llama tenek.'
        ),

        ActividadModel(
            id: '2',
            idAprendizaje: '1',
            titulo: 'Tnek 1.1',
            instrucciones: 'Tnek es algo que no se que es pero es algo bueno algo es.',
            contenido: 'La palabra que es una asonantes se llama tenek.'
        ),

        ActividadModel(
            id: '3',
            idAprendizaje: '5',
            titulo: 'Tnek 1.5',
            instrucciones: 'Tnek es algo que no se que es pero es algo bueno algo es.',
            contenido: 'La palabra que es una asonantes se llama tenek.'
        ),

        ActividadModel(
            id: '4',
            idAprendizaje: '2',
            titulo: 'Tnek 1.2',
            instrucciones: 'Tnek es algo que no se que es pero es algo bueno algo es.',
            contenido: 'La palabra que es una asonantes se llama tenek.'
        ),

        ActividadModel(
            id: '5',
            idAprendizaje: '4',
            titulo: 'Tnek 1.4',
            instrucciones: 'Tnek es algo que no se que es pero es algo bueno algo es.',
            contenido: 'La palabra que es una asonantes se llama tenek.'
        ),

        ActividadModel(
            id: '6',
            idAprendizaje: '3',
            titulo: 'Tnek 1.3',
            instrucciones: 'Tnek es algo que no se que es pero es algo bueno algo es.',
            contenido: 'La palabra que es una asonantes se llama tenek.'
        ),
      ];
    }catch(e){
      errorMessage = 'Error al cargar las actividades';
    }finally{
      isLoading = false;
      notifyListeners();
    }
  }
}