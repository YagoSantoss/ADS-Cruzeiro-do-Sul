

fun main(){
    val conta1 = ContaCorrente(1000.0)
    val conta2 = ContaCorrente(500.0)

    println("Saldo inicial conta 1: R$${conta1.saldo}")
    println("Saldo inicial conta 2: R$${conta2.saldo}")

    conta1.deposito(500.0)

    conta2.saque(100.0)

    conta1.transferencia(200.0, conta2)

    println("Saldo final conta 1: R$${conta1.saldo}")
    println("Saldo final conta 2: R$${conta2.saldo}")
}