package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Jether"
    var cpf:String = "123.234.112-23"

}

fun main(){
    val teste = Pessoa()

    println(teste.nome)
    println(teste.cpf)
}