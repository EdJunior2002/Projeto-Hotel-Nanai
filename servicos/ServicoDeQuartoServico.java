package servicos;

import java.util.Scanner;
import entidades.ServicoDeQuarto;
import repositorio.ServicoDeQuartoRepositorio;

public class ServicoDeQuartoServico {
    private Scanner inputquarto = new Scanner(System.in);
    private ServicoDeQuartoRepositorio limpezaSQ = new ServicoDeQuartoRepositorio();
    private ServicoDeQuartoRepositorio cafedamanhservicoDQ = new ServicoDeQuartoRepositorio();
    private ServicoDeQuartoRepositorio almocoSQ  = new ServicoDeQuartoRepositorio();
    private ServicoDeQuartoRepositorio jantaSQ  = new ServicoDeQuartoRepositorio();
    private ServicoDeQuartoRepositorio bebidasSQ  = new ServicoDeQuartoRepositorio();


    public void adcionando_limpeza() {

        System.out.println("DIGITE O TIPO DE SERVIÇO DE QUARTO: ");
        String tipo = inputquarto.nextLine();
        System.out.println("DIGITE O VALOR DO SERVICO DE QUARTO: ");
        String valor = inputquarto.nextLine();

        limpezaSQ.salvarlimpeza(new ServicoDeQuarto(tipo, valor));
        System.out.println("\nO SERVIÇO DE QUARTO FOI ADICIONADO COM SUCESSO!\n");

    }

    public void adicionando_cafeDaManha() {

        System.out.println("DIGITE O TIPO DE SERVIÇO DE QUARTO: ");
        String tipo = inputquarto.nextLine();
        System.out.println("DIGITE O VALOR DO SERVICO DE QUARTO: ");
        String valor = inputquarto.nextLine();
        cafedamanhservicoDQ.salvarcafedamanha(new ServicoDeQuarto(tipo, valor));
        System.out.println("\nO SERVIÇO DE QUARTO FOI ADICIONADO COM SUCESSO!\n");

    }

    public void adicionando_almoco() {

        System.out.println("DIGITE O TIPO DE SERVIÇO DE QUARTO: ");
        String tipo = inputquarto.nextLine();
        System.out.println("DIGITE O VALOR DO SERVICO DE QUARTO: ");
        String valor = inputquarto.nextLine();
        almocoSQ.salvaralmoco(new ServicoDeQuarto(tipo, valor));
        System.out.println("\nO SERVÇO DE QUARTO FOI ADICIONADO COM SUCESSO!\n");
    }
    public void adcionando_janta() {

        System.out.println("DIGITE O TIPO DE SERVIÇO DE QUARTO: ");
        String tipo = inputquarto.nextLine();
        System.out.println("DIGITE O VALOR DO SERVICO DE QUARTO: ");
        String valor = inputquarto.nextLine();

        jantaSQ.salvarjanta(new ServicoDeQuarto(tipo, valor));
        System.out.println("\nO SERVIÇO DE QUARTO FOI ADICIONADO COM SUCESSO!\n");

    }
    public void adcionando_bebidas() {

        System.out.println("DIGITE O TIPO DE SERVIÇO DE QUARTO: ");
        String tipo = inputquarto.nextLine();
        System.out.println("DIGITE O VALOR DO SERVICO DE QUARTO: ");
        String valor = inputquarto.nextLine();

        bebidasSQ.salvarbebidas(new ServicoDeQuarto(tipo, valor));
        System.out.println("\nO SERVIÇO DE QUARTO FOI ADICIONADO COM SUCESSO!\n");

    }

    public void mostrando_limpeza() {
        limpezaSQ.mostrando_servicoLimpeza();
    }

    public void mostrando_cafedamanha() {
        cafedamanhservicoDQ.mostrando_cafedamanha();
    }

    public void mostrando_almoco() {
        almocoSQ.mostrando_almoco();
    }
    public void mostrando_janta() {
        jantaSQ.mostrando_janta();
    }
    public void mostrando_bebidas() {
        bebidasSQ.mostrando_servicobebidas();
    }
}
