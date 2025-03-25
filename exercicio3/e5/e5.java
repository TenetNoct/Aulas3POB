package exercicio3.e5;
import java.util.Scanner;

public class e5 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Insira o valor do inicio do intervalo:");
        int init = scanf.nextInt();

        System.out.println("Insira o valor do fim do intervalo:");
        int end = scanf.nextInt();
        
        scanf.close();

        int i = init;
        
        for (; i <= end; i++){
            boolean isPrime = true;
            if (i > 1) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

    }
    
}
