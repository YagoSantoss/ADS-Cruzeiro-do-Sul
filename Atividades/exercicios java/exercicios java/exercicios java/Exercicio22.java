public class Exercicio22 {
    public static class Autor {
        String nome;
        String cpf;

        public Autor(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        public void exibirInformacoes() {
            System.out.println("Autor: " + nome + ", CPF: " + cpf);
        }
    }

    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "123.456.789-00");
        autor.exibirInformacoes();
    }
}
