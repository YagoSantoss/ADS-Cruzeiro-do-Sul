fun zeroNeutroPosi(numero: Int): String {
    var texto: String = ""
    if (numero == 0) {
        texto = "Este numero é zero."
    } else if (numero > 0) {
        texto = "Este número é positivo."
    } else if (numero < 0) {
        texto = "Este número é negativo."
    }
    return texto
}
fun main(){
    print("Digite um número para saber se é possitivo, negativo ou zero: ")
    var numero = readLine()!!.toInt()

    println(zeroNeutroPosi(numero))
}