package exceptions.Exercicio1.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperaturaView {
    private Scanner scanner;

    public TemperaturaView() {
        this.scanner = new Scanner(System.in);
    }

    public double lerTemperaturaCelsius() {
        while (true) {
            try {
                System.out.print("Digite a temperatura em Celsius: ");
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
    }

    public void mostrarTemperaturaFahrenheit(double fahrenheit) {
        System.out.printf("A temperatura em Fahrenheit é: %.2f°F\n", fahrenheit);
    }

    public void mostrarErro(String mensagem) {
        System.out.println("Erro: " + mensagem);
    }
}