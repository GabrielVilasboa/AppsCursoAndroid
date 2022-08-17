package control

import business.ConvidadoBusiness
import entity.Convidado

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()

    init {
        println(controle())
    }

    private fun controle(): String {

        val idade = Console.getInt("Digite a Idade")
        if (!convidadoBusiness.maiorIdade(idade)) return "Menores de idade não são permitidos!"

        val tipoConvite = Console.readString("Qual o tipo de convite?")
        if(!convidadoBusiness.tipoValido(tipoConvite)) return "Convite Invalido!"

        val codigo = Console.readString("Qual o código do convido?")
        val convidado = Convidado(tipoConvite, codigo)
        if(!convidadoBusiness.codigoValido(convidado)) return "Convite Invalido!"

        return "Welcome!"
    }

}
