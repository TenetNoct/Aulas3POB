package exceptions.Exercicio5.controller;

import exceptions.Exercicio5.exception.LoginInvalidoException;
import exceptions.Exercicio5.model.UsuarioModel;
import exceptions.Exercicio5.view.LoginView;

public class LoginController {
    private UsuarioModel model;
    private LoginView view;

    public LoginController(UsuarioModel model, LoginView view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        String nomeUsuario = view.lerNomeUsuario();
        String senha = view.lerSenha();

        try {
            model.login(nomeUsuario, senha);
            view.mostrarMensagemSucesso(model.getNomeUsuario());
        } catch (LoginInvalidoException e) {
            view.mostrarErro(e.getMessage());
        }
    }
}