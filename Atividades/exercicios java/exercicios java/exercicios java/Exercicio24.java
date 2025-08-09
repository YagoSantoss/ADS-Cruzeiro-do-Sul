public class Exercicio24 {
    public static class Autor {
        String nome;

        public Autor(String nome) {
            this.nome = nome;
        }
    }

    public static class Editora {
        String nome;

        public Editora(String nome) {
            this.nome = nome;
        }
    }

    public static class Livro {
        String nome;
        int anoPublicacao;
        Autor autor;
        Editora editora;

        public Livro(String nome, int anoPublicacao, Autor autor, Editora editora) {
            this.nome = nome;
            this.anoPublicacao = anoPublicacao;
            this.autor = autor;
            this.editora = editora;
        }

        public void exibirInformacoes() {
            System.out.println("Livro: " + nome + ", Ano de publicação: " + anoPublicacao + 
                ", Autor: " + autor.nome + ", Editora: " + editora.nome);
        }
    }

    public static void main(String[] args) {
        Autor autor = new Autor("J.K. Rowling");
        Editora editora = new Editora("Bloomsbury");
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", 1997, autor, editora);
        
        livro.exibirInformacoes();
    }
}
