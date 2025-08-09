fun obterValorOuPadrao(texto: String?): String {
    return texto ?: "Valor padrão"
}

fun main() {
    val resultado1 = obterValorOuPadrao(null)
    println("Resultado com entrada nula: $resultado1")

    val resultado2 = obterValorOuPadrao("Texto fornecido")
    println("Resultado com texto fornecido: $resultado2")
}
