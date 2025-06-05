package aula8.Exercicio3.controller;

import aula8.Exercicio3.model.DispositivoEletronico;
import aula8.Exercicio3.model.Smartphone;
import aula8.Exercicio3.model.Televisao;
import aula8.Exercicio3.view.DispositivoView;

public class DispositivoController {
    private Smartphone smartphone;
    private Televisao televisao;
    private DispositivoView view;

    public DispositivoController(Smartphone smartphone, Televisao televisao, DispositivoView view) {
        this.smartphone = smartphone;
        this.televisao = televisao;
        this.view = view;
    }

    public void iniciar() {
        int opcaoPrincipal;
        do {
            opcaoPrincipal = view.mostrarMenuPrincipal();
            switch (opcaoPrincipal) {
                case 1:
                    controlarDispositivo(smartphone, "Smartphone");
                    break;
                case 2:
                    controlarDispositivo(televisao, "Televisão");
                    break;
                case 0:
                    view.mostrarMensagem("Saindo do sistema de controle de dispositivos...");
                    break;
                default:
                    view.mostrarErro("Opção inválida. Tente novamente.");
            }
        } while (opcaoPrincipal != 0);
    }

    private void controlarDispositivo(DispositivoEletronico dispositivo, String nomeDispositivo) {
        int opcaoAcao;
        boolean ligado = (dispositivo instanceof Smartphone) ? ((Smartphone) dispositivo).isLigado() : ((Televisao) dispositivo).isLigada();

        do {
            opcaoAcao = view.mostrarMenuAcoes(nomeDispositivo, ligado);
            switch (opcaoAcao) {
                case 1:
                    dispositivo.ligar();
                    ligado = (dispositivo instanceof Smartphone) ? ((Smartphone) dispositivo).isLigado() : ((Televisao) dispositivo).isLigada();
                    break;
                case 2:
                    dispositivo.desligar();
                    ligado = (dispositivo instanceof Smartphone) ? ((Smartphone) dispositivo).isLigado() : ((Televisao) dispositivo).isLigada();
                    break;
                case 0:
                    view.mostrarMensagem("Voltando ao menu principal...");
                    break;
                default:
                    view.mostrarErro("Ação inválida. Tente novamente.");
            }
        } while (opcaoAcao != 0);
    }
}