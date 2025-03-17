import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Insira a quantidade de alunos:");
        int n = scanf.nextInt();
        int i = 1;
        float media = 0;

        while(i <= n){
            System.out.print("Insira a média do aluno "+ i +":");
            float nota = scanf.nextFloat(); 
            media += nota;
            i++;
        }

        System.out.println("A média dos alunos é: " + (media / n)); 

        scanf.close();
    }
}
