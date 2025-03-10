package aula2.e2;

// Exercício 2: Classificação de Idade

import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Porfavor digite a idade: ");
        int idade = scanf.nextInt();

        if (idade < 18){
            System.out.println("Menor de idade");
        }
        else if (idade <= 60){
            System.out.println("Adulto");
        }
        else{
            System.out.println("Idoso");
        }
        scanf.close();
    }
}
