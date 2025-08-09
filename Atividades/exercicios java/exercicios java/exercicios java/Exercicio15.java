import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o limite inicial: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Digite o limite final: ");
        int fim = scanner.nextInt();
        
        System.out.println("Números pares entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
