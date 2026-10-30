class ActividadModel {
  final String id;
  final String idAprendizaje;
  final String titulo;
  final String instrucciones;
  final String contenido;

  const ActividadModel({
    required this.id,
    required this.idAprendizaje,
    required this.titulo,
    required this.instrucciones,
    required this.contenido,
  });

  ActividadModel copyWith({
    String? id,
    String? idAprendizaje,
    String? titulo,
    String? instrucciones,
    String? contenido,
  }) {
    return ActividadModel(
        id: id ?? this.id,
        idAprendizaje: idAprendizaje ?? this.idAprendizaje,
        titulo: titulo ?? this.titulo,
        instrucciones: instrucciones ?? this.instrucciones,
        contenido: contenido ?? this.contenido
    );
  }
}