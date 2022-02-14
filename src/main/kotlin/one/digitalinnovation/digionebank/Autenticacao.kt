package one.digitalinnovation.digionebank

class Autenticacao {
    companion object {
        fun autentica(logavel: Logavel) {
            if (logavel.login()){ println("Logado")} else { println("Senha errada")}
        }
    }
}