import 'package:tenk/Controllers/ActividadController.dart';
import 'package:tenk/Controllers/AprendizajeController.dart';
import 'package:tenk/controllers/LeccionesController.dart';
import 'package:tenk/controllers/LoginController.dart';

class AppControllers {
  static final LoginController loginController = LoginController();
  static final LeccionesController leccionesController = LeccionesController();
  static final AprendizajeController aprendizajeController = AprendizajeController();
  static final ActividadController actividadController = ActividadController();
}