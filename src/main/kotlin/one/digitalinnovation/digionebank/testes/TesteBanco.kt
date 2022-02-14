package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco("DigiOne", 12)
    val digiOneBank2 = digiOneBank.copy(nome = "Bradesco")

    println(digiOneBank.info())
    println(digiOneBank2.info())


}