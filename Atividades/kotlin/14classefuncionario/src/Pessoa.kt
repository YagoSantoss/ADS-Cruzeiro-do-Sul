// classe pessoa

open class Pessoa (val nome: String, val idade: Int) {


    open fun exibirInformacoes() {
        println("Nome: $nome")
        println("Idade: $idade")
    }


}