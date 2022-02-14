package one.digitalinnovation.digionebank.Pessoas

import one.digitalinnovation.digionebank.Funcionario

class Analista(
    nome:String,
    cpf:String,
    salario:Double
) : Funcionario(nome, cpf, salario) {
    override fun calculoAux(): Double = salario * 0.1
}