package aula8.Exercicio3.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DispositivoView {
    private Scanner scanner;

    public DispositivoView() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenuPrincipal() {
        System.out.println("\n--- Controle de Dispositivos ---");
        System.out.println("1 - Controlar Smartphone");
        System.out.println("2 - Controlar Televisão");
        System.out.println("0 - Sair");
        System.out.print("Escolha um dispositivo: ");
        return lerOpcao();
    }

    public int mostrarMenuAcoes(String nomeDispositivo, boolean estaLigado) {
        System.out.printf("\n--- %s ---\n", nomeDispositivo);
        System.out.println("Status: " + (estaLigado ? "Ligado" : "Desligado"));
        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
        System.out.println("0 - Voltar ao menu principal");
        System.out.print("Escolha uma ação: ");
        return lerOpcao();
    }

    private int lerOpcao() {
        while (true) {
            try {
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer
                return opcao;
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Digite um número.");
                scanner.nextLine(); // Limpar buffer
                System.out.print("Escolha uma opção: ");
            }
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void mostrarErro(String mensagem) {
        System.out.println("Erro: " + mensagem);
    }
}