package aluno.controller;
import java.util.ArrayList;
import java.util.List;
import aluno.model.Aluno;
import java.io.*;

public class AlunoRepository {
    private static final String ARQUIVO_ALUNOS = "alunos.txt";

    public void salvarAlunos(List<Aluno> alunos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_ALUNOS))) {
            for (Aluno aluno : alunos) {
                writer.write(aluno.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar os alunos no arquivo.");
            e.printStackTrace();
        }

    }

    public ArrayList<Aluno> getAlunos() {
        ArrayList<Aluno> alunos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_ALUNOS))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                alunos.add(Aluno.fromFileString(linha));
            }
        }
        catch (IOException e) {
            System.out.println("Erro ao ler os alunos do arquivo.");
            e.printStackTrace();
        }
        catch (FileNotFoundException e) {
            System.out.println("Arquivo de alunos não encontrado.");
            e.printStackTrace();
        }
    }
    return alunos;
}