package com.example.examen.Contrat

interface Kmcontrato {

    interface contratomodelo{
        fun CalcularKmporlitro(kminicial:Double, kmfinal:Double, litrosCargados: Double): Double
        fun calcularCostoPorKm(kmInicial: Double, kmFinal: Double, costoLitro: Double, litrosCargados: Double): Double
    }



    interface Presentador{
        fun CalcularKilometraje(kmInicial: Double, kmFinal: Double)
        fun CalcularCostoPorKm(kmInicial: Double, kmFinal: Double, costoLitro: Double, litrosCargados: Double)
    }

    interface  vista{
        fun ShowKilometraje(kilometraje: Double)
        fun ShowCostoPorKm(costoKm: Double)
        fun ShowErro();
    }
}
