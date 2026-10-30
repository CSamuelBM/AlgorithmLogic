import 'package:flutter/material.dart';
import 'package:tenk/Controllers/ActividadController.dart';
import 'package:tenk/app/AppTheme.dart';
import 'package:tenk/controllers/AprendizajeController.dart';
import 'package:tenk/controllers/LeccionesController.dart';
import 'package:tenk/views/auth/LoginView.dart';
import 'package:tenk/views/widgets/MenuNavegacionView.dart';
import 'package:provider/provider.dart';

void main() {
  runApp(
    MultiProvider(
        providers: [
          ChangeNotifierProvider(
            create: (context) => LeccionesController()..cargarLecciones(),
          ),

          ChangeNotifierProvider(
              create: (context) => AprendizajeController()..cargarAprendizaje(),
          ),

          ChangeNotifierProvider(
              create: (context) => ActividadController()..cargarActividades(),
          ),
        ],
      child: const MyApp(),
    )
  );
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Tenk',

      debugShowCheckedModeBanner: false,

      theme: AppTheme.claro,
      //darkTheme: AppTheme.oscuro,
      //themeMode: ThemeMode.system,

      initialRoute: '/login',

      routes: {
        '/login' : (_) => const LoginView(),
        '/menu' : (_) => const MenuNavegacionView(),
      },
    );
  }
}