package com.example.triangulo4amp.presentador

import com.example.triangulo4amp.Contrato.Triangulocontract
import kotlin.io.println

class Cls_TrianguloView: Triangulocontract.TrianguloVista{

    private lateinit var presenter: Triangulocontract.TrianguloPresentador

    fun setPresenter(presentador: Triangulocontract.TrianguloPresentador){
        presenter=presentador;
    }

    fun inicio(){
        println("----Calculadora de Triangulo----- ");
        println("Captura el lado 1")
        val l1: Double = readln().toDouble()
        println("Captura el lado 2")
        val l2: Double = readln().toDouble()
        println("Captura el lado 3")
        val l3: Double = readln().toDouble()


        println("--- Menu de opciones ---");
        println("[1] Calcular el Area .....")
        println("[2] Calcular el Perimetro .....")
        println("[3] Calcular el Tipo .....")
        println("Elige una opcion.....")
        val op=readln().toString();

        when(op){
            "1"->presenter.CalcularArea(l1, l2,l3 )
            "2"->presenter.CalcularPerimetro(l1,l2,l3)
            "3"->presenter.CalcularTipoTriangulo(l1,l2,l3)

        }
    }

    override fun ShowARea(Area: Double) {
       println("El area del trriangulo es :${Area} m2");
    }

    override fun ShowPerimetro(Perimetro: Double) {
        println("El Perimetro del trriangulo es :${Perimetro} m2");
    }

    override fun ShowTipo(Tipo: String) {
        println("El Tipo de triangulo es:${Tipo}");
    }

    override fun ShowError() {
        println("No es posible");
    }

}