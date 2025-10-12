package com.example.examen.modelo

import com.example.examen.Contrat.Kmcontrato

class cls_modelo : Kmcontrato.contratomodelo {
    override fun CalcularKmporlitro(
        kminicial: Double,
        kmfinal: Double,
        litrosCargados: Double
    ): Double {
        return (kmfinal-kminicial)/litrosCargados;
    }

    override fun calcularCostoPorKm(
        kmInicial: Double,
        kmFinal: Double,
        costoLitro: Double,
        litrosCargados: Double
    ): Double {
        val distancia= kmFinal-kmInicial;
        val costoTotal= costoLitro*litrosCargados;
        return costoTotal/distancia;
    }
}