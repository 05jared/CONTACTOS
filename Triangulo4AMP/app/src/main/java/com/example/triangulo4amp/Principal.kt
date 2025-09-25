package com.example.triangulo4amp

import com.example.triangulo4amp.Contrato.Triangulocontract
import com.example.triangulo4amp.presentador.Cls_RectanguloView
import com.example.triangulo4amp.presentador.Cls_Rectangulopresenter
import com.example.triangulo4amp.presentador.Cls_TrianguloPresenter
import com.example.triangulo4amp.presentador.Cls_TrianguloView

fun main()
{
    println(".... calculadora Rectangulo...");
    val vista = Cls_RectanguloView();
    val presenter= Cls_Rectangulopresenter(vista);
    vista.setPresenter(presenter)
    vista.inicioo();
}