import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }
        
        Arrays.sort(numeros);
        System.out.println("Números ordenados: " + Arrays.toString(numeros));
        scanner.close();
    }
}
