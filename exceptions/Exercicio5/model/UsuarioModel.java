package exceptions.Exercicio5.model;

import exceptions.Exercicio5.exception.LoginInvalidoException;

public class UsuarioModel {
    private String nomeUsuario;
    private String senha;

    // Simulação de um usuário válido para o exemplo
    private static final String USUARIO_VALIDO = "admin";
    private static final String SENHA_VALIDA = "admin123";

    public UsuarioModel() {}

    public void login(String nomeUsuario, String senha) throws LoginInvalidoException {
        if (nomeUsuario == null || nomeUsuario.trim().isEmpty()) {
            throw new LoginInvalidoException("Nome de usuário não pode ser vazio.");
        }
        if (senha == null || senha.trim().isEmpty()) {
            throw new LoginInvalidoException("Senha não pode ser vazia.");
        }

        // Lógica de autenticação (simples para este exemplo)
        if (nomeUsuario.equals(USUARIO_VALIDO) && senha.equals(SENHA_VALIDA)) {
            this.nomeUsuario = nomeUsuario;
            this.senha = senha; // Em um sistema real, não armazenaríamos a senha em plain text
        } else {
            throw new LoginInvalidoException("Nome de usuário ou senha inválidos.");
        }
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }
}