package lista6.controle;

import lista6.dominio.Aluno;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciadorAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = null;
        boolean sair = false;

        while (!sair) {
            try {
                if (aluno == null) {
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Digite a quantidade de notas: ");
                    int quantidadeNotas = Integer.parseInt(scanner.nextLine());
                    aluno = new Aluno(nome, matricula, quantidadeNotas);
                    System.out.println("Aluno cadastrado com sucesso!\n");
                }
                System.out.println("Escolha uma operação:");
                System.out.println("1 - Atribuir nota");
                System.out.println("2 - Calcular média");
                System.out.println("3 - Verificar situação");
                System.out.println("4 - Exibir dados");
                System.out.println("5 - Sair");
                System.out.print("Opção: ");
                int opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.print("Índice da nota (começando de 0): ");
                        int indice = Integer.parseInt(scanner.nextLine());
                        System.out.print("Valor da nota (0-10): ");
                        double nota = Double.parseDouble(scanner.nextLine());
                        aluno.atribuirNota(indice, nota);
                        System.out.println("Nota atribuída com sucesso!\n");
                        break;
                    case 2:
                        double media = aluno.calcularMedia();
                        System.out.printf("Média: %.2f\n\n", media);
                        break;
                    case 3:
                        String situacao = aluno.verificarSituacao();
                        System.out.println("Situação: " + situacao + "\n");
                        break;
                    case 4:
                        aluno.exibirDados();
                        System.out.println();
                        break;
                    case 5:
                        sair = true;
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!\n");
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Entrada inválida. Tente novamente.\n");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: " + e.getMessage() + "\n");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + "\n");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage() + "\n");
            }
        }
        scanner.close();
    }
}