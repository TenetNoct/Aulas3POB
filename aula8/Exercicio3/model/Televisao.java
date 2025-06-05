package aula8.Exercicio3.model;

public class Televisao implements DispositivoEletronico {
    private boolean ligada = false;

    @Override
    public void ligar() {
        if (!ligada) {
            System.out.println("TV ligada.");
            ligada = true;
        } else {
            System.out.println("TV já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if (ligada) {
            System.out.println("TV desligada.");
            ligada = false;
        } else {
            System.out.println("TV já está desligada.");
        }
    }

    public boolean isLigada() {
        return ligada;
    }
}