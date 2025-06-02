package exceptions.Exercicio4.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaTarefasView {
    private Scanner scanner;

    public ListaTarefasView() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n--- Lista de Tarefas ---");
        System.out.println("1 - Adicionar Tarefa");
        System.out.println("2 - Remover Tarefa por Índice");
        System.out.println("3 - Exibir Todas as Tarefas");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
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

    public String lerTarefa() {
        System.out.print("Digite a descrição da tarefa: ");
        return scanner.nextLine();
    }

    public int lerIndiceTarefa() {
        System.out.print("Digite o índice da tarefa a ser removida: ");
        while (true) {
            try {
                int indice = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer
                return indice;
            } catch (InputMismatchException e) {
                System.out.println("Índice inválido. Digite um número.");
                scanner.nextLine(); // Limpar buffer
                System.out.print("Digite o índice da tarefa a ser removida: ");
            }
        }
    }

    public void exibirTarefas(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
            return;
        }
        System.out.println("\n--- Suas Tarefas ---");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + " - " + tarefas.get(i));
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void mostrarErro(String mensagem) {
        System.out.println("Erro: " + mensagem);
    }
}