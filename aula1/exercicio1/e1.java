package aula1.exercicio1;

import java.util.Scanner;

public class e1 {
    
    public static void main(String[] args) {
    
        Scanner scanf = new Scanner(System.in);
        
        System.out.println("Porfavor Digite um Número");
        int num = scanf.nextInt();

        System.out.println("Porfavor Digite Outro Número");
        int num2 = scanf.nextInt();

        System.out.println("A soma dos números é: " + (num + num2));

        scanf.close();

    }
}
