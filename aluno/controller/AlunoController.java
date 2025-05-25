package aluno.controller;
import java.util.ArrayList;
import java.util.List;
import aluno.model.Aluno;
import java.io.*;

@SuppressWarnings("unused")
public class AlunoController {
    private List<Aluno> alunos;

    private AlunoRepository alunoRepository;

    public AlunoController() {
        this.alunoRepository = new AlunoRepository();
        this.alunos = AlunoRepository.getAlunos();
    }

    public ArrayList<Aluno> listarAlunos() {
        return new ArrayList<>(alunos);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        AlunoRepository.salvarAlunos(alunos);
    }

    public void removerAluno(String matricula) {
        alunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
        AlunoRepository.salvarAlunos(alunos);
    }

    public void atualizarAluno(Aluno aluno) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula().equals(aluno.getMatricula())) {
                alunos.set(i, aluno);
                AlunoRepository.salvarAlunos(alunos);
                break;
            }
        }
    }

    public Aluno buscarAlunoPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }


}

