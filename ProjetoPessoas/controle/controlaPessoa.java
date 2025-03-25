package controle;

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
            System.out.println("3 - Calcular IMC");
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
                case 3:
                    if (pessoas.isEmpty()) {
                        System.out.println("Não há pessoas cadastradas!");
                    } else {
                        System.out.println("\nLista de pessoas:");
                        for (int i = 0; i < pessoas.size(); i++) {
                            System.out.println(i + " - " + pessoas.get(i).getNome());
                        }
                        System.out.println("\nDigite o número da pessoa para calcular o IMC: ");
                        int indice = scanf.nextInt();
                        
                        if (indice >= 0 && indice < pessoas.size()) {
                            Pessoa pessoaSelecionada = pessoas.get(indice);
                            double imc = pessoaSelecionada.calcularIMC();
                            String interpretacao = pessoaSelecionada.interpretarIMC();
                            
                            System.out.println("\nNome: " + pessoaSelecionada.getNome());
                            System.out.println("IMC: " + String.format("%.2f", imc));
                            System.out.println("Classificação: " + interpretacao + "\n");
                        } else {
                            System.out.println("Índice inválido!");
                        }
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
