package one.digitalinnovation.collection

fun main() {
    val funcionario = Funcionario("João", 3400.0, "CLT")
    val funcionario2 = Funcionario("Pedro", 2000.0, "PJ")
    val funcionario3 = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(funcionario, funcionario2, funcionario3)

    funcionarios.forEach{println(it)}

    println("-------------------")
    println(funcionarios.find { it.nome == "Pedro" }) //Encontrar por nome

    println("-------------------")
    funcionarios.sortedBy { it.salario }.forEach{ println(it) } //Ordenação crescente por salario

    println("-------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach{ println(it) } //agrupar por tipoContratação

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
            
        """.trimIndent()
}