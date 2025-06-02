package exceptions.Exercicio2;

import exceptions.Exercicio2.controller.NumerosController;
import exceptions.Exercicio2.model.NumerosModel;
import exceptions.Exercicio2.view.NumerosView;

public class Main {
    public static void main(String[] args) {
        NumerosModel model = new NumerosModel();
        NumerosView view = new NumerosView();
        NumerosController controller = new NumerosController(model, view);

        controller.iniciar();
    }
}