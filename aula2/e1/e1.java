package aula2.e1;

import java.util.Scanner;

// Exercício 1: Verificação de Número Par ou Ímpar

public class e1 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Porfavor digite um número: ");
        int num = scanf.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par");
        }
        else{
            System.out.println("O número " + num + " é ímpar");
        }

        scanf.close();
    }    
}
