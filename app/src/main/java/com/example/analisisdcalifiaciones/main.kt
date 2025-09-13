package com.example.analisisdcalifiaciones
fun main() {
    val analizador = analisiscalificaciones();

    analizador.CapturaCal();

    println("Las calificaciones son ${analizador.Calificaciones}");
    println("El promedio es ${analizador.calcularPromedio()}");
    println("Aprobados son ${analizador.contarAprobadas()}");
    println("Reprobados son ${analizador.contarReprobadas()}");
    println("Calificacion Maxima fue ${analizador.obtenerCalificacionMaxima()}");
    println("Calificacion Minima fue ${analizador.obtenerCalificacionMinima()}");
}