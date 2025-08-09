public class Exercicio21 {
    public static class ContaCorrente {
        private double saldo;

        public ContaCorrente(double saldoInicial) {
            this.saldo = saldoInicial;
        }

        public void deposito(double valor) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
        }

        public void saque(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }

        public void transferencia(ContaCorrente outraConta, double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                outraConta.deposito(valor);
                System.out.println("Transferência de " + valor + " realizada. Saldo atual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente para transferência.");
            }
        }
    }

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1000);
        ContaCorrente conta2 = new ContaCorrente(500);

        conta1.deposito(200);
        conta1.saque(150);
        conta1.transferencia(conta2, 300);
    }
}
