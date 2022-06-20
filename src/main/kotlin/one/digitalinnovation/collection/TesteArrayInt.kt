package one.digitalinnovation.collection

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 4
    values[2] = 3
    values[3] = 4999999
    values[4] = 52323

    for(value in values) println(value)

    values.forEach { println(it) }

    for(index in values.indices)println(values[index])

    values.sort() //ordenação menor para o maior
    for(value in values) println(value)
}