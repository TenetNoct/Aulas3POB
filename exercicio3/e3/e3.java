import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Insira o valor da contagem regressiva:");
        int n = scanf.nextInt();

        do {
            System.out.println(n);
            n--;
        } while (n >= 0);
        scanf.close();
    }
}
