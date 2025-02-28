import java.util.Scanner;

public class e8 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Insira o valor do raio da esfera: ");

        final double  pi = 3.14159;

        double raio = scanf.nextDouble();

        double volume = (4.0/3) * pi * raio * raio * raio;

        System.out.println("O volume da esfera é: " + volume);

        scanf.close();
    }
}
