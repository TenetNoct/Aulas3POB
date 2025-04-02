package lista4;
import java.util.Scanner;

public class e5 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanf.nextInt();
        }
        
        System.out.println("Digite o número que deseja buscar:");
        int busca = scanf.nextInt();
        
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == busca) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }
        
        scanf.close();
    }
}