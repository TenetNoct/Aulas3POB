package lista5;
import java.util.Scanner;
import java.util.ArrayList;

public class e2 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        System.out.println("Digite 5 nomes:");
        for(int i = 0; i < 5; i++) {
            nomes.add(scanf.nextLine());
        }
        
        System.out.println("Digite o nome que deseja remover:");
        String nomeRemover = scanf.nextLine();
        
        if(nomes.remove(nomeRemover)) {
            System.out.println("Nome removido com sucesso. Lista atualizada:");
        } else {
            System.out.println("Nome não encontrado. Lista original:");
        }
        
        for(String nome : nomes) {
            System.out.println(nome);
        }
        
        scanf.close();
    }
}