package lista6.controle;

import lista6.dominio.ContaBancaria;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciadorConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = null;
        boolean sair = false;

        while (!sair) {
            try {
                if (conta == null) {
                    System.out.print("Digite o nome do titular: ");
                    String titular = scanner.nextLine();
                    System.out.print("Digite o saldo inicial: ");
                    double saldo = Double.parseDouble(scanner.nextLine());
                    conta = new ContaBancaria(titular, saldo);
                    System.out.println("Conta criada com sucesso!\n");
                }
                System.out.println("Escolha uma operação:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Exibir saldo");
                System.out.println("4 - Sair");
                System.out.print("Opção: ");
                int opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.print("Valor para depósito: ");
                        double valorDep = Double.parseDouble(scanner.nextLine());
                        conta.depositar(valorDep);
                        System.out.println("Depósito realizado com sucesso!\n");
                        break;
                    case 2:
                        System.out.print("Valor para saque: ");
                        double valorSaq = Double.parseDouble(scanner.nextLine());
                        conta.sacar(valorSaq);
                        System.out.println("Saque realizado com sucesso!\n");
                        break;
                    case 3:
                        conta.exibirSaldo();
                        break;
                    case 4:
                        sair = true;
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!\n");
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Entrada inválida. Tente novamente.\n");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + "\n");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage() + "\n");
            }
        }
        scanner.close();
    }
}