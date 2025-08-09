fun conversorParaReal(valor_dolar: Double): Double {
    var taxa_cambio: Double = 5.60
    return valor_dolar * taxa_cambio
}

fun main(){
    var valor_real: Double
    println("Digite o valor em dolares: ")
    val valor_dolar = readLine()?.toDoubleOrNull() ?: return

    valor_real = conversorParaReal(valor_dolar)
    println("O valor de ${"%.2f".format(valor_dolar)} de dolares em real é: ${"%.2f".format(valor_real)} reais.")
}