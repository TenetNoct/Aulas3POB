package Trabalho09_06.controller;

import Trabalho09_06.model.Veiculo;
import java.util.ArrayList;
import java.util.List;

/**
 * Controla as operações de negócio relacionadas aos veículos,
 * como adicionar e listar.
 */
public class VeiculoController {
    
    // A lista de veículos é privada e gerenciada pelo controlador.
    private final List<Veiculo> veiculos;

    public VeiculoController() {
        this.veiculos = new ArrayList<>();
    }

    /**
     * Adiciona um novo veículo à lista.
     * @param veiculo O objeto Veiculo a ser adicionado.
     */
    public void adicionarVeiculo(Veiculo veiculo) {
        if (veiculo != null) {
            this.veiculos.add(veiculo);
            System.out.println("\nVeículo cadastrado com sucesso!");
        } else {
            System.out.println("\nFalha ao cadastrar o veículo. Objeto nulo.");
        }
    }

    /**
     * Exibe todos os veículos cadastrados na lista.
     * Utiliza polimorfismo ao chamar o método exibirDados() de cada objeto.
     */
    public void listarVeiculos() {
        System.out.println("\n--- Lista de Veículos Cadastrados ---");
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            for (Veiculo veiculo : veiculos) {
                veiculo.exibirDados(); // Polimorfismo em ação!
            }
        }
    }
}