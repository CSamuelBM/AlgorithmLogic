import 'package:flutter/material.dart';
import 'package:tenk/App/AppImages.dart';
import 'package:tenk/app/AppColors.dart';
import 'package:tenk/views/auth/LeccionesView.dart';

class MenuNavegacionView extends StatefulWidget{
  const MenuNavegacionView({super.key});

  @override
  State<MenuNavegacionView> createState() => _MenuNavegacionView();
}

class _MenuNavegacionView extends State<MenuNavegacionView> {
  int _indiceActual = 0; //Indice de la pantalla actual.

  //Pantallas de las vistas principales.
  static const List<Widget> _listViews = <Widget>[
    Center(child: Text("Inicio")),
    LeccionesView(),
    Center(child: Text("Ajustes")),
  ];

  //Funcion al presionar un icono de la barra de navegacion.
  void _nevegacion(int indice){
    setState(() {
      _indiceActual = indice; //Se actualiza el indice la pantalla.
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      /*Se saca la pantalla seleccionada sin hacer un recorrido ya que esta en
        completa actualizacion por el widget stateful.*/
      body: _listViews[_indiceActual],

      bottomNavigationBar: Container(
        decoration: const BoxDecoration(
          gradient: LinearGradient(
              colors: [
                AppColors.fondoG3,
                AppColors.fondoG4,
              ],
            begin: Alignment.topRight,
            end: Alignment.topLeft,
          ),
        ),
        child: BottomNavigationBar(
          //Iconos que se ven en la barra de navegacion.
          items: <BottomNavigationBarItem>[
            BottomNavigationBarItem(
              icon: Image.asset(
                AppImages.perfil,
                height: 30,
                width: 30,
              ),
              label: 'Perfil',
            ),
            BottomNavigationBarItem(
              icon: Image.asset(
                AppImages.leccion,
                height: 30,
                width: 30,
              ),
              label: 'Lecciones',
            ),
            BottomNavigationBarItem(
              icon: Image.asset(
                AppImages.ajustes,
                height: 30,
                width: 30,
              ),
              label: 'Ajustes',
            ),
          ],

          backgroundColor: Colors.transparent,  //Color de la barra.
          elevation: 0,

          //Configuracion de los iconos de la barra.
          currentIndex: _indiceActual, //Se pasa el indice de la pantalla actual.
          selectedItemColor: AppColors.textoPrincipal, //Color del icono.
          unselectedItemColor: AppColors.botonPrincipal, //Color del icono sin seleccionar.
          onTap: _nevegacion, //Se llama a la funcion al tocar
        ),
      ),
    );
  }
}