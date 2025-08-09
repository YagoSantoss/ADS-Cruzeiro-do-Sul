import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            soma += scanner.nextDouble();
        }
        
        double media = soma / 10;
        System.out.println("A média é: " + media);
        scanner.close();
    }
}
