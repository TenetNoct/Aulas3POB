package aluno.view;
import java.util.ArrayList;
import java.util.Scanner;
import aluno.controller.AlunoController;
import aluno.model.Aluno;

public class AlunoView {
    private AlunoController alunoController;
    private Scanner scanner;

    public AlunoView() {
        this.alunoController = new AlunoController();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Buscar Aluno por Matrícula");
            System.out.println("4. Atualizar Aluno");
            System.out.println("5. Excluir Aluno");
            System.out.println("0. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    buscarAlunoPorMatricula();
                    break;
                case 4:
                    atualizarAluno();
                    break;
                case 5:
                    excluirAluno();
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }while (opcao != 0); 
    }

    private void cadastrarAluno() {
        String nome = capturarString("Nome: ");
        String matricula = capturarString("Matrícula: ");
        String curso = capturarString("Curso: ");
        double media = capturarDouble("Média: ");

        Aluno aluno = new Aluno(nome, matricula, curso, media);
        alunoController.cadastrarAluno(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    private void listarAlunos() {
        ArrayList<Aluno> alunos = alunoController.listarAlunos();
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Curso: " + aluno.getCurso());
                System.out.println("Média: " + aluno.getMedia());
                System.out.println("------------------------");
            }
        }
    }

    private void buscarAlunoPorMatricula() {
        String matricula = capturarString("Digite a matrícula do aluno: ");

        Aluno aluno = alunoController.buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            System.out.println("Aluno encontrado:");
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Média: " + aluno.getMedia());
        }
    }

    private void atualizarAluno() {
        String matricula = capturarString("Digite a matrícula do aluno a ser atualizado: ");

        Aluno aluno = alunoController.buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            String nome = capturarString("Novo nome: ");
            String curso = capturarString("Novo curso: ");
            double media = capturarDouble("Nova média: ");

            aluno.setNome(nome);
            aluno.setCurso(curso);
            aluno.setMedia(media);

            alunoController.atualizarAluno(aluno);
            System.out.println("Aluno atualizado com sucesso!");
        }
    }

    private void excluirAluno() {
        String matricula = capturarString("Digite a matrícula do aluno a ser excluído: ");
        Aluno aluno = alunoController.buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            alunoController.excluirAluno(aluno);    
            System.out.println("Aluno excluído com sucesso!");
        }
    }

    private int capturarInteiro(String mensagem) {
        int valor = 0;
        boolean valido;
        do {
            try {
                if (mensagem != null) {
                    System.out.print(mensagem); 
                }
                valor = scanner.nextInt(); 
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                valido = false;
                scanner.nextLine(); 
            }
        } while (!valido);
        scanner.nextLine(); 
        return valor;
    }


    private double capturarDouble(String mensagem) {
        double valor = 0.0;
        boolean valido;
        do {
            try {
                System.out.print(mensagem);
                valor = scanner.nextDouble(); 
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número decimal.");
                valido = false;
                scanner.nextLine(); 
            }
        } while (!valido);
        scanner.nextLine(); 
        return valor;
    }

    private String capturarString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

}
    