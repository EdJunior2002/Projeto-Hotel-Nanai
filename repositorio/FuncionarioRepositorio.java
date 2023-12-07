package repositorio;
import java.util.ArrayList;


import entidades.Funcionario;
import java.util.Scanner;

public class FuncionarioRepositorio {
    private ArrayList <Funcionario> funcionariolist = new ArrayList<>();
    private Scanner input_do_funcionario = new Scanner (System.in);

    public void salvar (Funcionario funcionario) {
        funcionariolist.add(funcionario); 
    }



public void mostrando_funcionario() {
        System.out.println("Mostrando funcionário: ");
        for (int i = 0; i < funcionariolist.size(); i++) {
            System.out.println(
                    i + 1 + " °: " + funcionariolist.get(i).getNome() + "\nCPF: " + funcionariolist.get(i).getCpf() + "\nData: " +
                            funcionariolist.get(i).getDataNasimento() + "\nCargo: " + funcionariolist.get(i).getCargo()
                            + "\nTurno: " + funcionariolist.get(i).getTurno());
        }
    }

    public void excluirFuncionario() {
    System.out.println("Qual funcionario você deseja excluir do cadastro? Digite o CPF:");
    String excluindoFuncionario = input_do_funcionario.nextLine();
    Funcionario funcionarioEncontrado = null;

    for (Funcionario funcionario : funcionariolist) {
        if (funcionario.getCpf().equalsIgnoreCase(excluindoFuncionario)) {
            funcionarioEncontrado = funcionario;
            break; 
        }
    }

    if (funcionarioEncontrado != null) {
        System.out.println("Procurando funcionario....");
        funcionariolist.remove(funcionarioEncontrado);
        System.out.println("O funcionario foi excluído com sucesso.\n");
    } else {
        System.out.println("Funcionario não encontrado. Tente novamente!\n");
    }

    }

    public boolean verificarFuncionario(String cpf) {
    for (Funcionario funcionario : funcionariolist) {
        if (funcionario.getCpf().equalsIgnoreCase(cpf)) {
            return true;
        }
    }
        return false; 
    }
    
}

