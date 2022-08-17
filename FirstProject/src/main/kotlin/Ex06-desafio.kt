fun main() {
    desafio()
}

fun desafio() {
    var meses = 0
    var investimentoAna = 1000f
    var investimentoPaula = 500f

    while (investimentoPaula < investimentoAna) {
        investimentoPaula += (investimentoPaula * 0.008f) + 500f
        investimentoAna += (investimentoAna * 0.002f) + 1000f
        meses++
    }
    println("foram $meses meses para Paula ter mais dinheiro investido do que Ana")
    println("no final Paula tinha: $investimentoPaula e Ana tinha: $investimentoAna")
}