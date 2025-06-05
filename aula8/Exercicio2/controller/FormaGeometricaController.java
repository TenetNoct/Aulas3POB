package aula8.Exercicio2.controller;

import aula8.Exercicio2.model.Circulo;
import aula8.Exercicio2.model.Retangulo;
import aula8.Exercicio2.view.FormaGeometricaView;

public class FormaGeometricaController {
    private FormaGeometricaView view;

    public FormaGeometricaController(FormaGeometricaView view) {
        this.view = view;
    }

    public void calcularFormas() {
        // Calcular Retângulo
        System.out.println("--- Dados do Retângulo ---");
        double larguraRetangulo = view.lerValor("Digite a largura do retângulo: ");
        double alturaRetangulo = view.lerValor("Digite a altura do retângulo: ");
        Retangulo retangulo = new Retangulo(larguraRetangulo, alturaRetangulo);
        view.mostrarResultados("Retângulo", retangulo.calcularArea(), retangulo.calcularPerimetro());

        // Calcular Círculo
        System.out.println("\n--- Dados do Círculo ---");
        double raioCirculo = view.lerValor("Digite o raio do círculo: ");
        Circulo circulo = new Circulo(raioCirculo);
        view.mostrarResultados("Círculo", circulo.calcularArea(), circulo.calcularPerimetro());
    }
}