package dominio;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, int ano, int numeroDePortas) {
        super(marca, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Número de Portas: " + numeroDePortas);
    }
}