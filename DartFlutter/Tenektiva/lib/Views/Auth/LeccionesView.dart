import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:tenk/controllers/LeccionesController.dart';
import 'package:tenk/views/auth/AprendizajeView.dart';
import 'package:tenk/views/widgets/FondoGradienteView.dart';

class LeccionesView extends StatefulWidget{
  const LeccionesView({super.key});

  @override
  State<StatefulWidget> createState() => _LeccionesViewState();
}

class _LeccionesViewState extends State<LeccionesView> {
  @override
  Widget build(BuildContext context) {
    Size size = MediaQuery.of(context).size;

    return Scaffold(
      body: FondoGradienteView(
              child: SafeArea(
                  child: Column(
                    children: [
                      Padding(
                        padding: EdgeInsets.all(23.0),
                        child: Text(
                          'Lecciones',
                          style: Theme.of(context).textTheme.titleLarge,
                        ),
                      ),

                      SizedBox(height: size.height * 0.03,),

                      Expanded( //Con el expanded se rellena el espacio restante.
                        child: Consumer<LeccionesController>(
                          builder: (context, leccionesController, child) {
                            if(leccionesController.isLoading){
                              return const Center(
                                child: CircularProgressIndicator(),
                              );
                            }

                            if(leccionesController.errorMessage != null){
                              return Center(
                                child: Text(leccionesController.errorMessage!),
                              );
                            }

                            return GridView.builder( //Se hace una cuadricula de las lecciones.
                              //Le decimos cuantas lecciones hay.
                              itemCount: leccionesController.lecciones.length,

                              //Se dice de cuantas columnas sera la cuadricula.
                              gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
                                crossAxisCount: 2,
                                crossAxisSpacing: 5,
                                mainAxisSpacing: 5,
                              ),

                              padding: EdgeInsets.all(2.0),

                              //Se colocan los datos que van dentro de la cuadricula.
                              itemBuilder: (context, indice) {
                                final leccionActual = leccionesController.lecciones[indice];

                                //Tarjeta donde se muestra la leccion.
                                return Padding(
                                    padding: EdgeInsets.all(10.0),
                                    child: Card(
                                      borderOnForeground: true,
                                      color: leccionActual.colorFondo,
                                      elevation: 0,
                                      child: Column(
                                        children: [
                                          Padding(
                                              padding: EdgeInsets.symmetric(
                                                  horizontal: size.width * 0.01,
                                                  vertical: size.height * 0.01,
                                              ),
                                              child: Text(
                                                leccionActual.name,
                                                style: Theme.of(context).textTheme.titleMedium,
                                              )
                                          ),
                                          IconButton(
                                              onPressed: () {
                                                ScaffoldMessenger.of(context).showSnackBar(
                                                  const SnackBar(content: Text("Actividades de "
                                                      "aprendizaje")),
                                                );
                                                Navigator.push(
                                                  context,
                                                  MaterialPageRoute(
                                                    builder: (context) => AprendizajeView(
                                                        idLeccionSeleccionada: leccionActual.id),
                                                  ),
                                                );
                                              },
                                              icon: Image.asset(
                                                leccionActual.urlImage,
                                                width: 200,
                                                height: 60,
                                              ),
                                          ),
                                        ],
                                      ),
                                    ),
                                );
                              },
                            );
                          },
                        ),
                      )
                    ],
                  ),
              ),
          ),
    );
  }
}