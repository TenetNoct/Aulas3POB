package dominio;

public class Moto extends Veiculo {
    private boolean temPartidaEletrica;

    public Moto(String marca, int ano, boolean temPartidaEletrica) {
        super(marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tem Partida Elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
    }
}