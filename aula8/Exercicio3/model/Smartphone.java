package aula8.Exercicio3.model;

public class Smartphone implements DispositivoEletronico {
    private boolean ligado = false;

    @Override
    public void ligar() {
        if (!ligado) {
            System.out.println("Smartphone ligado.");
            ligado = true;
        } else {
            System.out.println("Smartphone já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            System.out.println("Smartphone desligado.");
            ligado = false;
        } else {
            System.out.println("Smartphone já está desligado.");
        }
    }

    public boolean isLigado() {
        return ligado;
    }
}