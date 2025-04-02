package lista5;
import java.util.Scanner;
import java.util.ArrayList;

public class e4 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Digite 10 números inteiros:");
        for(int i = 0; i < 10; i++) {
            numeros.add(scanf.nextInt());
        }
        
        System.out.println("Digite o número que deseja buscar:");
        int busca = scanf.nextInt();
        
        int contador = 0;
        for(int num : numeros) {
            if(num == busca) {
                contador++;
            }
        }
        
        System.out.println("O número " + busca + " aparece " + contador + " vezes na lista.");
        
        scanf.close();
    }
}