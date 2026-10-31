# Generador de Números Pseudoaleatorios 🎲

Aplicación interactiva de consola desarrollada en Java para la generación y análisis de números pseudoaleatorios utilizando métodos **No Congruenciales** y **Congruenciales**.

El proyecto implementa principios de diseño orientados a objetos como **Model-View-Controller (MVC)**, uso de **interfaces**, **herencia** y **modularidad** para el reuso eficiente de código.

---

## 🛠️ Algoritmos Implementados

### 1. Métodos No Congruenciales
* **Cuadrados Medios**
* **Productos Medios**
* **Multiplicador Constante**

### 2. Métodos Congruenciales
* **Algoritmo Lineal**
* **Algoritmo Multiplicativo**
* **Algoritmo Aditivo**

---

## 🏗️ Arquitectura del Proyecto

El código está estructurado bajo el patrón **MVC** para garantizar una separación clara de responsabilidades:

```text
src/
└── com/
    └── pseudoaleatorios/
        ├── controller/ # Lógica de control y coordinación entre vista y modelos
        ├── model/      # Algoritmos pseudoaleatorios, herencia e interfaces
        ├── view/       # Menú interactivo y captura de datos por consola
        └── Main        # Clase principal ejecuta la vista