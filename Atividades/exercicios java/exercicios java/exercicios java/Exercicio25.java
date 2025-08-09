public class Exercicio25 {
    public static void main(String[] args) {
        Autor autor1 = new Autor("George Orwell", "111.222.333-44");
        Autor autor2 = new Autor("Jane Austen", "555.666.777-88");
        Autor autor3 = new Autor("Mark Twain", "999.000.111-22");

        Editora editora1 = new Editora("Penguin Random House", "Rua da Editora, 45", "12.345.678/0001-90");
        Editora editora2 = new Editora("HarperCollins", "Avenida das Letras, 32", "23.456.789/0001-01");
        Editora editora3 = new Editora("Simon & Schuster", "Praça da Literatura, 10", "34.567.890/0001-12");

        Livro livro1 = new Livro("1984", 1949, autor1, editora1);
        Livro livro2 = new Livro("Orgulho e Preconceito", 1813, autor2, editora2);
        Livro livro3 = new Livro("As Aventuras de Tom Sawyer", 1876, autor3, editora3);

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        livro3.exibirInformacoes();
    }
}

class Autor {
    private String nome;
    private String cpf;

    public Autor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

class Editora {
    private String nome;
    private String endereco;
    private String cnpj;

    public Editora(String nome, String endereco, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCnpj() {
        return cnpj;
    }
}

class Livro {
    private String titulo;
    private int ano;
    private Autor autor;
    private Editora editora;

    public Livro(String titulo, int ano, Autor autor, Editora editora) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
        this.editora = editora;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Autor: " + autor.getNome() + " (CPF: " + autor.getCpf() + ")");
        System.out.println("Editora: " + editora.getNome() + " (CNPJ: " + editora.getCnpj() + ")");
        System.out.println("Endereço da Editora: " + editora.getEndereco());
        System.out.println();
    }
}
