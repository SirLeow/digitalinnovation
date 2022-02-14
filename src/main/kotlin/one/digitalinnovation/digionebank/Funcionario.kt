package one.digitalinnovation.digionebank


abstract class Funcionario(
    nome:String,
    cpf:String,
    val salario:Double
): Pessoa(nome, cpf) {
    protected abstract fun calculoAux()
}