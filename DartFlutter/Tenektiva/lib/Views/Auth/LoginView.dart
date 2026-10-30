import 'package:flutter/material.dart';
import 'package:tenk/controllers/LoginController.dart';
import 'package:tenk/views/widgets/FondoGradienteView.dart';

import '../../App/AppImages.dart';

class LoginView extends StatefulWidget {
  const LoginView({super.key});

  @override
  State <LoginView> createState() => _LoginViewState();
}

class _LoginViewState extends State<LoginView> {
  //Se realiza una instancia del controller.
  final LoginController _controller = LoginController();

  //Llave para validar el formulario.
  final _formKey = GlobalKey<FormState>();

  //Text Field para recibir los datos.
  final TextEditingController _tecEmail = TextEditingController();
  final TextEditingController _tecPassword = TextEditingController();

  //Se limpia los text field
  @override
  void dispose() {
    _tecEmail.dispose();
    _tecPassword.dispose();
    _controller.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context){
    Size size = MediaQuery.of(context).size; // Se crea una variable para definir los tamaños.

    return Scaffold(
      body: Form(key: _formKey,
        child: FondoGradienteView(
        child: SingleChildScrollView(
          child: Container(
            //Se define el ancho de la pantalla.
            width: size.width,

            padding: EdgeInsets.symmetric(
              horizontal: size.width * 0.08,
              vertical: size.height * 0.04,
            ),

            //La Column organiza todos sus componentes en una columna.
            child: Column(
              //El Children es una lista de cualquier elemento.
              children: [
                Image.asset(
                  AppImages.logo,
                  width: size.width * 0.3,
                  height: size.height * 0.3,
                  fit: BoxFit.contain,
                ),

                //Hace una separcion entre elementos.
                SizedBox(
                  height: size.height * 0.004,
                ),

                Text(
                  "Bienvenido",
                  textAlign: TextAlign.center,
                  //Traemos estilos de titulos.
                  style: Theme.of(context).textTheme.titleMedium,
                ),

                SizedBox(
                  height: size.height * 0.004,
                ),

                Text(
                  "Iniciar Sesion",
                  textAlign: TextAlign.center,
                  style: Theme.of(context).textTheme.titleLarge,
                ),

                SizedBox(
                  height: size.height * 0.04,
                ),

                TextFormField(
                  controller: _tecEmail,
                  decoration: const InputDecoration(
                    labelText: 'Correo Electronico',
                  ),
                  keyboardType: TextInputType.emailAddress,
                  validator: (value){
                    if(value == null || value.isEmpty){
                      return 'Ingresa Un Correo Electronico....';
                    }
                    return null;
                  },
                ),

                SizedBox(
                  height: size.height * 0.04,
                ),

                TextFormField(
                  controller: _tecPassword,
                  decoration: const InputDecoration(
                    labelText: 'Contraseña',
                  ),
                  obscureText: true,
                  validator: (value){
                    if(value == null || value.isEmpty) {
                      return 'Ingresa Una Contraseña....';
                    }
                    return null;
                  },
                ),

                SizedBox(
                  height: size.height * 0.04,
                ),

                _controller.isLoading ? const CircularProgressIndicator()
                    : ElevatedButton(
                  onPressed: () async {
                  //Se validan que no tengamos datos nulos
                  if(_formKey.currentState!.validate()){
                    //Mandar los datos al controlador
                    bool exito = await _controller.loginUsuario(
                        _tecEmail.text, _tecPassword.text);

                    //Navegacion a otra pantalla
                    if(exito && mounted){
                      ScaffoldMessenger.of(context).showSnackBar(
                        SnackBar(content: Text(
                          'Bienvenido..',
                          style: Theme.of(context).textTheme.titleSmall,
                          ),
                        ),
                      );
                      Navigator.pushReplacementNamed(context, '/menu');
                    }
                    else{
                      ScaffoldMessenger.of(context).showSnackBar(
                        SnackBar(
                          content: Text(_controller.errorMenssage ?? 'Error'),
                          duration: const Duration(seconds: 3),
                        ),
                      );
                    }
                  }
                },
                  style: ElevatedButton.styleFrom(
                    //Tamaño del boton
                    padding: EdgeInsets.symmetric(
                      horizontal: 90,
                      vertical: 6,
                    ),
                  ),
                  child: const Text('Entrar'),
                ),

                SizedBox(
                  height: size.height * 0.04,
                ),

                //Si hay error de espacio envolver el layout con Expanded(child: Row(),),
                Row(
                  children: [
                    TextButton(
                      style:  TextButton.styleFrom(
                        padding: EdgeInsets.zero,
                        minimumSize: Size.zero,
                        tapTargetSize: MaterialTapTargetSize.shrinkWrap,
                      ),
                        onPressed: () {
                          ScaffoldMessenger.of(context).showSnackBar(
                            SnackBar(content: Text(
                               'Se envio un correo de recuperacion.',
                               style: Theme.of(context).textTheme.titleSmall,
                             )),
                          );
                        },
                        child: Text(
                            'No recuerdo mi contraseña',
                            style: Theme.of(context).textTheme.titleMedium,
                        ),
                    ),

                    SizedBox(
                      width: size.width * 0.03,
                    ),

                    TextButton(
                      style: TextButton.styleFrom(
                        padding: EdgeInsets.zero,
                        minimumSize: Size.zero,
                        tapTargetSize: MaterialTapTargetSize.shrinkWrap,
                      ),
                        onPressed: () {
                          ScaffoldMessenger.of(context).showSnackBar(
                            SnackBar(content: Text(
                                 'Registro.',
                                  style: Theme.of(context).textTheme.titleSmall,
                              ),
                            ),
                          );
                        },
                        child: Text(
                          "Registrate",
                          style: Theme.of(context).textTheme.titleMedium,
                        ),
                    ),
                  ],
                ),
              ],
            ),
          ),
        ),
       ),
      ),
    );
  }

}