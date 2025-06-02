package exceptions.Exercicio1.controller;

import exceptions.Exercicio1.model.Temperatura;
import exceptions.Exercicio1.view.TemperaturaView;

public class TemperaturaController {
    private Temperatura model;
    private TemperaturaView view;

    public TemperaturaController(Temperatura model, TemperaturaView view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        double celsius = view.lerTemperaturaCelsius();
        model.setCelsius(celsius);
        double fahrenheit = model.toFahrenheit();
        view.mostrarTemperaturaFahrenheit(fahrenheit);
    }
}