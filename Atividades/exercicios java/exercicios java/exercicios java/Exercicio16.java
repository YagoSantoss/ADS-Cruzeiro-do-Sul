public class Exercicio16 {
    public static class Pessoa {
        String nome;
        int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        pessoa.exibirInformacoes();
    }
}
