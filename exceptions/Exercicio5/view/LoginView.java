package exceptions.Exercicio5.view;

import java.util.Scanner;

public class LoginView {
    private Scanner scanner;

    public LoginView() {
        this.scanner = new Scanner(System.in);
    }

    public String lerNomeUsuario() {
        System.out.print("Digite o nome de usuário: ");
        return scanner.nextLine();
    }

    public String lerSenha() {
        System.out.print("Digite a senha: ");
        return scanner.nextLine();
    }

    public void mostrarMensagemSucesso(String nomeUsuario) {
        System.out.println("Login bem-sucedido! Bem-vindo, " + nomeUsuario + "!");
    }

    public void mostrarErro(String mensagem) {
        System.out.println("Erro de login: " + mensagem);
    }
}