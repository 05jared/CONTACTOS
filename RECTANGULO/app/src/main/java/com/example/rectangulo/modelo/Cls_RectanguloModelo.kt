package com.example.rectangulo.modelo

import com.example.rectangulo.Contrato.RectanguloContrato


class Cls_RectanguloModelo: RectanguloContrato.contratomodelo{
    override fun CalcularArea(base: Double, altura: Double): Double {
        val s: Double=(base * altura);
        return s;
    }

    override fun CalcularPerimetro(base: Double, altura: Double): Double {
        val p: Double= 2*(base+altura);
        return p
    }

    override fun VerificarRectangulo(base: Double, altura: Double): Boolean {
        return base ==altura;
    }