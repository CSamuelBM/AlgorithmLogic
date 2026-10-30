import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:tenk/Views/Auth/ActividadView.dart';
import 'package:tenk/app/AppColors.dart';
import 'package:tenk/controllers/AprendizajeController.dart';
import 'package:tenk/views/widgets/FondoGradienteView.dart';
import 'package:tenk/views/widgets/NavegacionView.dart';

import '../../App/AppImages.dart';

class AprendizajeView extends StatelessWidget{
  final String idLeccionSeleccionada;

  AprendizajeView({
    super.key,
    required this.idLeccionSeleccionada,
  });

  @override
  Widget build(BuildContext context) {
    Size size = MediaQuery.of(context).size;

    return Scaffold(
      appBar: NavegacionView(
          titulo: 'Aprendizaje $idLeccionSeleccionada'
      ),
      body: FondoGradienteView(
          child: SafeArea(
              child: Expanded(
                  child: Consumer<AprendizajeController>(
                      builder: (context, aprendizajeController, child) {
                        SizedBox(
                            height: size.height * 0.02,
                            width: size.width * 0.02 ,
                        );

                        final aprendizajeFiltrado = aprendizajeController.aprendizaje
                              .where((aprendizaje) => aprendizaje.idLeccion ==
                              idLeccionSeleccionada).toList();

                        if(aprendizajeFiltrado.isEmpty){
                          return const Center(
                            child: Text('No hay aprendizaje en esta leccion'),
                          );
                        }

                        if(aprendizajeController.isLoading){
                          return const Center(
                            child: CircularProgressIndicator(),
                          );
                        }

                        if(aprendizajeController.errorMessage != null){
                          return Center(
                            child: Text(aprendizajeController.errorMessage!),
                          );
                        }

                        return Column(
                          children: [
                            Expanded(
                                child: ListView.builder(
                                  itemCount: aprendizajeFiltrado.length,

                                  padding: EdgeInsets.all(12.0),

                                  itemBuilder: (context, indice) {
                                    final aprendizajeActual = aprendizajeFiltrado[indice];
                                    return Padding(
                                        padding: const EdgeInsets.all(12.0),
                                        child: Container(
                                          decoration: BoxDecoration(
                                            gradient: LinearGradient(
                                              colors: [
                                                AppColors.fondoInput,
                                                AppColors.textoPrincipal
                                              ],

                                              begin: Alignment.topLeft,
                                              end: Alignment.topRight,
                                            ),
                                            borderRadius: BorderRadius.circular(8),
                                          ),
                                          child: ListTile(
                                            leading: Text(
                                                aprendizajeActual.id,
                                                style: Theme.of(context).textTheme.bodyMedium,
                                            ),
                                            title: Text(
                                                aprendizajeActual.name,
                                                style: Theme.of(context).textTheme.titleMedium,
                                            ),
                                            subtitle: Text(
                                                 '${aprendizajeActual.fechaCreacion.day}/'
                                                     '${aprendizajeActual.fechaCreacion.month}/'
                                                     '${aprendizajeActual.fechaCreacion.year}',
                                                 style: Theme.of(context).textTheme.bodyMedium,
                                            ),
                                            trailing: IconButton(
                                                onPressed: () {
                                                  Navigator.push(
                                                      context,
                                                      MaterialPageRoute(
                                                          builder: (context) => ActividadView(
                                                              idAprendizajeSeleccionado: aprendizajeActual.id)
                                                      ),
                                                  );
                                                  ScaffoldMessenger.of(context).showSnackBar(
                                                     SnackBar(content: Text(
                                                        'Actividad ${aprendizajeActual.id}',
                                                    )),
                                                  );
                                                },
                                                icon: Image.asset(
                                                  AppImages.ingresarAct,
                                                  height: 30,
                                                  width: 30,
                                                ),
                                            ),
                                          ),
                                        ),
                                    );
                                  },
                                ),
                            )
                          ],
                        );
                      },
                  ),
              ),
          ),
      ),
    );
  }

}