package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main(){
    val aseyoi = Funcionario(nome = "Marcio Pinto", cpf = "159.557.998-41", salario = BigDecimal.valueOf(2000.00))

    println(aseyoi.nome)
    println(aseyoi.cpf)
    println(aseyoi.salario)
}