//classe aluno

class Aluno( nome: String, idade: Int,val matricula: String, val curso: String): Pessoa(nome, idade) {

    override fun exibirInformacoes() {
        super.exibirInformacoes()
        println("Matricula: $matricula")
        println("Curso: $curso")
    }
}