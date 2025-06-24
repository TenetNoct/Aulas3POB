package produto.model;

public class Produto{
    private int id;
    private String nome;
    private double qtd;
    private double preco;
    
    public Produto(int id, String nome, double qtd, double preco){
        this.id = id;
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtd() {
        return qtd;
    }
    
    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}