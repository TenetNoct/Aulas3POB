import dominio.Pessoa;
import dominio.Aluno;
import dominio.Professor;
import dominio.Veiculo;
import dominio.Carro;
import dominio.Moto;

public class Main {
    public static void main(String[] args) {
        // Teste da hierarquia Pessoa
        System.out.println("--- Teste da Hierarquia Pessoa ---");
        Pessoa pessoa = new Pessoa("Carlos", 30);
        Aluno aluno = new Aluno("Ana", 20, "Engenharia de Software");
        Professor professor = new Professor("Dr. Silva", 45, 8500.00);

        System.out.println("\nDados da Pessoa:");
        pessoa.exibirDados();

        System.out.println("\nDados do Aluno:");
        aluno.exibirDados();

        System.out.println("\nDados do Professor:");
        professor.exibirDados();

        // Teste da hierarquia Veiculo
        System.out.println("\n--- Teste da Hierarquia Veículo ---");
        Carro carro = new Carro("Ford", 2022, 4);
        Moto moto = new Moto("Yamaha", 2023, true);

        System.out.println("\nDados do Carro:");
        carro.exibirDados();

        System.out.println("\nDados da Moto:");
        moto.exibirDados();
    }
}