package lista6.controle;

import lista6.dominio.Livro;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciadorLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro = null;
        boolean sair = false;

        while (!sair) {
            try {
                if (livro == null) {
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o nome do autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicação: ");
                    int anoPublicacao = Integer.parseInt(scanner.nextLine());
                    livro = new Livro(titulo, autor, anoPublicacao);
                    System.out.println("Livro cadastrado com sucesso!\n");
                }
                System.out.println("Escolha uma operação:");
                System.out.println("1 - Emprestar livro");
                System.out.println("2 - Devolver livro");
                System.out.println("3 - Atualizar dados");
                System.out.println("4 - Exibir dados");
                System.out.println("5 - Sair");
                System.out.print("Opção: ");
                int opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1:
                        livro.emprestar();
                        System.out.println("Livro emprestado com sucesso!\n");
                        break;
                    case 2:
                        livro.devolver();
                        System.out.println("Livro devolvido com sucesso!\n");
                        break;
                    case 3:
                        System.out.println("Deixe em branco para manter o valor atual");
                        System.out.print("Novo título: ");
                        String novoTitulo = scanner.nextLine();
                        System.out.print("Novo autor: ");
                        String novoAutor = scanner.nextLine();
                        System.out.print("Novo ano de publicação (0 para manter): ");
                        String anoStr = scanner.nextLine();
                        int novoAno = anoStr.isEmpty() ? 0 : Integer.parseInt(anoStr);
                        livro.atualizarDados(
                            novoTitulo.isEmpty() ? null : novoTitulo,
                            novoAutor.isEmpty() ? null : novoAutor,
                            novoAno
                        );
                        System.out.println("Dados atualizados com sucesso!\n");
                        break;
                    case 4:
                        livro.exibirDados();
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
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + "\n");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage() + "\n");
            }
        }
        scanner.close();
    }
}