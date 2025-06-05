package aula8.Exercicio3;

import aula8.Exercicio3.controller.DispositivoController;
import aula8.Exercicio3.model.Smartphone;
import aula8.Exercicio3.model.Televisao;
import aula8.Exercicio3.view.DispositivoView;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Televisao televisao = new Televisao();
        DispositivoView view = new DispositivoView();
        DispositivoController controller = new DispositivoController(smartphone, televisao, view);

        controller.iniciar();
    }
}