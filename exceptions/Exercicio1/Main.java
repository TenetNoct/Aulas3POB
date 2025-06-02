package exceptions.Exercicio1;

import exceptions.Exercicio1.controller.TemperaturaController;
import exceptions.Exercicio1.model.Temperatura;
import exceptions.Exercicio1.view.TemperaturaView;

public class Main {
    public static void main(String[] args) {
        Temperatura model = new Temperatura(0); // Inicializa com 0 Celsius
        TemperaturaView view = new TemperaturaView();
        TemperaturaController controller = new TemperaturaController(model, view);

        controller.iniciar();
    }
}