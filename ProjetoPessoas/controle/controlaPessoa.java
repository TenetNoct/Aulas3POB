import dominio.Pessoa;
import java.util.ArrayList;
import java.util.Scanner;

public class controlaPessoa {
    public static void main(String[] args) {
        int opcao = 0; 
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(); // Corrigido para ArrayList com A maiúsculo        
        Scanner scanf = new Scanner(System.in);

        while (opcao != 5) {
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("5 - Sair");
            opcao = scanf.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome: ");
                    String nome = scanf.next();
                    System.out.println("Digite a idade: ");
                    int idade = scanf.nextInt();
                    System.out.println("Digite a altura: ");
                    double altura = scanf.nextDouble();
                    System.out.println("Digite o peso: ");
                    double peso = scanf.nextDouble();
                    System.out.println("Digite o sexo: ");
                    char sexo = scanf.next().charAt(0);
                    pessoas.add(new Pessoa(nome, idade, altura, peso, sexo));
                    break;
                case 2:
                    for (Pessoa pessoa : pessoas) {
                        pessoa.ListarPessoa();
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        scanf.close();
    }
}
