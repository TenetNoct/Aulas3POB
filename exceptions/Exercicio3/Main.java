package exceptions.Exercicio3;

import exceptions.Exercicio3.controller.ProdutoController;
import exceptions.Exercicio3.view.ProdutoView;

public class Main {
    public static void main(String[] args) {
        ProdutoView view = new ProdutoView();
        ProdutoController controller = new ProdutoController(view);

        controller.iniciar();
    }
}