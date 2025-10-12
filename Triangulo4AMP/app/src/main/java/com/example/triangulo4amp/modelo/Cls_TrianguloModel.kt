package com.example.triangulo4amp.modelo

import androidx.collection.emptyLongSet
import com.example.triangulo4amp.Contrato.Triangulocontract
import kotlin.math.sqrt

class Cls_TrianguloModel: Triangulocontract.Triangulomodel {
    override fun CalcularArea(
        lado1: Double,
        lado2: Double,
        lado3: Double
    ): Double {
        val s: Double=(lado1+lado2+lado3)/2;
        val area: Double=sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        return area;
    }

    override fun CalcularPerimetro(
        lado1: Double,
        lado2: Double,
        lado3: Double
    ): Double {
        return lado1+lado2+lado3;
    }

    override fun VerificarTriangulo(
        lado1: Double,
        lado2: Double,
        lado3: Double
    ): Boolean {
        if (lado1+lado2>lado3 && lado1+lado3 >lado2 && lado3+lado2>lado1)
            return true;
        else
            return false;
    }

    override fun CalcularTipoTriangulo(
        lado1: Double,
        lado2: Double,
        lado3: Double
    ): String {
        if (lado1==lado2 && lado2==lado3)
            return "Equilatero..........";
        else if (lado1!=lado2 && lado2!=lado3)
            return "Escaleno"
        else
            return "Isoceles"
    }
}