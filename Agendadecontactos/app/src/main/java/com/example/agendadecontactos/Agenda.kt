package com.example.agendadecontactos
import androidx.collection.emptyLongSet

class Agenda {
private val  contactos=mutableListOf<Contacto>();

    fun agregarcontacto(nombre: String, telefono: String)
    {
        val contacto =Contacto(nombre,telefono);
        contactos.add(contacto);
        println("EL contacto ${nombre}....${telefono} han sido agreagdos" );
    }

    fun Mostrar_contactos()
    {
        if (contactos.isEmpty())
        {
            println("No hay contactos registrados");
        }
        else
        {
            contactos.forEach { contacto ->
                println("Nombre: ${contacto.nombre} \n Teléfono: ${contacto.telefono}");
            }

        }

    }

    fun buscarContactoPorNombre(nombre: String): Contacto? {
        for (c in contactos) {
            if (c.nombre.equals(nombre, ignoreCase = true)) {
                return c;
            }
        }
        return null
    }



}