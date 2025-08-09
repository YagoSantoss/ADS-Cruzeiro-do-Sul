fun calcularProduto(valorInteiro: Int): Int{
    var valorProduto = 1
    for( i in valorInteiro downTo 1){
        valorProduto *= i
    }
    return valorProduto
}

fun main(){
    print("Digite um valor inteiro para calcular seu produto: ")
    var valorInteiro = readLine()!!.toInt()
    var valorProduto = calcularProduto(valorInteiro)
    print("O valor do produto de $valorInteiro é: $valorProduto")
}