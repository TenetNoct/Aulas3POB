// Crie um programa que converta uma temperatura em Celsius para Fahrenheit. A fórmula de conversão é: F = C * 9/5 + 32

package aula1.exercicio3;


import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.println("Porfavor Digite a temperatira em Celsius:");
        double celsius = scanf.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        
        scanf.close();
    }
}
