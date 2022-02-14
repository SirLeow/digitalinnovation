package one.digitalinnovation.digionebank.Funcionarios

import one.digitalinnovation.digionebank.Funcionario

class Analista(
    nome:String,
    cpf:String,
    salario:Double
) : Funcionario(nome, cpf, salario) {
    override fun calculoAux(): Double = salario * 0.1
}