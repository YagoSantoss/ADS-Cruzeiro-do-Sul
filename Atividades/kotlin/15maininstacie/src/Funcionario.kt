// classe funcionario

class Funcionario (nome: String, idade: Int, val salario: Double, val cargo: String): Pessoa(nome, idade) {


    override fun exibirInformacoes() {
        super.exibirInformacoes()
        println("Salario: $salario")
        println("Cargo: $cargo")
    }
}