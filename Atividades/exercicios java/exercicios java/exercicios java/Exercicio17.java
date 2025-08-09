public class Exercicio17 {
    public static class Pessoa {
        String nome;
        int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }

    public static class Aluno extends Pessoa {
        String matricula;
        String curso;

        public Aluno(String nome, int idade, String matricula, String curso) {
            super(nome, idade);
            this.matricula = matricula;
            this.curso = curso;
        }

        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Matrícula: " + matricula);
            System.out.println("Curso: " + curso);
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", 20, "12345", "Engenharia");
        aluno.exibirInformacoes();
    }
}
