fun main() {
    var somaDigitos = 0
    print("Digite um numero para somar seus digitos: ")
    var numero = readLine()!!.toInt()
    var numeroTexto = numero.toString()

    for (i in numeroTexto){
        somaDigitos = somaDigitos + i.toString().toInt()
    }

    print("O valor da soma dos digitos e: $somaDigitos")
}