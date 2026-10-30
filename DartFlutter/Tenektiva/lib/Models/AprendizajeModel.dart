class AprendizajeModel {
  final String id;
  final String idLeccion;
  final String name;
  final DateTime fechaCreacion;

  const AprendizajeModel({
    required this.id,
    required this.idLeccion,
    required this.name,
    required this.fechaCreacion,
  });

  AprendizajeModel copyWith({
    String? id,
    String? idLeccion,
    String? name,
    DateTime? fechaCreacion,
  }) {
    return AprendizajeModel(
        id: id ?? this.id,
        idLeccion: idLeccion ?? this.idLeccion,
        name: name ?? this.name,
        fechaCreacion: fechaCreacion ?? this.fechaCreacion
    );
  }

}