import 'dart:ui';

import 'package:tenk/app/AppColors.dart';

class LeccionesModel {
  final String id;
  final String name;
  final String description;
  final String urlImage;
  final String backColor;

  const LeccionesModel({
    required this.id,
    required this.name,
    required this.description,
    required this.urlImage,
    required this.backColor,
  });

  Color get colorFondo {
    try {
      final color = backColor.trim().toLowerCase();

      if(color.startsWith('rgb')){
        String valores = color.replaceAll(RegExp(r'[a-z\(\)\s]'), '');
        List<String> colores = valores.split(',');

        if(colores.length >= 3){
          return Color.fromRGBO(
              int.parse(colores[0]),
              int.parse(colores[1]),
              int.parse(colores[2]),
              colores.length == 4 ? double.parse(colores[3]) : 1.0,
          );
        }
      }

      throw const FormatException('Error en el color rgbo');
    } catch (e){
      return AppColors.textoError;
    }
  }

  LeccionesModel copyWith({
    String? id,
    String? name,
    String? description,
    String? urlImage,
    String? backColor,
  }) {
    return LeccionesModel(
        id: id ?? this.id,
        name: name ?? this.name,
        description: description ?? this.description,
        urlImage: urlImage ?? this.urlImage,
        backColor: backColor ?? this.backColor,
    );
  }
}