package aula8.Exercicio2;

import aula8.Exercicio2.controller.FormaGeometricaController;
import aula8.Exercicio2.view.FormaGeometricaView;

public class Main {
    public static void main(String[] args) {
        FormaGeometricaView view = new FormaGeometricaView();
        FormaGeometricaController controller = new FormaGeometricaController(view);
        controller.calcularFormas();
    }
}