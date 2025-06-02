package exceptions.Exercicio4;

import exceptions.Exercicio4.controller.ListaTarefasController;
import exceptions.Exercicio4.model.ListaTarefasModel;
import exceptions.Exercicio4.view.ListaTarefasView;

public class Main {
    public static void main(String[] args) {
        ListaTarefasModel model = new ListaTarefasModel();
        ListaTarefasView view = new ListaTarefasView();
        ListaTarefasController controller = new ListaTarefasController(model, view);

        controller.iniciar();
    }
}