package repositorio;

import java.util.ArrayList;
import entidades.Reserva;
import java.util.Scanner;

public class ReservaRepositorio {
    
    private ArrayList <Reserva> reservalist = new ArrayList<>();
    private Scanner input_do_reserva = new Scanner(System.in);
    


    

    public void salvar(Reserva reserva) {
        reservalist.add(reserva);

    }


    public void mostrando_reserva() {
        System.out.println("Mostrando reserva\n");
        for (int i = 0; i < reservalist.size(); i++) {
            System.out.println(
                    i + 1 + "°: " + reservalist.get(i).getNome() + "\nCPF: " + reservalist.get(i).getCpf() + "\nData: " +
                            reservalist.get(i).getDataNasimento() + "\nTelefone: " +reservalist.get(i).getTelefone()
                            + "\nEmail: " + reservalist.get(i).getEmail()+ "\nData inicio:"+ reservalist.get(i).getDataInicio()+ "\nData Final: "+"\nTipo de quarto:"+reservalist.get(i).getTipoDeQuarto()+"\nMetodo e pagamento:"+ reservalist.get(i).getMetodoDePagamento());
        }
    }


    public void excluirReserva() {
    System.out.println("Qual Cliente você deseja excluir do cadastro? Digite o CPF:");
    String excluindoCliente = input_do_reserva.nextLine();
    Reserva clienteEncontrado = null;

    for (Reserva reserva : reservalist) {
        if (reserva.getCpf().equalsIgnoreCase(excluindoCliente)) {
            clienteEncontrado = reserva;
            break; 
        }
    }

    if (clienteEncontrado != null) {
        System.out.println("Procurando Cliente....");
        reservalist.remove(clienteEncontrado);
        System.out.println("O cliente foi excluído com sucesso.\n");
    } else {
        System.out.println("Cliente não encontrado. Tente novamente!\n");
    }
    
    }
    public boolean verificarReserva(String cpf) {
        for (Reserva reserva : reservalist) {
            if (reserva.getCpf().equalsIgnoreCase(cpf)) {
                return true;
            }
        }
        return false; 
    }
    
    public boolean verificarReservaPorEmail(String email) {
        for (Reserva reserva : reservalist) {
            if (reserva.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false; 
    }
    public boolean verificarReservaPorTelefone(String telefone) {
        for (Reserva reserva : reservalist) {
            if (reserva.getTelefone().equalsIgnoreCase(telefone)) {
                return true; 
            }
        }
        return false; 
    }
}