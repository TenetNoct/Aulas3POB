package aluno.model;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private double media;
}

public Aluno(String nome, String matricula, String curso, double media) {
    this.nome = nome;
    this.matricula = matricula;
    this.curso = curso;
    this.media = media;
}

public String getNome() {
    return nome;
}

public String getMatricula() {
    return matricula;
}

public String getCurso() {
    return curso;
}

public double getMedia() {
    return media;
}

public String toFileString() {
    return nome + ";" + matricula + ";" + curso + ";" + media;
}
public static Aluno fromFileString(String fileString) {
    
    String[] parts = fileString.split(";");
    
    if (parts.length != 4) {
        throw new IllegalArgumentException("Formato inválido em: " + fileString);
        return null;
    }
    
    try {
        String nome = parts[0];
        String matricula = parts[1];
        String curso = parts[2];
        double media = Double.parseDouble(parts[3]);
        return new Aluno(nome, matricula, curso, media);    
    }
    catch (Exception e) {
        throw new IllegalArgumentException("Formato inválido em: " fileString, e);
        return null;
    }
    
}