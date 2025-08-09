// classe Editora

class Editora (val nome: String, val endereco: String,val cnpj: String){
    fun exibirInformacoes(){
        println("Nome $nome")
        println("Endereço: $endereco")
        println("CNPJ: $cnpj")
    }
}