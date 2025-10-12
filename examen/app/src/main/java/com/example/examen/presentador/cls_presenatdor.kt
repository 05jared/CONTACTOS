package com.example.examen.presentador

import com.example.examen.Contrat.Kmcontrato
import com.example.examen.modelo.cls_modelo

class cls_presenatdor (private val vista: Kmcontrato.vista): Kmcontrato.Presentador {


    private val modelo : Kmcontrato.contratomodelo= cls_modelo();

    override fun CalcularKilometraje(kmInicial: Double, kmFinal: Double) {
        if (kmFinal<=kmInicial)
        {
            vista.ShowErro()
        }
        val kilometraje = kmFinal-kmInicial;
        vista.ShowKilometraje(kilometraje)
    }

    override fun CalcularCostoPorKm(
        kmInicial: Double,
        kmFinal: Double,
        costoLitro: Double,
        litrosCargados: Double
    ) {
        if (kmFinal <= kmInicial || costoLitro <= 0 || litrosCargados <= 0) {
            vista.ShowErro()
        }
       val costo = modelo.calcularCostoPorKm(kmInicial, kmFinal, costoLitro, litrosCargados);

        vista.ShowCostoPorKm(costoLitro)
    }
}