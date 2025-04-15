package lista6.controle;

import lista6.dominio.Funcionario;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciadorFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = null;
        boolean sair = false;

        while (!sair) {
            try {
                if (funcionario == null) {
                    System.out.print("Digite o nome do funcionário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o salário inicial: ");
                    double salario = Double.parseDouble(scanner.nextLine());
                    System.out.print("Digite o cargo: ");
                    String cargo = scanner.nextLine();
                    funcionario = new Funcionario(nome, salario, cargo);
                    System.out.println("Funcionário cadastrado com sucesso!\n");
                }
                System.out.println("Escolha uma operação:");
                System.out.println("1 - Aumentar salário");
                System.out.println("2 - Mudar cargo");
                System.out.println("3 - Exibir dados");
                System.out.println("4 - Sair");
                System.out.print("Opção: ");
                int opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.print("Percentual de aumento: ");
                        double percentual = Double.parseDouble(scanner.nextLine());
                        funcionario.aumentarSalario(percentual);
                        System.out.println("Salário aumentado com sucesso!\n");
                        break;
                    case 2:
                        System.out.print("Novo cargo: ");
                        String novoCargo = scanner.nextLine();
                        funcionario.mudarCargo(novoCargo);
                        System.out.println("Cargo alterado com sucesso!\n");
                        break;
                    case 3:
                        funcionario.exibirDados();
                        System.out.println();
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