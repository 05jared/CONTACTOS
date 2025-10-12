package com.example.examen.presentador

import com.example.examen.Contrat.Kmcontrato

class kmView: Kmcontrato.vista {
    private lateinit var presentador: Kmcontrato.Presentador

    fun setPresenter(p: Kmcontrato.Presentador){
        presentador = p
    }
    fun inicio(){
        println("---- Calculadora de Consumo de Gasolina ----")
        println("Captura el kilometraje inicial:")
        val kmInicial: Double = readln().toDouble()
        println("Captura el kilometraje final:")
        val kmFinal: Double = readln().toDouble()
        println("Captura los litros cargados:")
        val litros: Double = readln().toDouble()
        println("Captura el costo por litro de gasolina:")
        val costoLitro: Double = readln().toDouble()

        println("--- Menú de opciones ---")
        println("[1] Calcular Kilómetros por Litro")
        println("[2] Calcular Costo por Kilómetro")
        println("Elige una opción: ")
        val op = readln().toString()

        when(op){
            "1" -> presentador.CalcularKilometraje(kmInicial, kmFinal)
            "2" -> presentador.CalcularCostoPorKm(kmInicial, kmFinal, costoLitro, litros)
            else -> ShowErro()
        }

}

    override fun ShowKilometraje(kilometraje: Double) {
        println("El es: $kilometraje km/L")
    }

    override fun ShowCostoPorKm(costoKm: Double) {
        println("El costo por kilómetro recorrido es: $$costoKm")
    }

    override fun ShowErro() {
      println("Es invalido ");
    }
}