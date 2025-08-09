// classe autor

class Autor (val nome: String, val cpf: String) {
    fun exibirInformacoes() {
        println("Nome: $nome")
        println("Idade: $cpf")
    }
}