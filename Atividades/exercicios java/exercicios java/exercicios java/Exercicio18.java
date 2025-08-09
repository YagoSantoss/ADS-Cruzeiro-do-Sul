public class Exercicio18 {
    public static class Pessoa {
        String nome;
        int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }

    public static class Funcionario extends Pessoa {
        double salario;
        String cargo;

        public Funcionario(String nome, int idade, double salario, String cargo) {
            super(nome, idade);
            this.salario = salario;
            this.cargo = cargo;
        }

        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Salário: " + salario);
            System.out.println("Cargo: " + cargo);
        }
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 30, 2500.00, "Desenvolvedor");
        funcionario.exibirInformacoes();
    }
}
