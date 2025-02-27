package aula1.exercicio6;

import java.util.Scanner;


public class e6 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Porfavor digite seu salário bruto R$: ");
        
        double salarioB = scanf.nextDouble();

        System.out.print("Porfavor digite o desconto do inss R$: ");
        
        double inss = scanf.nextDouble();
    
        double salarioL = salarioB - inss;

        System.out.println("O seu salário líquido é R$:" + salarioL);

        scanf.close();
    }
}
