fun main(){
    println("Escolha o que você deseja converter:")
    println("1. Metros para Km")
    println("2. Km para Metros")
    print("Digite a opção: ")
    val opcao = readLine()!!.toInt()

    if (opcao == 1) {
        print("Digite o valor em metros: ")
        var metros = readLine()?.toDoubleOrNull()

        if(metros != null){
            var quilometros = metros / 1000
            println("$metros metros equivalem a $quilometros quilometros.")
        }
    } else if (opcao == 2) {
        print("Digite o valor em quilometros: ")
        var quilometros = readLine()?.toDoubleOrNull()

        if(quilometros != null){
            var metros = quilometros * 1000
            println("$quilometros quilometros equivalem a $metros metros.")
        }
    } else{
        println("Opcao invalida...")
    }
}