// classe livro

class Livro(val nome: String, val anoPublicacao: Int, val autor: Autor, val editora: Editora){
    fun exibirInformacoes() {
        println("Nome do Livro: $nome")
        println("Ano de Publicação: $anoPublicacao")
        println("Autor:")
        autor.exibirInformacoes()
        println("Editora:")
        editora.exibirInformacoes()
    }

}