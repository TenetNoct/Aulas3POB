// Exercício 3: Calculadora Simples com switch-case

package aula2.e3;
import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("==Calculadora Simples==");
        System.out.println("=======================");
    
        System.out.println("Digite o número");
        int num1 = scanf.nextInt();
        
        System.out.println("Digite o número");
        int num2 = scanf.nextInt();
        
        System.out.println("Digite a operação");
        char op = scanf.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':

                if (num2 == 0){
                    System.out.println("Não é possível dividir por zero");
                    break;
                }

                System.out.println("Resultado: " + (num1 / num2));
                break;
            default:
                System.out.println("Operação inválida");
        }
    
        scanf.close();

    }
}
