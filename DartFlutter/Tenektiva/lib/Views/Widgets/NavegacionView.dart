import 'package:flutter/material.dart';

import '../../App/AppImages.dart';
import '../../app/AppColors.dart';

class NavegacionView extends StatelessWidget implements PreferredSizeWidget {
  final String titulo;

  const NavegacionView({
    super.key,
    required this.titulo,
  });

  @override
  Widget build(BuildContext context){
    return AppBar(
        title: Text(
          titulo,
          style: Theme.of(context).textTheme.titleLarge,
        ),
        centerTitle: true,

        leading: IconButton(
            onPressed: () {
              Navigator.pop(context);
            },
            icon: Image.asset(
              AppImages.volver,
              height: 30,
              width: 30,
            ),
        ),

        flexibleSpace: Container(
          decoration: const BoxDecoration(
            gradient: LinearGradient(
              colors: [
                AppColors.fondoG3,
                AppColors.fondoG3,
              ],
              begin: Alignment.topRight,
              end: Alignment.topLeft,
            ),
          ),
        ),

        actions: [
          IconButton(
            onPressed: () {
              ScaffoldMessenger.of(context).showSnackBar(
                  const SnackBar(content: Text("Te ayudamos..."))
              );
            },
            icon: Image.asset(
                AppImages.ayuda,
                height: 20,
                width: 20,
            ),
          )
        ],
    );
  }

  @override
  Size get preferredSize => Size.fromHeight(kToolbarHeight);
}