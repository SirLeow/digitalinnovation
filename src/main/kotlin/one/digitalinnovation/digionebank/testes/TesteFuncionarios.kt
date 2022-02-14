package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionarios.Analista
import one.digitalinnovation.digionebank.Funcionarios.Gerente
import one.digitalinnovation.digionebank.Impressao

fun main() {
    val cheetos = Analista(nome = "Gabriel Coelho", cpf = "123.325.147-91", salario = 2000.0)
    val leow = Gerente(nome = "Thiago Barros", cpf = "147.058.495-80", salario = 4000.0)
    Impressao.Relatorio(cheetos)
    Impressao.Relatorio(leow)
}
