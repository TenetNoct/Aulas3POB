package lista5;
import java.util.Scanner;
import java.util.ArrayList;

public class e3 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        
        System.out.println("Digite números (digite -1 para terminar):");
        while(true) {
            double num = scanf.nextDouble();
            if(num == -1) {
                break;
            }
            numeros.add(num);
        }
        
        double soma = 0;
        for(double num : numeros) {
            soma += num;
        }
        
        double media = numeros.isEmpty() ? 0 : soma / numeros.size();
        
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        
        scanf.close();
    }
}