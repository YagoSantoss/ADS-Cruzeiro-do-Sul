

fun main(){
    val gato = Gato()
    val cachorro = Cachorro()

    println("O que o cachorro faz?")
    cachorro.mover()
    cachorro.fazerSom()

    println("")

    println("O que o gato faz?")
    gato.mover()
    gato.fazerSom()
}