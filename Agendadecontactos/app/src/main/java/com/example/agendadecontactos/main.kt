package com.example.agendadecontactos

fun main (){
    val agenda= Agenda();
    var op :Int;
    do {
        println("Agenda");
        println("1.- Añadir Nuevo contacto");
        println("2.- Mostrar Contactos");
        println("3.- buscar contactos");
        println("4.- Salir");
        println("------------------------------------------------------")
        println("Elige tu opcion");
        op = readln().toInt();


        when (op) {
            1 -> {
                print("Ingresa el nombre: ")
                val nombre = readln();
                print("Ingresa el teléfono: ");
                val telefono = readln();
                agenda.agregarcontacto(nombre, telefono);
            }
            2 -> {
                agenda.Mostrar_contactos()
            }

            3 -> {
                print("Ingresa el nombre a buscar: ")
                val nombre = readln()
                val contacto = agenda.buscarContactoPorNombre(nombre)
                when (contacto) {
                    null -> println("No se encontró el contacto.")
                    else -> println("Contacto encontrado: ${contacto.nombre} - ${contacto.telefono}");
                }
            }

            4 -> {
                println("Saliendo de la agenda...><");
            }
            else -> {
                println("Opción no válida, intenta de nuevo.");
            }
        }
    }while (op!=4)

}