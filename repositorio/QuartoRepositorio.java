package repositorio;

import java.util.ArrayList;

import entidades.Quarto;
import java.util.Scanner;

public class QuartoRepositorio {
    private Scanner input_do_quarto = new Scanner(System.in);

    ArrayList<Quarto> Stardartlist = new ArrayList<>();
    ArrayList<Quarto> Masterlist = new ArrayList<>();
    ArrayList<Quarto> MasterSupeiorlist = new ArrayList<>();

    public void salvarstandart(Quarto quartostandart) {
        Stardartlist.add(quartostandart);
    }

    public void salvarmaster(Quarto quartomaster) {
        Masterlist.add(quartomaster);
    }

    public void salvarmastersupeior(Quarto quartomastersuperior) {
        MasterSupeiorlist.add(quartomastersuperior);
    }

    public void mostrando_standart() {
        System.out.println("MOSTRANDO TIPO DO QUARTO: \n");
        for (int i = 0; i < Stardartlist.size(); i++) {
            System.out.println(i + 1 + "º: " + Stardartlist.get(i).getTipo_do_quarto() + "\nR$:"
                    + Stardartlist.get(i).getValor_do_quarto());
        }
    }

public void mostrando_master(){
    System.out.println("MOSTRANDO TIPO DO QUARTO: \n");
    for (int i = 0; i< Masterlist.size(); i++){
        System.out.println(i+1 + "º: "+Masterlist.get(i).getTipo_do_quarto()+ "\nR$:"+ Masterlist.get(i).getValor_do_quarto());
    }
}

    public void mostrando_mastersuperior() {
        System.out.println("MOSTRANDO TIPO DO QUARTO: \n");
        for (int i = 0; i < MasterSupeiorlist.size(); i++) {
            System.out.println(i + 1 + "º: " + MasterSupeiorlist.get(i).getTipo_do_quarto() + "\nR$: "
                    + MasterSupeiorlist.get(i).getValor_do_quarto());
        }
    }

   

    public void excluindoStandart() {
    System.out.println("Qual quarto você deseja excluir do cadastro? Digite o nome:");
    String excluindoCliente = input_do_quarto.nextLine();
    Quarto quartoEncontrado = null;

    for (Quarto Quarto : Stardartlist) {
        if (Quarto.getTipo_do_quarto().equalsIgnoreCase(excluindoCliente)) {
            quartoEncontrado = Quarto;
            break; 
        }
    }

    if (quartoEncontrado != null) {
        System.out.println("Procurando Quarto....");
        Stardartlist.remove(quartoEncontrado);
        System.out.println("O quarto foi excluído com sucesso.\n");
    } else {
        System.out.println("Quarto não encontrado. Tente novamente!\n");
    }
    
    }

    public void excluindoMaster() {
    System.out.println("Qual quarto você deseja excluir do cadastro? Digite o nome:");
    String excluindoCliente = input_do_quarto.nextLine();
    Quarto quartoEncontrado = null;

    for (Quarto Quarto : Masterlist) {
        if (Quarto.getTipo_do_quarto().equalsIgnoreCase(excluindoCliente)) {
            quartoEncontrado = Quarto;
            break; 
        }
    }

    if (quartoEncontrado != null) {
        System.out.println("Procurando Quarto....");
        Masterlist.remove(quartoEncontrado);
        System.out.println("O quarto foi excluído com sucesso.\n");
    } else {
        System.out.println("Quarto não encontrado. Tente novamente!\n");
    }
    
    }
    public void excluindoMasterSuperior() {
    System.out.println("Qual quarto você deseja excluir do cadastro? Digite o nome:");
    String excluindoCliente = input_do_quarto.nextLine();
    Quarto quartoEncontrado = null;

    for (Quarto Quarto : MasterSupeiorlist) {
        if (Quarto.getTipo_do_quarto().equalsIgnoreCase(excluindoCliente)) {
            quartoEncontrado = Quarto;
            break; 
        }
    }

    if (quartoEncontrado != null) {
        System.out.println("Procurando Quarto....");
        MasterSupeiorlist.remove(quartoEncontrado);
        System.out.println("O quarto foi excluído com sucesso.\n");
    } else {
        System.out.println("Quarto não encontrado. Tente novamente!\n");
    }
}

}