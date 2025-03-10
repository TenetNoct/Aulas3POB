package aula2.e5;
import java.util.Scanner;

// Exercício 5: Conversão de Notas para Conceito

public class e5 {
    public static void main(String[] args) {   
        Scanner scanf = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");

        float nota = scanf.nextFloat();

        int notaT = (int) Math.ceil(nota);

        switch (notaT){
            case 0:
            case 1:
            case 2:
                System.out.println("Conceito: E");
                break;
            case 3:
            case 4:
                System.out.println("Conceito: D");
                break;
            case 5: 
            case 6:
                System.out.println("Conceito: C");
                break;
            case 7:
            case 8:
                System.out.println("Conceito: B");
                break; 
            case 9:
            case 10:
                System.out.println("Conceito: A");
                break;
            default:
                System.out.println("Nota Inválida.");
                break;  
        }
        scanf.close();
    }

}
