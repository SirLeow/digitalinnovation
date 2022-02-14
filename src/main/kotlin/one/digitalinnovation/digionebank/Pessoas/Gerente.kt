package one.digitalinnovation.digionebank.Pessoas

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Logavel

class Gerente (
    nome:String,
    cpf:String,
    salario:Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Logavel{
    override fun calculoAux(): Double = salario*0.4
    override fun login(): Boolean = senha == "senha123"
}