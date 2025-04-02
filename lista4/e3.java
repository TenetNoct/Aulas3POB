package lista4;
import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int[] numeros = new int[6];
        
        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < 6; i++) {
            numeros[i] = scanf.nextInt();
        }
        
        System.out.println("Números na ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        
        scanf.close();
    }
}