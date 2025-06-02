package exceptions.Exercicio3.controller;

import exceptions.Exercicio3.exception.PrecoInvalidoException;
import exceptions.Exercicio3.model.Produto;
import exceptions.Exercicio3.view.ProdutoView;

public class ProdutoController {
    private ProdutoView view;

    public ProdutoController(ProdutoView view) {
        this.view = view;
    }

    public void iniciar() {
        String nome = view.lerNomeProduto();
        double preco = view.lerPrecoProduto();

        try {
            Produto produto = new Produto(nome, preco);
            view.mostrarProduto(produto.toString());
        } catch (PrecoInvalidoException e) {
            view.mostrarErro(e.getMessage());
        }
    }
}