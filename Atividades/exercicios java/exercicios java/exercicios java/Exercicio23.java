public class Exercicio23 {
    public static class Editora {
        String nome;
        String endereco;
        String cnpj;

        public Editora(String nome, String endereco, String cnpj) {
            this.nome = nome;
            this.endereco = endereco;
            this.cnpj = cnpj;
        }

        public void exibirInformacoes() {
            System.out.println("Editora: " + nome + ", Endereço: " + endereco + ", CNPJ: " + cnpj);
        }
    }

    public static void main(String[] args) {
        Editora editora = new Editora("Editora Moderna", "Rua das Letras, 123", "12.345.678/0001-90");
        editora.exibirInformacoes();
    }
}
