package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Autenticacao
import one.digitalinnovation.digionebank.ClienteTipo
import one.digitalinnovation.digionebank.Pessoas.Cliente

fun main() {
    val queenbee = Cliente(
        nome = "Debora Cristina",
        cpf = "123.555.971-87",
        ClienteTipo.PF,
        senha = "123456"
    )

    println(queenbee)
    println("--------")
    Autenticacao.autentica(queenbee)
}