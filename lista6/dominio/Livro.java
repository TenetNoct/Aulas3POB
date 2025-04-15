package lista6.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;
    
    public Livro(String titulo, String autor, int anoPublicacao) throws IllegalArgumentException {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título do livro não pode ser vazio.");
        }
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do autor não pode ser vazio.");
        }
        if (anoPublicacao <= 0) {
            throw new IllegalArgumentException("Ano de publicação inválido.");
        }
        
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }
    
    public void emprestar() throws Exception {
        if (emprestado) {
            throw new Exception("Livro já está emprestado.");
        }
        emprestado = true;
    }
    
    public void devolver() throws Exception {
        if (!emprestado) {
            throw new Exception("Livro não está emprestado.");
        }
        emprestado = false;
    }
    
    public void atualizarDados(String novoTitulo, String novoAutor, int novoAno) throws IllegalArgumentException {
        if (novoTitulo != null && !novoTitulo.trim().isEmpty()) {
            this.titulo = novoTitulo;
        }
        if (novoAutor != null && !novoAutor.trim().isEmpty()) {
            this.autor = novoAutor;
        }
        if (novoAno > 0) {
            this.anoPublicacao = novoAno;
        } else if (novoAno <= 0) {
            throw new IllegalArgumentException("Ano de publicação inválido.");
        }
    }
    
    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Status: " + (emprestado ? "Emprestado" : "Disponível"));
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    public boolean isEmprestado() {
        return emprestado;
    }
}