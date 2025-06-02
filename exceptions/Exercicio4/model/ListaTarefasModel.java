package exceptions.Exercicio4.model;

import java.util.ArrayList;

public class ListaTarefasModel {
    private ArrayList<String> tarefas;

    public ListaTarefasModel() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(int indice) throws IndexOutOfBoundsException {
        if (indice < 0 || indice >= tarefas.size()) {
            throw new IndexOutOfBoundsException("Índice inválido. A tarefa não existe nesta posição.");
        }
        this.tarefas.remove(indice);
    }

    public ArrayList<String> getTarefas() {
        return new ArrayList<>(tarefas); // Retorna uma cópia para evitar modificação externa direta
    }

    public boolean isEmpty() {
        return this.tarefas.isEmpty();
    }
}