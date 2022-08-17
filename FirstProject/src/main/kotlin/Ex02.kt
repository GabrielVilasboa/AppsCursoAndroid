/* Praticando funções, funções de uma unica linha e funções pré extabelecidas do Kotlin */

fun main() {
    val string = "Gabriel de Carvalho Vilasboa"
    val num = 2

    tranformaAno(num)
    contaString(string)
    println("O cubo de $num é : ${calculaCubo(num)}")
    println("$num milhas = ${converteMilhas(num.toFloat())}Km")
    println("A string $string convertida é igual á ${converteAX(string)}")
}

//Exercicio 1
fun tranformaAno(anos: Int) {
    println("$anos anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 8760} horas")
    println("${anos * 525600} dias")
    println("${anos * 31536000} segundos")
}

//Exercicio 2
fun contaString(string: String) = println("A string tem ${string.length} caracteres")

//Exercicio 3
fun calculaCubo(num: Int): Int = (num * num) * num

//Exercicio 4
fun converteMilhas(milhas: Float): Float = (milhas * 1.6f)

//Exercicio 5
fun converteAX(string: String): String = string.lowercase().replace("a", "x")