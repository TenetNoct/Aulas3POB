package lista6.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, double preco, int quantidade) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio.");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço do produto deve ser positivo.");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        }
        
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public void adicionarEstoque(int quantidade) throws IllegalArgumentException {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade a adicionar deve ser positiva.");
        }
        this.quantidade += quantidade;
    }
    
    public void vender(int quantidade) throws IllegalArgumentException, Exception {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade a vender deve ser positiva.");
        }
        if (quantidade > this.quantidade) {
            throw new Exception("Estoque insuficiente para venda.");
        }
        this.quantidade -= quantidade;
    }
    
    public void atualizarPreco(double novoPreco) throws IllegalArgumentException {
        if (novoPreco <= 0) {
            throw new IllegalArgumentException("Novo preço deve ser positivo.");
        }
        this.preco = novoPreco;
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
}