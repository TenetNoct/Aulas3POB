package aula2.e4;
import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("==Calculadora ano bissexto==");
        System.out.println("============================");

        System.out.println("Digite o ano");
        int ano = scanf.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("O ano " + ano + " é bissexto");
        } else {
            System.out.println("O ano " + ano + " não é bissexto");
        }

        scanf.close();
    }
}
