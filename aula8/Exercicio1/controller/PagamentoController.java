package aula8.Exercicio1.controller;

import aula8.Exercicio1.model.BoletoBancario;
import aula8.Exercicio1.model.CartaoCredito;
import aula8.Exercicio1.model.Pagamento;
// A view não é estritamente necessária aqui, pois a lógica de exibição está no próprio método realizarPagamento.
// Mas, para manter o padrão MVC, podemos tê-la para futuras expansões ou centralização de I/O.

public class PagamentoController {

    public PagamentoController() {
    }

    public void processarPagamentos() {
        Pagamento cartao = new CartaoCredito();
        Pagamento boleto = new BoletoBancario();

        // Os valores podem ser fixos para este exemplo ou lidos da view se necessário.
        cartao.realizarPagamento(100.50);
        boleto.realizarPagamento(250.75);
    }
}