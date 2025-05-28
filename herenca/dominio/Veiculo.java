package dominio;

public class Veiculo {
    protected String marca;
    protected int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}