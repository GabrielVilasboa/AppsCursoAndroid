/* If e else */
fun main() {
    val cargo = "Coordenador"
    println("Bonus é igual á ${distribuiSalario(cargo)}")
}

fun distribuiSalario(string: String): Float {

    return when (string.lowercase()) {
        "gerente" -> 2000f
        "coordenador" -> 1500f
        "engenheiro de software" -> 1000f
        "estagiario" -> 500f
        else -> 0f
    }
}
