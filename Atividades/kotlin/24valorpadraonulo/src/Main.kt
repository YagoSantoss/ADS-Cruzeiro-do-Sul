fun main() {
    println("Digite uma string (ou deixe em branco para usar o valor padrão): ")
    val input: String? = readLine()

    val resultado = input ?: "Valor padrão"

    println("O valor resultante é: $resultado")
}
