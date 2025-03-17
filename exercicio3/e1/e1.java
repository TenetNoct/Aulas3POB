import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Insira até onde vai a soma dos n primeiros números naturais:");
        int n = scanf.nextInt();
        int acumulador = 0;

        for (int i = 0; i <= n; i++) {
            acumulador += i;
        }
        System.out.print(acumulador);

        scanf.close();
    }
}
