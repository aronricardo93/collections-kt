package one.digitalinnovation.collection

fun main() {
    val nomes = Array<String> (3){""}

    nomes[0] = "Aron"
    nomes[1] = "Cintia"
    nomes[2] = "Geraldo"

    for (nome in nomes) println(nome)

    val nomes2 = arrayOf("Zé", "Noah", "Levi")

    println("-----------------------")
    nomes2.sort()
    nomes2.forEach { println(it) }
}