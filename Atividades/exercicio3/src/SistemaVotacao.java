import java.util.ArrayList;
import java.util.List;

public class SistemaVotacao {
    private List<Candidato> vereadores;
    private List<Candidato> prefeitos;
    private List<Partido> partidos;

    public SistemaVotacao() {
        this.vereadores = new ArrayList<>();
        this.prefeitos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    public void adicionarCandidato(Candidato candidato) {
        if (candidato.getTipo().equals("vereador")) {
            this.vereadores.add(candidato);
        } else if (candidato.getTipo().equals("prefeito")) {
            this.prefeitos.add(candidato);
        }
    }

    public void adicionarPartido(Partido partido) {
        this.partidos.add(partido);
    }

    public Partido buscarPartidoPorNumero(int numeroPartido) {
        for (Partido partido : partidos) {
            if (partido.getNumero() == numeroPartido) {
                return partido;
            }
        }
        return null;
    }

    public void votar(int numeroCandidato) {
        if (numeroCandidato > 99) { // voto para vereador (5 dígitos)
            for (Candidato vereador : vereadores) {
                if (vereador.getNumero() == numeroCandidato) {
                    vereador.adicionarVoto();
                    System.out.println("Voto registrado para vereador " + vereador.getNome());
                    return;
                }
            }
        } else { // voto para prefeito (2 dígitos)
            for (Candidato prefeito : prefeitos) {
                if (prefeito.getNumero() == numeroCandidato) {
                    prefeito.adicionarVoto();
                    System.out.println("Voto registrado para prefeito " + prefeito.getNome());
                    return;
                }
            }
        }
        System.out.println("Candidato não encontrado.");
    }

    public void exibirResultados() {
        if (vereadores.isEmpty() && prefeitos.isEmpty()) {
            System.out.println("Nenhum candidato registrado.");
            return;
        }

        System.out.println("\nResultados para vereadores:");
        Candidato vereadorVencedor = vereadores.get(0);
        for (Candidato vereador : vereadores) {
            if (vereador.getVotos() > vereadorVencedor.getVotos()) {
                vereadorVencedor = vereador;
            }
        }
        System.out.println("Vereador vencedor: " + vereadorVencedor.getNome() + " com " + vereadorVencedor.getVotos() + " votos.");

        System.out.println("\nResultados para prefeitos:");
        Candidato prefeitoVencedor = prefeitos.get(0);
        for (Candidato prefeito : prefeitos) {
            if (prefeito.getVotos() > prefeitoVencedor.getVotos()) {
                prefeitoVencedor = prefeito;
            }
        }
        System.out.println("Prefeito vencedor: " + prefeitoVencedor.getNome() + " com " + prefeitoVencedor.getVotos() + " votos.");

        System.out.println("\nVotos dos partidos:");
        for (Partido partido : partidos) {
            System.out.println("Partido " + partido.getNome() + " recebeu " + partido.getVotos() + " votos.");
        }
    }
}
