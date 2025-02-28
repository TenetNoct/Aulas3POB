import java.util.Scanner;

public class e9 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Porfavor digite a cotação do dolar hoje (somente os números ex: 5,70): ");

        double cotacao = scanf.nextDouble();

        System.out.print("Porfavor agora digite o varlor em reais que serão convertidos em doláres: ");

        double valor = scanf.nextDouble();

        double troca = valor / cotacao;

        System.out.println("O valor de R$" + valor + " convertido em dólares é: $" + troca);

        scanf.close();

    }
}
