package exceptions.Exercicio3.model;

import exceptions.Exercicio3.exception.PrecoInvalidoException;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) throws PrecoInvalidoException {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws PrecoInvalidoException {
        if (preco <= 0) {
            throw new PrecoInvalidoException("O preço do produto deve ser maior que zero.");
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + String.format("%.2f", preco);
    }
}