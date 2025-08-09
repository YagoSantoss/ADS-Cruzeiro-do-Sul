fun main(){
    var texto: String
    var totalDeLetras: Int = 0
    var totalConsoantes: Int = 0
    var totalVogais: Int = 0
    print("Digite um texto: ")
    texto = readLine()!!

    for (i in texto){
        if (i.isLetter()){
            totalDeLetras += 1
            if (i.lowercase() == "a" || i.lowercase() == "e" || i.lowercase() == "i" || i.lowercase() == "o" || i.lowercase() == "u") {
                totalVogais += 1
            } else{
                totalConsoantes += 1
            }
        }
    }

    println("Temos $totalDeLetras letras entre elas ${totalConsoantes} são consoantes e $totalVogais são vogais.")

}