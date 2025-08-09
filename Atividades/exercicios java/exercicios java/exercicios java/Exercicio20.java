public class Exercicio20 {
    public interface Animal {
        void fazerSom();
        void mover();
    }

    public static class Cachorro implements Animal {
        @Override
        public void fazerSom() {
            System.out.println("O cachorro late.");
        }

        @Override
        public void mover() {
            System.out.println("O cachorro corre.");
        }
    }

    public static class Gato implements Animal {
        @Override
        public void fazerSom() {
            System.out.println("O gato mia.");
        }

        @Override
        public void mover() {
            System.out.println("O gato pula.");
        }
    }

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.fazerSom();
        cachorro.mover();

        Animal gato = new Gato();
        gato.fazerSom();
        gato.mover();
    }
}
