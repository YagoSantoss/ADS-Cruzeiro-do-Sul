


fun main(){
    val lista: List<String?> = listOf("Melância", null, "Maçã", "Laranja", null, "Abacate")

    lista.forEach {elemento -> elemento?.let { println(elemento) } }
}