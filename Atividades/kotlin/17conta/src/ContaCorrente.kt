class ContaCorrente(var saldo: Double) {
    fun deposito(valorDeposito: Double) {
        saldo += valorDeposito
        println("Você depositou R$$valorDeposito.")
    }

    fun saque(valorSaque: Double){
        saldo -= valorSaque
        println("Você sacou R$$valorSaque.")
    }

    fun transferencia(valorTransferencia: Double, contaDestino: ContaCorrente){
        saldo -= valorTransferencia
        contaDestino.deposito(valorTransferencia)
        println("Você transferiu R$$valorTransferencia para $contaDestino.")
    }
}