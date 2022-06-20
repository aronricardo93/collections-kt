package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) println(salario)

    println("----------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salárial: ${salarios.average()}")

    val salarioAcimaDeDoisMil = salarios.filter { it > 2000.0 } //filtrar e atribuir(caso true) valores maiores que 2000.0 à lista
    println(salarioAcimaDeDoisMil)

    println("-------------------")
    println(salarios.count {it in 2000.0..5000.0}) //contar e printar os valores no range(entre 2000.0 e 5000.0)

    println("-------------------")
    println(salarios.find { it.equals(2250.0) }) //procurar valor igual a 2250.0(caso true, retornar o valor sñ Null)

    println("-------------------")
    println(salarios.any() { it.equals(1000.0) }) //procurar qualquer valor igual a 1000.0(caso encontre, retornar true)

}