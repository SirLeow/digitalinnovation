package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Sother"
    var cpf:String = "123.234.112-23"

    inner class Endereco(){
        var rua:String = "Travessa Angustura"
    }

}

fun main(){
    val sother = Pessoa()

    println(sother.nome)
    println(sother.cpf)
    println(sother.Endereco().rua)
}