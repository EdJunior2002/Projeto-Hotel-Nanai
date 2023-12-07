package servicos;

import java.util.Scanner;
import entidades.MetodoDePagamento;
import repositorio.PagamentoRepositorio;

public class PagamentoServico {
    private Scanner inputpagamento = new Scanner(System.in);
    private PagamentoRepositorio creditoRepositorio = new PagamentoRepositorio();
    private PagamentoRepositorio debitoRepositorio = new PagamentoRepositorio();
    private PagamentoRepositorio pixRepositorio = new PagamentoRepositorio();
    private PagamentoRepositorio especieRepositorio = new PagamentoRepositorio();
    private PagamentoRepositorio chequeRepositorio = new PagamentoRepositorio();

    public void adcionando_credito() {

        System.out.println("Digite o metodo de pagamento: ");
        String tipo = inputpagamento.nextLine();
        System.out.println("Digite o valor do pagamento: ");
        String valor = inputpagamento.nextLine();

        creditoRepositorio.salvarcredito(new MetodoDePagamento(tipo, valor));
        System.out.println("O pagamento foi efetuado com sucesso!");

    }

    public void adicionando_debito() {

        System.out.println("Digite o metodo de pagamento ");
        String tipo = inputpagamento.nextLine();
        System.out.println("Digite o valor do pagamento");
        String valor = inputpagamento.nextLine();
        debitoRepositorio.salvardebito(new MetodoDePagamento(tipo, valor));
        System.out.println("O pagamento foi efetuado com sucesso!");

    }

    public void adicionando_pix() {

        System.out.println("Digite o tipo do pagamento ");
        String tipo = inputpagamento.nextLine();
        System.out.println("Digite o valor do pagamento: ");
        String valor = inputpagamento.nextLine();
        pixRepositorio.salvarpix(new MetodoDePagamento (tipo, valor));
        System.out.println("O pagamento foi efetuado com sucesso!");
    }
    public void adicionando_especie() {

        System.out.println("Digite o tipo do pagamento ");
        String tipo = inputpagamento.nextLine();
        System.out.println("Digite o valor do pagamento: ");
        String valor = inputpagamento.nextLine();
        especieRepositorio.salvarpix(new MetodoDePagamento (tipo, valor));
        System.out.println("O pagamento foi efetuado com sucesso!");
    }
    public void adicionando_cheque() {

        System.out.println("Digite o tipo do pagamento ");
        String tipo = inputpagamento.nextLine();
        System.out.println("Digite o valor do pagamento: ");
        String valor = inputpagamento.nextLine();
        chequeRepositorio.salvarpix(new MetodoDePagamento (tipo, valor));
        System.out.println("O pagamento foi efetuado com sucesso!");
    }

    public void mostrando_credito() {
        creditoRepositorio.mostrando_credito();
    }

    public void mostrando_debito() {
        debitoRepositorio.mostrando_debito();
    }

    public void mostrando_pix() {
        pixRepositorio.mostrando_pix();
    }

    public void mostrando_especie() {
        especieRepositorio.mostrando_especie();
    }

    public void mostrando_cheque() {
        chequeRepositorio.mostrando_pix();
    }
}
 