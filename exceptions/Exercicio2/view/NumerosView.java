package exceptions.Exercicio2.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosView {
    private Scanner scanner;

    public NumerosView() {
        this.scanner = new Scanner(System.in);
    }

    public int lerNumero(int ordem) {
        while (true) {
            try {
                System.out.printf("Digite o %dº número inteiro: ", ordem);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
    }

    public void mostrarNumeros(int[] numeros) {
        System.out.println("\nNúmeros digitados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public void mostrarErro(String mensagem) {
        System.out.println("Erro: " + mensagem);
    }
}