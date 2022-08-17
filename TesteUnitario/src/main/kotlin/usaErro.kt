/* Entendo a função throw e try catch alem das excessões */

fun main() {
    usaErro()
}

fun erro(a: Int, b: Int) {
    if (a == b) {
        throw NullPointerException()
    }
}


fun usaErro() {
    val i: String?
    val j: String?

    println("num 1")
    i = readLine()
    println("num 2")
    j = readLine()
    try {
        erro(i!!.toInt(), j!!.toInt())
    } catch (e: NullPointerException) {
        println("opa, deu errado")
    } finally {
        println("erro resolvido")
    }
}

