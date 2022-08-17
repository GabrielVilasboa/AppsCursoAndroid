fun main() {
    val op = "cres"
    imprimeNum(op)
    println("A soma de 1 a 500 é ${somaTudo()}")
    escada(3)
}

fun imprimeNum(op: String) {
    when (op) {
        "cres" -> {
            for (i in 1..50) {
                if ((i % 5) == 0) continue
                print("$i ")
            }
        }
        "decres" -> for (i in 50 downTo 0) print("$i ")
    }
    print("\n")
}

fun somaTudo(): Int {
    var soma = 0
    for (i in 1..500) soma += i
    return soma
}

fun escada(tam: Int) {
    var controle = 1

    for (i in 0..tam) {
        for (j in 1..controle) {
            print("#")
        }
        controle++
        println()
    }
}