package lista7;
class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$" + String.format("%.2f", salarioBase));
    }
}

class Gerente extends Funcionario {
    private static final double BONUS_PERCENTUAL = 0.20; // 20% de bônus

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (super.calcularSalario() * BONUS_PERCENTUAL);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cargo: Gerente");
        System.out.println("Salário Final (com bônus de " + (BONUS_PERCENTUAL * 100) + "%"): R$" + String.format("%.2f", calcularSalario()));
    }
}

class Estagiario extends Funcionario {
    private static final double BONUS_PERCENTUAL = 0.05; // 5% de bônus

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (super.calcularSalario() * BONUS_PERCENTUAL);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cargo: Estagiário");
        System.out.println("Salário Final (com bônus de " + (BONUS_PERCENTUAL * 100) + "%"): R$" + String.format("%.2f", calcularSalario()));
    }
}

class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de Portas: " + quantidadePortas);
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindradas: " + cilindradas);
    }
}

class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo...");
    }
}

class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miando...");
    }
}

public class lista7_Class {
    public static void main(String[] args) {
        // Exercício 1: Herança em Funcionários
        System.out.println("\n--- Exercício 1: Herança em Funcionários ---");
        Funcionario funcionario = new Funcionario("João", 3000.0);
        Gerente gerente = new Gerente("Maria", 5000.0);
        Estagiario estagiario = new Estagiario("Pedro", 1500.0);

        funcionario.exibirDetalhes();
        System.out.println();
        gerente.exibirDetalhes();
        System.out.println();
        estagiario.exibirDetalhes();

        // Exercício 2: Herança em Veículos
        System.out.println("\n--- Exercício 2: Herança em Veículos ---");
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Honda", "CBR 600RR", 2022, 600);

        System.out.println("\nInformações do Carro:");
        carro.exibirDados();

        System.out.println("\nInformações da Moto:");
        moto.exibirDados();

        // Exercício 3: Herança em Animais
        System.out.println("\n--- Exercício 3: Herança em Animais ---");
        Cachorro cachorro = new Cachorro("Rex", 5);
        Gato gato = new Gato("Miau", 3);

        System.out.println("\nSom do Cachorro:");
        cachorro.emitirSom();

        System.out.println("\nSom do Gato:");
        gato.emitirSom();
    }
}