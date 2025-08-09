

fun main(){
    val pessoa = Pessoa("Kaique", 22)

    val aluno = Aluno("Kaique", 22, "34114459", "Analise e Desenvolvimento de sistemas")

    val funcionario = Funcionario("Kaique", 22, 3000.00, "Desenvolvedor")

    println("Informações da pessoa:")
    pessoa.exibirInformacoes()

    println("")
    println("Informações do aluno:")
    aluno.exibirInformacoes()

    println("")
    println("Informações do funionario:")
    funcionario.exibirInformacoes()
}