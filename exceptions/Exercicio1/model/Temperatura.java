package exceptions.Exercicio1.model;

public class Temperatura {
    private double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return (this.celsius * 9/5) + 32;
    }
}