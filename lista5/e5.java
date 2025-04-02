package lista5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class e5 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Digite números inteiros (digite 'sair' para terminar):");
        while(true) {
            String input = scanf.nextLine();
            if(input.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                numeros.add(num);
            } catch(NumberFormatException e) {
                System.out.println("Por favor, digite um número válido ou 'sair' para terminar.");
            }
        }
        
        Collections.sort(numeros);
        
        System.out.println("Números ordenados:");
        for(int num : numeros) {
            System.out.println(num);
        }
        
        scanf.close();
    }
}