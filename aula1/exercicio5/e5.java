package aula1.exercicio5;

import java.util.Scanner;

public class e5 {
    public static void main(String[] args) {
        
        Scanner scanf = new Scanner(System.in);
        
        System.err.println("Insira a sua idade:");
        int idade = scanf.nextInt();

        final int ano = 365;

        int dias = idade * ano;

        System.out.println("Você já viveu " + dias + " dias.");

        scanf.close();
    }
}
