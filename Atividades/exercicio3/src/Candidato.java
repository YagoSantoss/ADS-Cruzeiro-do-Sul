// Classe Candidato alterada para incluir tipo de candidato
public class Candidato implements Votavel {
    private String nome;
    private Partido partido;
    private int numero;
    private int votos;
    private String tipo; // "vereador" ou "prefeito"

    public Candidato(String nome, Partido partido, int numero, String tipo) {
        this.nome = nome;
        this.partido = partido;
        this.numero = numero;
        this.votos = 0;
        this.tipo = tipo;
    }

    @Override
    public void adicionarVoto() {
        this.votos++;
        if (this.tipo.equals("vereador")) {
            this.partido.adicionarVoto();
        }
    }

    @Override
    public int getVotos() {
        return this.votos;
    }

    public String getNome() {
        return nome;
    }

    public Partido getPartido() {
        return partido;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }
}
