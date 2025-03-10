// Crie um programa que calcule a área de um círculo, dado o raio.

package aula1.exercicio2;

import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        
        Scanner scanf = new Scanner(System.in);

        System.out.println("Porfavor Digite o raio do círculo");
        int raio = scanf.nextInt();

        final double pi = 3.14159;

        double area = pi * raio * raio;

        System.out.println("A área do círculo é: " + area);

        scanf.close();
    }
}
