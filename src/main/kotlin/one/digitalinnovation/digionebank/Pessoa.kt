package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Sother"
    var cpf:String = "123.234.112-23"
    private set //torna incapaz a alteração do falor do cpf fora da classe Pessoa

    inner class Endereco(){
        var rua:String = "Travessa Angustura"
    }

    fun pessoaInfo()  = "$nome e $cpf"
}

fun main(){
    val sother = Pessoa()

    println(sother.pessoaInfo())
    println(sother.Endereco().rua)
}