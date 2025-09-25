package com.example.rectangulo

import com.example.rectangulo.presentador.Cls_RectanguloView
import com.example.rectangulo.presentador.Cls_Rectangulopresenter

fun main()
{
    println(".... calculadora Rectangulo...");
    val vista = Cls_RectanguloView();
    val presenter= Cls_Rectangulopresenter(vista);
    vista.setPresenter(presenter)
    vista.inicioo();
}