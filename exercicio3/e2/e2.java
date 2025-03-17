import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Insira o valor da tabuada: ");
        int n = scanf.nextInt();
        int i = 1;
        
        while (i<=10) {
            System.out.println(n + " x 1 = " + n*i);
            i++;
        }
        scanf.close();
    }
}
