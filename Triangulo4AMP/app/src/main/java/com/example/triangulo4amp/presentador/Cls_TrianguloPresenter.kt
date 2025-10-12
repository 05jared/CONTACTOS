package com.example.triangulo4amp.presentador

import com.example.triangulo4amp.Contrato.Triangulocontract
import com.example.triangulo4amp.modelo.Cls_TrianguloModel

class Cls_TrianguloPresenter(private val vista: Triangulocontract.TrianguloVista): Triangulocontract.TrianguloPresentador {


    private val modelo: Triangulocontract.Triangulomodel= Cls_TrianguloModel();



    override fun CalcularArea(lado1: Double, lado2: Double, lado3: Double) {
        if (modelo.VerificarTriangulo(lado1,lado2,lado3)){
            val a= modelo.CalcularArea(lado1,lado2,lado3)
            vista.ShowARea(a);
        }else{
            vista.ShowError();
        }
    }

    override fun CalcularPerimetro(
        lado1: Double,
        lado2: Double,
        lado3: Double
    ) {
       if (modelo.VerificarTriangulo(lado1,lado2,lado3)){
           val p= modelo.CalcularPerimetro(lado1,lado2,lado3)
           vista.ShowPerimetro(p);
       }else
           vista.ShowError();
    }


    override fun CalcularTipoTriangulo(
        lado1: Double,
        lado2: Double,
        lado3: Double
    ) {
        if (modelo.VerificarTriangulo(lado1,lado2,lado3)){
            val t=modelo.CalcularTipoTriangulo(lado1,lado2,lado3);
            vista.ShowTipo(t);
        }else{
            vista.ShowError();
        }
    }
}