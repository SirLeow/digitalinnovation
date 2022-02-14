package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main(){
    val sother = Pessoa(nome = "Luiz Henrique", cpf = "123.241.334-87")

    println(sother.nome)
    println(sother.cpf)
}