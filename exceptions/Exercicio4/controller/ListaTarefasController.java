package exceptions.Exercicio4.controller;

import exceptions.Exercicio4.model.ListaTarefasModel;
import exceptions.Exercicio4.view.ListaTarefasView;

public class ListaTarefasController {
    private ListaTarefasModel model;
    private ListaTarefasView view;

    public ListaTarefasController(ListaTarefasModel model, ListaTarefasView view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.mostrarMenu();
            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    removerTarefa();
                    break;
                case 3:
                    exibirTarefas();
                    break;
                case 0:
                    view.mostrarMensagem("Saindo do sistema de tarefas...");
                    break;
                default:
                    view.mostrarErro("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void adicionarTarefa() {
        String tarefa = view.lerTarefa();
        if (tarefa.trim().isEmpty()) {
            view.mostrarErro("A descrição da tarefa não pode estar vazia.");
            return;
        }
        model.adicionarTarefa(tarefa);
        view.mostrarMensagem("Tarefa adicionada com sucesso!");
    }

    private void removerTarefa() {
        if (model.isEmpty()) {
            view.mostrarErro("Não há tarefas para remover.");
            return;
        }
        view.exibirTarefas(model.getTarefas());
        int indice = view.lerIndiceTarefa();
        try {
            model.removerTarefa(indice);
            view.mostrarMensagem("Tarefa removida com sucesso!");
        } catch (IndexOutOfBoundsException e) {
            view.mostrarErro(e.getMessage());
        }
    }

    private void exibirTarefas() {
        view.exibirTarefas(model.getTarefas());
    }
}