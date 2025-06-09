package Trabalho09_06.model;

public class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(String placa, String modelo, int ano, int qtdPortas) {
        super(placa, modelo, ano); // Chama o construtor da superclasse Veiculo
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void exibirDados() {
        System.out.println(
            "Carro - Modelo: " + getModelo() + 
            " | Placa: " + getPlaca() + 
            " | Ano: " + getAno() + 
            " | Portas: " + getQtdPortas()
        );
    }
}
