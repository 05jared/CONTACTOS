package com.example.triangulo4amp.presentador

import com.example.triangulo4amp.Contrato.RectanguloContrato
import com.example.triangulo4amp.modelo.Cls_RectanguloModelo

class Cls_Rectangulopresenter(private val vista : RectanguloContrato.Rectangulovista):
    RectanguloContrato.RectanguloPresentador  {

        private val modelo: RectanguloContrato.contratomodelo= Cls_RectanguloModelo();

    override fun CalcularArea(base: Double, altura: Double) {
        if (modelo.VerificarRectangulo(base, altura))
        {
            val a= modelo.CalcularArea(base,altura)
            vista.ShowARea(a)
        }else
        {
            vista.ShowError();
        }
    }

    override fun CalcularPerimetro(base: Double, altura: Double) {
       if (modelo.VerificarRectangulo(base,altura)) {
           val p = modelo.CalcularArea(base, altura)
           vista.ShowPerimetro(p)
       }
    }

    override fun VerificarRectangulo(base: Double, altura: Double) {

    }
}