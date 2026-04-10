# Programacion Orientada a Objetos - POO I y POO II

Este repositorio reune mis trabajos practicos de Programacion Orientada a Objetos de la tecnicatura, organizados por unidad para mostrar mi proceso de aprendizaje real (nivel junior en evolucion).

---

## Objetivo Del Repositorio

Mostrar mi recorrido en POO desde ejercicios basicos hasta problemas mas completos con estructuras de datos.

---

## Estructura

```text
poo/
|-- poo-1-fundamentos/
|   |-- ejercicios-sueltos/
|   |-- circulo/
|   |-- rectangulo/
|   |-- velocidad/
|   |-- trabajoEntregar/
|   `-- trabajoParaPresentar/
|-- poo-2-estructuras/
|   |-- ejercicios-sueltos/
|   |-- Ejercicio2pila/
|   |-- Ejercico5HASHMAP/
|   |-- practicaRecursividadNodos/
|   |-- ejercicio9/
|   |-- ProyectoSilvia/
|   `-- ...
|-- README.md
`-- .gitignore
```

---

## Contenido Por Unidad

### POO I - Fundamentos

- Sintaxis de Java y estructuras de control.
- Metodos y paso de parametros.
- Creacion de clases y objetos.
- Constructores y modelado inicial.
- Ejercicios de practica incremental.

### POO II - Estructuras Y Aplicacion

- Uso de colecciones (`Stack`, `HashMap`, `List`).
- Resolucion de ejercicios con nodos y arboles.
- Validaciones y organizacion de datos.
- Mini proyectos y practicas integradoras.
- Ejemplos con interfaz grafica (`JFrame` en `ProyectoSilvia`).

---

## Los 4 Pilares De La POO (Aplicados En Mis Ejercicios)

1. Abstraccion
Se modelan entidades del mundo real como clases: `Peliculas`, `Vehiculo`, `Paciente`, `Mascota`, `Sucursal`.

2. Encapsulamiento
Uso de atributos privados + getters/setters para proteger estado interno.
Ejemplo: `poo-2-estructuras/Ejercicio2pila/Vehiculo.java`.

3. Herencia
Clases hijas que reutilizan comportamiento de una clase base.
Ejemplo: `poo-2-estructuras/Ejercicio2pila/Auto.java` extiende `Vehiculo`.

4. Polimorfismo
Sobrescritura de metodos y diferentes comportamientos segun el objeto.
Ejemplo: `toString()` en `poo-2-estructuras/ejemplos_hashmap/veterinaria/Mascota.java`.

---

## Aprendizajes Destacados

- Aprendi a pasar de ejercicios simples a problemas mas cercanos a casos reales.
- Mejore en organizacion de clases y separacion de responsabilidades.
- Entendi cuando usar cada estructura de datos segun el problema.
- Reforce buenas practicas basicas sin perder claridad en codigo.

---

## Como Ejecutar Un Ejercicio Java

Ejemplo general desde la raiz del repo:

```powershell
cd poo-2-estructuras/Ejercicio2pila
javac *.java
java Ejercicio2pila.Main
```

Nota: algunos ejercicios usan `package` y otros estan en paquete por defecto.

---

## Autor

Emanuel Moya  
GitHub: https://github.com/osomoya94

