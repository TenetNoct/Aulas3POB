package lista4;
import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int[] numeros = new int[8];
        
        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            numeros[i] = scanf.nextInt();
        }
        
        int pares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + pares);
        
        scanf.close();
    }
}