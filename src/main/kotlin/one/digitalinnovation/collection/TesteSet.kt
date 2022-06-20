package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("João", 3400.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionario1 = setOf(joao, maria) //primeiro conjunto(set)
    val funcionario2 = setOf(pedro) //segundo conjunto(set)

    val uniao = funcionario1.union(funcionario2) //Unindo os dois conjuntos

    println(uniao)

    println("-----------------")
    val subtract = uniao.subtract(funcionario2) //subtraindo o conjunto uniao pelo conjunto funcionario2
    println(subtract)

    println("-----------------")
    val interseccao = uniao.intersect(funcionario1) //interseccao de uniao e funcionario1
    println(interseccao)
}