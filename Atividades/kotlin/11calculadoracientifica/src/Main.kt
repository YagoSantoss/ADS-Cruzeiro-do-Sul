import java.lang.classfile.instruction.SwitchCase
import kotlin.math.pow
import kotlin.math.sqrt


fun main(){
    println("Caculadora!!!")
    println("Escolha a operacao.")
    println("1. Soma.")
    println("2. Subtração")
    println("3. Multiplicação.")
    println("4. Divisão.")
    println("5. Exponenciação.")
    println("6. Raiz quadrada.")
    print("Digite a opção: ")
    var opcao = readLine()!!.toInt()



    if (opcao in 1..5){
        println("Digite o primeiro numero: ")
        var numero1 = readLine()!!.toDouble()
        println("Digite o segundo numero: ")
        var numero2 = readLine()!!.toDouble()
        if (opcao == 1){
            var soma = numero1 + numero2
            println("A soma de $numero1 + $numero2 = ${soma}")
        } else if (opcao == 2){
            var subtracao = numero1 - numero2
            println("A subtracao de $numero1 - $numero2 = ${subtracao}")
        } else if (opcao == 3){
            var multiplicacao = numero1 * numero2
            println("A multiplicao de $numero1 * $numero2 = ${multiplicacao}")
        } else if (opcao == 4){
            if (numero2 == 0.toDouble()) {
                println("Erro o divisor não pode ser zero.")
            }else {
                var divisor = numero1 / numero2
                println("A divisao de $numero1 / $numero2 = ${divisor}")
            }
        } else if (opcao == 5){
            var expoente = numero1.pow(numero2)
            println("$numero1 elevador por $numero2 = ${expoente}")
        }
    }else if (opcao == 6) {
        println("Digite o numero que deseja encontrar a raiz: ")
        var numero1 = readLine()!!.toDouble()
        var raizQuadrada = sqrt(numero1)
        println("A raiz de $numero1 é $raizQuadrada")
    }
}