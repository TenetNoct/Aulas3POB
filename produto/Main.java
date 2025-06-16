package produto.view;

import produto.controller.ProdutoController;
import produto.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoView {
    public static void main(String[] args) {
        ProdutoController controller = new ProdutoController();
        List<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu Produto ---");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Listar produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço do produto: ");
                    double preco = scanner.nextDouble();
                    controller.adicionarProduto(produtos, nome, preco);
                    break;
                case 2:
                    System.out.print("Nome do produto para remover: ");
                    String nomeRemover = scanner.nextLine();
                    controller.removerProduto(produtos, nomeRemover);
                    break;
                case 3:
                    controller.listarProdutos(produtos);
                    break;
                case 4:
                    System.out.print("Nome do produto para atualizar: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Novo nome do produto: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo preço do produto: ");
                    double novoPreco = scanner.nextDouble();
                    scanner.nextLine(); // Limpa o buffer
                    controller.atualizarProduto(produtos, nomeAtualizar, novoNome, novoPreco);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}