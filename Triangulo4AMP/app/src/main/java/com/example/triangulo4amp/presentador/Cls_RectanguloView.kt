package com.example.triangulo4amp.presentador

import com.example.triangulo4amp.Contrato.RectanguloContrato

class Cls_RectanguloView: RectanguloContrato.Rectangulovista {


    private lateinit var presenter: RectanguloContrato.RectanguloPresentador
    fun setPresenter(presentadorr: RectanguloContrato.RectanguloPresentador){
        presenter= presentadorr;
    }


    fun inicioo(){
        println("Captura la base de un rectangulo ")
        val l1: Double = readln().toDouble()
        println("captura la altura del rectangulo")
        val l2: Double = readln().toDouble()



        println("--- Menu de opciones ---");
        println("[1] Calcular el Area .....")
        println("[2] Calcular el Perimetro .....")
        println("[3] Verificar triangulo.....")
        println("Elige una opcion.....")
        val op=readln().toString();

        when(op){
            "1"->presenter.CalcularArea(l1, l2 )
            "2"->presenter.CalcularPerimetro(l1,l2)
            "3"->presenter.VerificarRectangulo(l1 , l2 )

        }
    }

    override fun ShowARea(Area: Double) {
        println("El area del trriangulo es :${Area}");
    }

    override fun ShowPerimetro(Perimetro: Double) {
        println("El Perimetro del trriangulo es :${Perimetro} m2");
    }

    override fun ShowError() {
        println("No es posible");
    }
}