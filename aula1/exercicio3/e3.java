import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.println("Porfavor Digite a temperatira em Celsius:");
        double celsius = scanf.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        
        scanf.close();
    }
}
