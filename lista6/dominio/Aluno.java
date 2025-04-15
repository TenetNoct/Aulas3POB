package lista6.dominio;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;
    
    public Aluno(String nome, String matricula, int quantidadeNotas) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do aluno não pode ser vazio.");
        }
        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("Matrícula não pode ser vazia.");
        }
        if (quantidadeNotas <= 0) {
            throw new IllegalArgumentException("Quantidade de notas deve ser positiva.");
        }
        
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[quantidadeNotas];
        // Inicializa todas as notas com -1 para indicar que ainda não foram atribuídas
        for (int i = 0; i < quantidadeNotas; i++) {
            this.notas[i] = -1;
        }
    }
    
    public void atribuirNota(int indice, double nota) throws IllegalArgumentException, IndexOutOfBoundsException {
        if (indice < 0 || indice >= notas.length) {
            throw new IndexOutOfBoundsException("Índice de nota inválido.");
        }
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
        }
        notas[indice] = nota;
    }
    
    public double calcularMedia() throws Exception {
        int notasAtribuidas = 0;
        double soma = 0;
        
        for (double nota : notas) {
            if (nota >= 0) { // Verifica se a nota foi atribuída
                soma += nota;
                notasAtribuidas++;
            }
        }
        
        if (notasAtribuidas == 0) {
            throw new Exception("Nenhuma nota foi atribuída ainda.");
        }
        
        return soma / notasAtribuidas;
    }
    
    public String verificarSituacao() throws Exception {
        double media = calcularMedia();
        
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Notas:");
        
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0) {
                System.out.printf("Nota %d: %.2f\n", i + 1, notas[i]);
            } else {
                System.out.printf("Nota %d: Não atribuída\n", i + 1);
            }
        }
        
        try {
            double media = calcularMedia();
            System.out.printf("Média: %.2f\n", media);
            System.out.println("Situação: " + verificarSituacao());
        } catch (Exception e) {
            System.out.println("Média: Não disponível");
            System.out.println("Situação: Não disponível");
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public double[] getNotas() {
        return notas;
    }
}