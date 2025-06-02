package exceptions.Exercicio2.controller;

import exceptions.Exercicio2.model.NumerosModel;
import exceptions.Exercicio2.view.NumerosView;

public class NumerosController {
    private NumerosModel model;
    private NumerosView view;

    public NumerosController(NumerosModel model, NumerosView view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        for (int i = 0; i < model.getTamanhoArray(); i++) {
            int numero = view.lerNumero(i + 1);
            model.setNumero(i, numero);
        }
        view.mostrarNumeros(model.getNumeros());
    }
}