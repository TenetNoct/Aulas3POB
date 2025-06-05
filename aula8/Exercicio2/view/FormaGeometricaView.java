package aula8.Exercicio2.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FormaGeometricaView {
    private Scanner scanner;

    public FormaGeometricaView() {
        this.scanner = new Scanner(System.in);
    }

    public double lerValor(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                double valor = scanner.nextDouble();
                scanner.nextLine(); // Limpar buffer
                if (valor <= 0) {
                    System.out.println("O valor deve ser positivo.");
                    continue;
                }
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpar buffer
            }
        }
    }

    public void mostrarResultados(String forma, double area, double perimetro) {
        System.out.printf("\n--- Resultados para %s ---\n", forma);
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f\n", perimetro);
    }

    public void mostrarErro(String mensagem) {
        System.out.println("Erro: " + mensagem);
    }
}