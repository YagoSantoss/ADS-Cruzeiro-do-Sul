fun main(){
    print("Escreva um número para verificar se ele é palíndromo: ")
    var numero = readLine()!!.toInt()

    if(numero.toString()==numero.toString().reversed()){
        println("O número $numero é um Palindromo.")
    } else {
        println("O número $numero não é um Palindromo.")
    }
}