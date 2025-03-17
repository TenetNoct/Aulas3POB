// Crie um programa que leia 3 notas de um aluno e calcule a média final.

package aula1.exercicio4;


import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
        
        Scanner scanf = new Scanner(System.in);

        System.out.println("Porfavor Digite a Primeira Nota:");

        double nota1 = scanf.nextDouble();

        System.out.println("Porfavor Digite a Segunda Nota:");

        double nota2 = scanf.nextDouble();

        System.out.println("Porfavor Digite a Terceira Nota:");

        double nota3 = scanf.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A Média das Notas é:" + media);

        scanf.close();
    }
}
