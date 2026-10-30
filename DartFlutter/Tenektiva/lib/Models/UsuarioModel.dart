class UsuarioModel {
  final String email;
  final String password;

  const UsuarioModel({
     required this.email,
     required this.password,
   });

  UsuarioModel copyWith({
     String? name,
     String? email,
  }) {
    return UsuarioModel(
        email: name ?? this.email,
        password: email ?? this.password
    );
  }

}