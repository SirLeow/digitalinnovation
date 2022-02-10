package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }
    println()
    ClienteTipo.values().forEach { it ->
        println("${it.name} -  ${it.descricao}")
    }
    println()

    println("${ClienteTipo.PF.name} - ${ClienteTipo.PF.descricao}" +
            "\n${ClienteTipo.PJ.name} - ${ClienteTipo.PJ.descricao}")

}