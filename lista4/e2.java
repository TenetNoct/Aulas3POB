package lista4;
import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        float[] notas = new float[4];
        
        System.out.println("Digite 4 notas:");
        for (int i = 0; i < 4; i++) {
            notas[i] = scanf.nextFloat();
        }
        
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        float media = soma / 4;
        
        System.out.println("Média: " + media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
        scanf.close();
    }
}