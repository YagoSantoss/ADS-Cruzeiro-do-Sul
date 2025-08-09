fun main(){
    var somaNumeros: Int = 0

    print("Digite a quantidade de número que você quer tirar a média: ")
    var qtdeParaMedia = readLine()!!.toInt()

    if (qtdeParaMedia <= 0){
        println("Digite uma quantidade maior que zero...")
        println("Programa finalizado...")
    } else {
        for (i in 1 .. qtdeParaMedia){
            println("Digite o $i.º número.")
            var numero = readLine()!!.toInt()
            somaNumeros += numero
        }
        var media = somaNumeros.toDouble() / qtdeParaMedia

        println("A média da soma desses números é de: $media")
    }
}