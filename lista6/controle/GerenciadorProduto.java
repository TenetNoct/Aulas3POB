package lista6.controle;

import lista6.dominio.Produto;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciadorProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = null;
        boolean sair = false;

        while (!sair) {
            try {
                if (produto == null) {
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = Double.parseDouble(scanner.nextLine());
                    System.out.print("Digite a quantidade em estoque: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());
                    produto = new Produto(nome, preco, quantidade);
                    System.out.println("Produto cadastrado com sucesso!\n");
                }
                System.out.println("Escolha uma operação:");
                System.out.println("1 - Adicionar estoque");
                System.out.println("2 - Vender produto");
                System.out.println("3 - Atualizar preço");
                System.out.println("4 - Exibir dados");
                System.out.println("5 - Sair");
                System.out.print("Opção: ");
                int opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.print("Quantidade a adicionar: ");
                        int qtdAdicionar = Integer.parseInt(scanner.nextLine());
                        produto.adicionarEstoque(qtdAdicionar);
                        System.out.println("Estoque atualizado com sucesso!\n");
                        break;
                    case 2:
                        System.out.print("Quantidade a vender: ");
                        int qtdVender = Integer.parseInt(scanner.nextLine());
                        produto.vender(qtdVender);
                        System.out.println("Venda realizada com sucesso!\n");
                        break;
                    case 3:
                        System.out.print("Novo preço: ");
                        double novoPreco = Double.parseDouble(scanner.nextLine());
                        produto.atualizarPreco(novoPreco);
                        System.out.println("Preço atualizado com sucesso!\n");
                        break;
                    case 4:
                        produto.exibirDados();
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