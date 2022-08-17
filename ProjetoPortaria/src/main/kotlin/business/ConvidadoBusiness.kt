package business

import entity.Convidado

class ConvidadoBusiness {

    fun maiorIdade(idade:Int) = idade >= 18

    fun tipoValido(tipo: String): Boolean = (tipo == "comum" || tipo == "luxo" || tipo == "premium")

    fun codigoValido(convidado: Convidado) = when (convidado.tipo) {
        "comum" -> convidado.codigo.startsWith("xt")
        "premium", "luxo" -> convidado.codigo.startsWith("xt")
        else -> false
    }
}
