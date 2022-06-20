package one.digitalinnovation.collection

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0) //chave e valor
    val map1 = mapOf(pair)

    map1.forEach{(k, v) -> println("Chave: $k, Valor: $v") }

    val map2 = mapOf("Maria" to 3500.0,
                     "Aron" to 10500.0)

    map2.forEach{(k,v) -> println("Chave: $k, Valor: $v") }
}