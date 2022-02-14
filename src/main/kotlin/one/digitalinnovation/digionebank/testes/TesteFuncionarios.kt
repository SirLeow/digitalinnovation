package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Autenticacao
import one.digitalinnovation.digionebank.Pessoas.Analista
import one.digitalinnovation.digionebank.Pessoas.Gerente
import one.digitalinnovation.digionebank.Impressao

fun main() {
    val cheetos = Analista(nome = "Gabriel Coelho", cpf = "123.325.147-91", salario = 2000.0)
    val leow = Gerente(nome = "Thiago Barros", cpf = "147.058.495-80", salario = 4000.0, senha = "senha125")
    Impressao.Relatorio(cheetos)
    Impressao.Relatorio(leow)
    Autenticacao.autentica(leow)
}
