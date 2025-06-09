// Arquivo: src/com/vehicleapp/view/Main.java
package Trabalho09_06;

import Trabalho09_06.controller.VeiculoController;
import Trabalho09_06.model.Carro;
import Trabalho09_06.model.Moto;
import Trabalho09_06.model.Caminhao;
import Trabalho09_06.model.Veiculo;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Classe principal que contém o menu interativo para o usuário.
 * Responsável pela interação (View).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VeiculoController controller = new VeiculoController();
        int opcao = 0;

        while (opcao != 3) {
            exibirMenu();
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do scanner

                switch (opcao) {
                    case 1:
                        cadastrarNovoVeiculo(scanner, controller);
                        break;
                    case 2:
                        controller.listarVeiculos();
                        break;
                    case 3:
                        System.out.println("Saindo do sistema. Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um número válido para a opção.");
                scanner.nextLine(); // Limpa o buffer para evitar loop infinito
                opcao = 0; // Reseta a opção para continuar no loop
            }
             System.out.println(); // Linha em branco para espaçamento
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("--- Sistema de Cadastro de Veículos ---");
        System.out.println("1 - Cadastrar novo veículo");
        System.out.println("2 - Listar veículos");
        System.out.println("3 - Sair");
        System.out.print(">> ");
    }

    private static void cadastrarNovoVeiculo(Scanner scanner, VeiculoController controller) {
        try {
            System.out.print("Tipo (1-Carro, 2-Moto, 3-Caminhão): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Placa: ");
            String placa = scanner.nextLine();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            Veiculo novoVeiculo = null;

            switch (tipo) {
                case 1: // Carro
                    System.out.print("Quantidade de Portas: ");
                    int qtdPortas = scanner.nextInt();
                    scanner.nextLine();
                    novoVeiculo = new Carro(placa, modelo, ano, qtdPortas);
                    break;
                case 2: // Moto
                    System.out.print("Cilindrada: ");
                    int cilindrada = scanner.nextInt();
                    scanner.nextLine();
                    novoVeiculo = new Moto(placa, modelo, ano, cilindrada);
                    break;
                case 3: // Caminhão
                    System.out.print("Capacidade de Carga (em toneladas): ");
                    double capacidade = scanner.nextDouble();
                    scanner.nextLine();
                    novoVeiculo = new Caminhao(placa, modelo, ano, capacidade);
                    break;
                default:
                    System.out.println("Tipo de veículo inválido.");
                    return; // Retorna para o menu principal
            }
            
            controller.adicionarVeiculo(novoVeiculo);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Verifique os dados e tente novamente.");
            scanner.nextLine(); // Limpa o buffer para evitar problemas
        }
    }
}
