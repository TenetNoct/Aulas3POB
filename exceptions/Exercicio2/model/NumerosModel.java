package exceptions.Exercicio2.model;

public class NumerosModel {
    private int[] numeros;
    private static final int TAMANHO_ARRAY = 5;

    public NumerosModel() {
        this.numeros = new int[TAMANHO_ARRAY];
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumero(int indice, int numero) {
        if (indice >= 0 && indice < TAMANHO_ARRAY) {
            this.numeros[indice] = numero;
        }
    }

    public int getTamanhoArray() {
        return TAMANHO_ARRAY;
    }
}