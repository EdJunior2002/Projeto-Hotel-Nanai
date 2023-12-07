package repositorio;

import java.util.ArrayList;

import entidades.ServicoDeQuarto;
import java.util.Scanner;

public class ServicoDeQuartoRepositorio {
    private Scanner input_do_servico = new Scanner(System.in);

    ArrayList<ServicoDeQuarto> ServicoDeLimpezalist = new ArrayList<>();
    ArrayList<ServicoDeQuarto> CafeDaManhalist = new ArrayList<>();
    ArrayList<ServicoDeQuarto> Almocolist = new ArrayList<>();
    ArrayList<ServicoDeQuarto> Jantalist = new ArrayList<>();
    ArrayList<ServicoDeQuarto> Bebidaslist = new ArrayList<>();

    public void salvarlimpeza(ServicoDeQuarto servicodqLimpezasq) {
        ServicoDeLimpezalist.add(servicodqLimpezasq);
    }

    public void salvarcafedamanha(ServicoDeQuarto cafedamanhasq) {
        CafeDaManhalist.add(cafedamanhasq);
    }

    public void salvaralmoco(ServicoDeQuarto almocosq) {
        Almocolist.add(almocosq);
    }

    public void salvarjanta(ServicoDeQuarto jantasq) {
        Jantalist.add(jantasq);
    }

    public void salvarbebidas(ServicoDeQuarto bebidassq) {
        Bebidaslist.add(bebidassq);
    }
    

    public void mostrando_servicoLimpeza() {
        System.out.println("MOSTRANDO TIPO DO SERVIÇO DE QUARTO: \n");
        for (int i = 0; i < ServicoDeLimpezalist.size(); i++) {
            System.out.println(i + 1 + "º__" + ServicoDeLimpezalist.get(i).getTipo_do_servico() + "__R$:"
                    + ServicoDeLimpezalist.get(i).getValor_do_servico());
        }
    }

    public void mostrando_cafedamanha(){
        System.out.println("MOSTRANDO TIPO DO SERVIÇO DE QUARTO: \n");
            for (int i = 0; i< CafeDaManhalist.size(); i++){
            System.out.println(i+1 + "º__"+CafeDaManhalist.get(i).getTipo_do_servico()+ "__R$:"+ CafeDaManhalist.get(i).getValor_do_servico());
        }
    }
    
    public void mostrando_almoco(){
    System.out.println("MOSTRANDO TIPO DO SERVIÇO DE QUARTO: \n");
    for (int i = 0; i< Almocolist.size(); i++){
        System.out.println(i+1 + "º__"+Almocolist.get(i).getTipo_do_servico()+ "__R$:"+ Almocolist.get(i).getValor_do_servico());
        }
    }  
    
    public void mostrando_janta(){
    System.out.println("MOSTRANDO TIPO DO SERVIÇO DE QUARTO: \n");
    for (int i = 0; i< Jantalist.size(); i++){
        System.out.println(i+1 + "º__"+Jantalist.get(i).getTipo_do_servico()+ "__R$:"+ Jantalist.get(i).getValor_do_servico());
        }   
    }

    public void mostrando_servicobebidas(){
    System.out.println("MOSTRANDO TIPO DO SERVIÇO DE QUARTO: \n");
    for (int i = 0; i< Bebidaslist.size(); i++){
        System.out.println(i+1 + "º__"+Bebidaslist.get(i).getTipo_do_servico()+ "__R$:"+ Bebidaslist.get(i).getValor_do_servico());
        }
    }
    
    public void excluirCliente() {
    System.out.println("Qual Cliente você deseja excluir do cadastro? Digite o CPF:");
    String excluindoservico = input_do_servico.nextLine();
    ServicoDeQuarto servicoEncontrado = null;

    for (ServicoDeQuarto servicolimpeza : ServicoDeLimpezalist) {
        if (servicolimpeza.getTipo_do_servico().equalsIgnoreCase(excluindoservico)) {
            servicoEncontrado = servicolimpeza;
            break; 
        }
    }

    if (servicoEncontrado != null) {
        System.out.println("Procurando Cliente....");
        ServicoDeLimpezalist.remove(servicoEncontrado);
        System.out.println("O cliente foi excluído com sucesso.\n");
    } else {
        System.out.println("Cliente não encontrado. Tente novamente!\n");
        }
    
    }
    
}