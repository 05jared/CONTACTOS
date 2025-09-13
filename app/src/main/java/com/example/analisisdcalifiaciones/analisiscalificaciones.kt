package com.example.analisisdcalifiaciones

class analisiscalificaciones {

        val Calificaciones = mutableListOf<Float>();
        fun CapturaCal() {
            println("📘 Captura tus calificaciones:")
            for (i in 1..7) {
                print("Calificación $i: ")
                val cal: Float = readln().toFloat()
                Calificaciones.add(cal);
            }
        }

        fun calcularPromedio(): Float {
            if (Calificaciones.size == 0) {
                return 0f
            } else {
                var suma = 0f
                for (c in Calificaciones) {
                    suma += c
                }
                return suma / Calificaciones.size
            }
        }

        fun contarAprobadas(): Int {
            var contador = 0;
            for (c in Calificaciones) {
                if (c >= 7) {
                    contador++;
                }
            }
            return contador
        }

        fun contarReprobadas(): Int {
            var contador = 0;
            for (cal in Calificaciones) {
                if (cal < 7) {
                    contador++;
                }
            }
            return contador;
        }

        fun obtenerCalificacionMaxima(): Float {
            var max = Calificaciones[0];
            for (cal in Calificaciones) {
                if (cal > max) {
                    max = cal;
                }
            }
            return max;
        }

        fun obtenerCalificacionMinima(): Float {
            var min = Calificaciones[0];
            for (cal in Calificaciones) {
                if (cal < min) {
                    min = cal;
                }
            }
            return min;
        }

}