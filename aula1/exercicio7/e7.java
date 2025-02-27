package aula1.exercicio7;

import java.util.Scanner;

public class e7 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Porfavor insira a base do retângulo: ");
        double base = scanf.nextDouble();

        System.out.print("Porfavor insira a altura do retângulo: ");
        double altura = scanf.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + perimetro);

        scanf.close();

    }
}
