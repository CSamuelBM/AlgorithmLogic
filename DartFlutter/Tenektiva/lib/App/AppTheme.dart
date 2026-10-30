import 'package:flutter/material.dart';
import 'package:tenk/app/AppColors.dart';

class AppTheme {

  // Se establece el diseño global
  static ThemeData get claro => ThemeData(
    useMaterial3: true, // Colores dinamicos

    colorScheme: ColorScheme.fromSeed(
      // Toma un color principal y lo modifica segun el brillo
      seedColor: AppColors.fondoG1,
      brightness: Brightness.light, // Brillo de los colores
    ),

    //Diseño de todos los textField o donde ingresas datos
    inputDecorationTheme: InputDecorationTheme(
      filled: true,
      fillColor: AppColors.fondoInput,

      border: OutlineInputBorder(
        borderSide: BorderSide.none,
        borderRadius: BorderRadius.circular(34),
      ),

      //Borde del text field sin presionar.
      enabledBorder: OutlineInputBorder(
        borderRadius: BorderRadius.circular(34),
        borderSide: BorderSide.none,
      ),

      //Borde del text field al presionar.
      focusedBorder: OutlineInputBorder(
        borderRadius: BorderRadius.circular(34),
        borderSide: BorderSide(
          color: AppColors.bordeInput,
          width: 1.5,
        ),
      ),

      //Tamaño del texto de adentro.
      contentPadding: const EdgeInsets.symmetric(
        vertical: 14,
        horizontal: 26,
      ),

      //Texto dentro del text field.
      labelStyle: const TextStyle(
        color: AppColors.textoSecundario,
        backgroundColor: Colors.transparent,
        fontWeight: FontWeight.w500,
        fontSize: 16,
      ),

      //Texto fuera del text field.
      floatingLabelStyle: const TextStyle(
        color: AppColors.textoSecundario,
        fontSize: 18,
        backgroundColor: Colors.transparent,
        fontWeight: FontWeight.w500,
      ),

      errorStyle: const TextStyle(
        fontSize: 12,
      ),
    ),

    // Diseño para los botones
    elevatedButtonTheme: ElevatedButtonThemeData(
      style: ElevatedButton.styleFrom(
        //Color del boton.
        backgroundColor: AppColors.botonPrincipal,

        //Color del texto.
        foregroundColor: AppColors.textoSecundario,
        elevation: 8,

        disabledBackgroundColor: AppColors.botonPrincipal,
        disabledForegroundColor: AppColors.botonSecundario,

        //Hacer redondo el boton.
        shape: RoundedRectangleBorder(
          borderRadius: BorderRadius.circular(14),
        ),

        //Estilo de del texto del boton.
        textStyle: const TextStyle(
          fontSize: 18,
          fontWeight: FontWeight.w600,
        ),
      ),
    ),

    //Titulos para los tipos de texto.
    textTheme: const TextTheme(
      titleLarge: TextStyle(
          fontSize: 24,
          fontWeight: FontWeight.w600,
          color: AppColors.textoPrincipal,
      ),
      titleMedium: TextStyle(
        fontSize: 18,
        fontWeight: FontWeight.w500,
        color: AppColors.textoSecundario,
      ),
      titleSmall: TextStyle(
        fontSize: 14,
        fontWeight: FontWeight.w800,
        color: AppColors.textoPrincipal,
      ),
      bodyLarge: TextStyle(
        fontSize: 15,
        fontWeight: FontWeight.w800,
        color: AppColors.textoSecundario,
      ),
      bodyMedium: TextStyle(
        fontSize: 15,
        fontWeight: FontWeight.w800,
        color: AppColors.bordeInput,
      ),
    ),
  );

  static ThemeData get oscuro => ThemeData(
    useMaterial3: true,

    colorScheme: ColorScheme.fromSeed(
      seedColor: AppColors.fondoG1,
      brightness: Brightness.dark,
    ),

    scaffoldBackgroundColor: AppColors.fondoG2,
  );

}