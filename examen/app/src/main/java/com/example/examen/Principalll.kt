package com.example.examen

import com.example.examen.presentador.cls_presenatdor
import com.example.examen.presentador.kmView

fun main(){
    println(".......Calcular Km............")
    val vista = kmView();
    val presenter= cls_presenatdor(vista);
    vista.setPresenter(presenter);
    vista.inicio();
}