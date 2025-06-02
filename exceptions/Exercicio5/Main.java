package exceptions.Exercicio5;

import exceptions.Exercicio5.controller.LoginController;
import exceptions.Exercicio5.model.UsuarioModel;
import exceptions.Exercicio5.view.LoginView;

public class Main {
    public static void main(String[] args) {
        UsuarioModel model = new UsuarioModel();
        LoginView view = new LoginView();
        LoginController controller = new LoginController(model, view);

        controller.iniciar();
    }
}