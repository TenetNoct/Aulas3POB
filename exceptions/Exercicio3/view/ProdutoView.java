package exceptions.Exercicio3.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProdutoView {
    private Scanner scanner;

    public ProdutoView() {
        this.scanner = new Scanner(System.in);
    }

    public String lerNomeProduto() {
        System.out.print("Digite o nome do produto: ");
        return scanner.nextLine();
    }

    public double lerPrecoProduto() {
        while (true) {
            try {
                System.out.print("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                scanner.nextLine(); // Limpa o buffer do scanner
                return preco;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número para o preço.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
    }

    public void mostrarProduto(String produtoInfo) {
        System.out.println(produtoInfo);
    }

    public void mostrarErro(String mensagem) {
        System.out.println("Erro: " + mensagem);
    }
}