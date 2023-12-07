package repositorio;
import java.util.ArrayList;
import entidades.Cliente;
import interfacess.Teste;

import java.util.Scanner;

public class ClienteRepositorio {
    private ArrayList <Cliente> clientelist = new ArrayList<>();
    private Scanner input_do_cliente = new Scanner(System.in);
    Teste teste01 = new Teste();


    

    public void salvar(Cliente cliente) {
        clientelist.add(cliente);

    }


    public void mostrando_cliente() {
        System.out.println("Mostrando Cliente\n");
        for (int i = 0; i < clientelist.size(); i++) {
            System.out.println(
                    i + 1 + "°: " + clientelist.get(i).getNome() + "\nCPF: " + clientelist.get(i).getCpf() + "\nData: " +
                            clientelist.get(i).getDataNasimento() + "\nTelefone: " + clientelist.get(i).getTelefone()
                            + "\nEmail: " + clientelist.get(i).getEmail());
        }
    }


    public void excluirCliente() {
    System.out.println("Qual Cliente você deseja excluir do cadastro? Digite o CPF:");
    String excluindoCliente = input_do_cliente.nextLine();
    Cliente clienteEncontrado = null;

    for (Cliente cliente : clientelist) {
        if (cliente.getCpf().equalsIgnoreCase(excluindoCliente)) {
            clienteEncontrado = cliente;
            break; 
        }
    }

    if (clienteEncontrado != null) {
        System.out.println("Procurando Cliente....\n");
        clientelist.remove(clienteEncontrado);
        teste01.removendo01();
    } else {
        System.out.println("Cliente não encontrado. Tente novamente!\n");
    }
    
    }
    public boolean verificarCliente(String cpf) {
        for (Cliente cliente : clientelist) {
            if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                return true; 
            }
        }
        return false; 
    }
    public boolean verificarClientePorEmail(String email) {
        for (Cliente cliente : clientelist) {
            if (cliente.getEmail().equalsIgnoreCase(email)) {
                return true; 
            }
        }
        return false; 
    }
    public boolean verificarClientePorTelefone(String telefone) {
        for (Cliente cliente : clientelist) {
            if (cliente.getTelefone().equalsIgnoreCase(telefone)) {
                return true; 
            }
        }
        return false; 
    }


    public String getataNascimento(String cpf) {
        return null;
    }


    public String getDataNascimento(String cpf) {
        return null;
    }


    public String getEmail(String cpf) {
        return null;
    }


    public String getTelefone(String cpf) {
        return null;
    }
}
