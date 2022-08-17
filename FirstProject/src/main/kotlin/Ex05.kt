fun main() {
    caixaDagua()
    fizzBuzz()
    inverteTexto("Gabriel")
    println()
    println("${confereXO("oooxx")}")
}

fun caixaDagua() = println(2000 / 7 - 1)

fun fizzBuzz() {
    for (i in 1..50) {
        if (i % 3 == 0 && i % 5 == 0) {
            print("FizzBuzz ")
        } else if (i % 3 == 0) {
            print("Buzz ")
        } else if (i % 5 == 0) {
            print("Fizz ")
        } else print("$i ")
    }
    println()
}

fun inverteTexto(texto: String) {
    for (i in (texto.length - 1) downTo 0) print("${texto[i]}")
}

fun confereXO(texto: String): Boolean {
    var x = 0
    var o = 0
    for (i in texto.indices) {
        if (texto[i] == 'x') {
            x++
        } else if (texto[i] == 'o') {
            o++
        }
    }
    return (x == o && x != 0)
}
