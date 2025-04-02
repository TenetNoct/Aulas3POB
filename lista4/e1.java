package lista4;
import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanf.nextInt();
        }
        
        int maior = numeros[0];
        int menor = numeros[0];
        
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        
        scanf.close();
    }
}