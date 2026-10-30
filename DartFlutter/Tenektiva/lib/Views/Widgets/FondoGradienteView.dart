import 'package:flutter/cupertino.dart';
import 'package:tenk/app/AppColors.dart';

/*Es un Widget envolvente no tiene nada mas que un fondo y puede recibir cualquier tipo de
elementos
*/
class FondoGradienteView extends StatelessWidget{
  final Widget child; //Contendio de la vista.

  const FondoGradienteView({super.key, required this.child});

  @override
  Widget build(BuildContext context) {
     return Container(
       //Se implementa un degradado.
       decoration: const BoxDecoration(
         gradient: LinearGradient(
           //Se coloca la orientacion para la posicion de los colores.
           begin: Alignment.topCenter,
           end: Alignment.bottomRight,

           //Se colocan los colores del fondo.
           colors: [AppColors.fondoG1, AppColors.fondoG2],
         ),
       ),

       //Ancho y alto maximo de la pantalla para el fondo.
       width: double.infinity,
       height: double.infinity,

       child: child,
     );
  }
}