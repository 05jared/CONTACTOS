package com.example.rectangulo.Contrato

interface RectanguloContrato {
    interface contratomodelo{
        fun CalcularArea(base:Double, altura:Double): Double
        fun CalcularPerimetro(base:Double, altura:Double): Double
        fun VerificarRectangulo(base:Double, altura:Double): Boolean
    }

    interface RectanguloPresentador{
        fun CalcularArea(base:Double, altura:Double)
        fun CalcularPerimetro(base:Double, altura:Double)
        fun VerificarRectangulo(base:Double, altura:Double)
    }

    interface Rectangulovista{
        fun ShowARea(Area: Double);
        fun ShowPerimetro(Perimetro: Double);
        fun ShowError();

    }
}