package lista6.dominio;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    
    public Funcionario(String nome, double salario, String cargo) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }
        if (cargo == null || cargo.trim().isEmpty()) {
            throw new IllegalArgumentException("Cargo não pode ser vazio.");
        }
        
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    public void aumentarSalario(double percentual) throws IllegalArgumentException {
        if (percentual <= 0) {
            throw new IllegalArgumentException("Percentual de aumento deve ser positivo.");
        }
        salario += salario * (percentual / 100);
    }
    
    public void mudarCargo(String novoCargo) throws IllegalArgumentException {
        if (novoCargo == null || novoCargo.trim().isEmpty()) {
            throw new IllegalArgumentException("Novo cargo não pode ser vazio.");
        }
        cargo = novoCargo;
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: R$ %.2f\n", salario);
        System.out.println("Cargo: " + cargo);
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public String getCargo() {
        return cargo;
    }
}