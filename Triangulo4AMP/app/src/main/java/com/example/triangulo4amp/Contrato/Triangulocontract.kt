package com.example.triangulo4amp.Contrato

interface Triangulocontract {
    interface Triangulomodel{
        fun CalcularArea(lado1:Double, lado2:Double, lado3:Double): Double
        fun CalcularPerimetro(lado1:Double, lado2:Double, lado3:Double): Double
        fun VerificarTriangulo(lado1:Double, lado2:Double, lado3:Double): Boolean
        fun CalcularTipoTriangulo(lado1:Double, lado2:Double, lado3:Double): String
    }
    interface TrianguloPresentador{
        fun CalcularArea(lado1:Double, lado2:Double, lado3:Double)
        fun CalcularPerimetro(lado1:Double, lado2:Double, lado3:Double)
        fun CalcularTipoTriangulo(lado1:Double, lado2:Double, lado3:Double)
    }
    interface TrianguloVista{
        //fun ShowMenu();
        fun ShowARea(Area: Double);
        fun ShowPerimetro(Perimetro: Double);
        fun ShowTipo(Tipo: String);
        fun ShowError();
    }

}