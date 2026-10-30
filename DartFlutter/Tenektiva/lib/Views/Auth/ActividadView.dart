import 'package:flutter/material.dart';
import 'package:flutter_markdown/flutter_markdown.dart';
import 'package:provider/provider.dart';
import 'package:tenk/Controllers/ActividadController.dart';
import 'package:tenk/Views/Widgets/FondoGradienteView.dart';
import 'package:tenk/Views/Widgets/NavegacionView.dart';

class ActividadView extends StatelessWidget{
  final String idAprendizajeSeleccionado;

  ActividadView({
    super.key,
    required this.idAprendizajeSeleccionado,
  });

  @override
  Widget build(BuildContext context){
    Size size = MediaQuery.of(context).size;

    return Scaffold(
      appBar: NavegacionView(
          titulo: 'Actividad $idAprendizajeSeleccionado'
      ),
      body: FondoGradienteView(
        child: Consumer<ActividadController>(
          builder: (context, actividadController, child) {
            SizedBox(
              height: size.height * 0.02,
              width: size.width * 0.02,
            );

            final actividadFiltrada = actividadController.actividad
                .where((actividad) => actividad.idAprendizaje ==
                idAprendizajeSeleccionado).toList();

            if(actividadFiltrada.isEmpty){
              return const Center(
                child: Text('No hay actividades en este aprendizaje'),
              );
            }

            if(actividadController.isLoading){
              return const Center(
                child: CircularProgressIndicator(),
              );
            }

            if(actividadController.errorMessage != null){
              return Center(
                child: Text(actividadController.errorMessage!),
              );
            }

            final actividadActual = actividadFiltrada.first;

            return SingleChildScrollView(
              padding: EdgeInsets.all(16.0),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    actividadActual.titulo,
                    style: Theme.of(context).textTheme.titleLarge,
                  ),

                  const SizedBox(height: 30,),

                  Text(
                      'Instrucciones',
                      textAlign: TextAlign.center,
                      style: Theme.of(context).textTheme.bodyMedium,
                  ),

                  const SizedBox(height: 20,),

                  Text(
                    actividadActual.instrucciones,
                    style: Theme.of(context).textTheme.titleMedium,
                  ),

                  const SizedBox(height: 30,),

                  Text(
                    'Aprendizaje',
                    textAlign: TextAlign.center,
                    style: Theme.of(context).textTheme.bodyMedium,
                  ),

                  const SizedBox(height: 20,),

                  MarkdownBody(
                      data: actividadActual.contenido,
                      styleSheet: MarkdownStyleSheet(
                        p: Theme.of(context).textTheme.bodyLarge,
                      ),
                  ),

                  const SizedBox(height: 30,),

                  ElevatedButton(
                      onPressed: () {
                        ScaffoldMessenger.of(context).showSnackBar(
                          SnackBar(content: Text(
                            'Cuestionario'
                          )),
                        );
                      },
                      child: const Text('Formulario'),
                  ),
                ],
              ),
            );
          },
        ),
      ),
    );
  }
}