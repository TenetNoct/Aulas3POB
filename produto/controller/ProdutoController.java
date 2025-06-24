package produto.controller;
import produto.model.Produto;
import java.util.List;

public class ProdutoController {
    int id = 0;
    
    public ProdutoController() {
        // Construtor vazio
    }

    public void adicionarProduto(List<Produto> produtos, String nome, double preco, double qtd) {
        Produto novoProduto = new Produto(++id, nome, qtd, preco);
        produtos.add(novoProduto);
        System.out.println("Produto adicionado: " + nome + " com preço: " + preco);
    }

    public void removerProduto(List<Produto> produtos, String nome) {
        Produto produtoParaRemover = null;
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produtoParaRemover = produto;
                break;
            }
        }

        if (produtoParaRemover != null) {
            produtos.remove(produtoParaRemover);
        } else {
            System.out.println("Produto não encontrado: " + nome);
            return;
        }

        System.out.println("Produto removido: " + nome);
    }

    public void atualizarProduto(List<Produto> produtos, String nome, String novoNome, double novoPreco) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produto.setNome(novoNome);
                produto.setPreco(novoPreco);
                System.out.println("Produto atualizado: " + nome + " para novo nome: " + novoNome + " e novo preço: " + novoPreco);
                return;
            }
        }
        System.out.println("Produto não encontrado: " + nome);
    }

    public void listarProdutos(List<Produto> produtos) {
        System.out.println("Listando produtos...");
        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }

}