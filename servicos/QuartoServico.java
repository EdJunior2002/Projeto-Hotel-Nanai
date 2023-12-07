package servicos;

import java.util.Scanner;
import entidades.Quarto;
import repositorio.QuartoRepositorio;

public class QuartoServico {
    private Scanner inputquarto = new Scanner(System.in);
    private QuartoRepositorio standartRepositorio = new QuartoRepositorio();
    private QuartoRepositorio masterRepositorio = new QuartoRepositorio();
    private QuartoRepositorio mastersuperiorRepositorio = new QuartoRepositorio();

    public void adicionar_standart() {
        System.out.println("DIGITE O TIPO DO QUARTO: ");
        String tipo = inputquarto.nextLine().toUpperCase();
        System.out.println("DIGITE O VALOR DO QUARTO: ");
        String valor = inputquarto.nextLine();
    
        if (!tipo.equals("STANDART") || !valor.equals("200")) {
            System.out.println("Você inseriu o tipo ou valor errado. Tente novamente!");
        } else {
            standartRepositorio.salvarstandart(new Quarto(tipo, valor));
            System.out.println("O quarto foi adicionado com sucesso!\n");
        }
    }

    public void adicionando_master() {

        System.out.println("DIGITE O TIPO DO QUARTO: ");
        String tipo = inputquarto.nextLine();
        System.out.println("Digite o valor do quarto: ");
        String valor = inputquarto.nextLine();
        if (!valor.equals("400")) {
            System.out.println("Você inseriu o valor errado. Tente novamente!");
        } else {
            standartRepositorio.salvarstandart(new Quarto(tipo, valor));
            System.out.println("O quarto foi adicionado com sucesso!\n");
        }

    }

    public void adicionando_mastersuperior() {

        System.out.println("Digite o tipo do quarto: ");
        String tipo = inputquarto.nextLine();
        System.out.println("Digite o valor do quarto: ");
        String valor = inputquarto.nextLine();
        if (!valor.equals("600")) {
            System.out.println("Você inseriu o valor errado. Tente novamente!");
        } else {
            standartRepositorio.salvarstandart(new Quarto(tipo, valor));
            System.out.println("O quarto foi adicionado com sucesso!\n");
        }
    }

    public void mostrando_standart() {
        standartRepositorio.mostrando_standart();
    }

    public void mostrando_master() {
        masterRepositorio.mostrando_master();
    }

    public void mostrando_mastersuperior() {
        mastersuperiorRepositorio.mostrando_mastersuperior();
    }

    public void removendo_standart() {
        standartRepositorio.excluindoStandart();
    }

    public void excluindo_master() {
        masterRepositorio.excluindoMaster();
    }

    public void excluindo_mastersuperior() {
        mastersuperiorRepositorio.excluindoMasterSuperior();
    }
}