import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaVotacao sistema = new SistemaVotacao();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar Partido");
            System.out.println("2. Criar Candidato");
            System.out.println("3. Votar");
            System.out.println("4. Exibir Resultados");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do partido: ");
                    String nomePartido = scanner.nextLine();
                    System.out.print("Digite o número do partido (2 dígitos): ");
                    int numeroPartido = scanner.nextInt();
                    Partido partido = new Partido(nomePartido, numeroPartido);
                    sistema.adicionarPartido(partido);
                    System.out.println("Partido " + nomePartido + " criado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do candidato: ");
                    String nomeCandidato = scanner.nextLine();
                    System.out.print("Digite o número do candidato: ");
                    int numeroCandidato = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("O candidato é para vereador (5 dígitos) ou prefeito (2 dígitos)? ");
                    String tipoCandidato = scanner.nextLine().equalsIgnoreCase("vereador") ? "vereador" : "prefeito";

                    Partido partidoDoCandidato = null;
                    if (tipoCandidato.equals("vereador")) {
                        int numeroPartidoVereador = numeroCandidato / 1000; // pega os dois primeiros dígitos
                        partidoDoCandidato = sistema.buscarPartidoPorNumero(numeroPartidoVereador);
                    }

                    if (partidoDoCandidato != null || tipoCandidato.equals("prefeito")) {
                        Candidato candidato = new Candidato(nomeCandidato, partidoDoCandidato, numeroCandidato, tipoCandidato);
                        sistema.adicionarCandidato(candidato);
                        System.out.println("Candidato " + nomeCandidato + " criado com sucesso!");
                    } else {
                        System.out.println("Partido não encontrado para vereador. Crie o partido primeiro.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o número do candidato para votar: ");
                    int numeroVotoCandidato = scanner.nextInt();
                    sistema.votar(numeroVotoCandidato);
                    break;
                case 4:
                    sistema.exibirResultados();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
