package servicos;

import java.util.Scanner;
import entidades.Funcionario;
import repositorio.FuncionarioRepositorio;

public class FuncionarioServico {  

	Scanner inputfuncionario = new Scanner(System.in);
	FuncionarioRepositorio repositorfuncionario = new FuncionarioRepositorio();

	public void cadastrarFuncionario() {

		System.out.println("Digite o nome do funcionário: ");
		String nomeb = inputfuncionario.nextLine();
		while (true) {
            System.out.println("Digite o CPF do funcionário: ");
            String cpfb = inputfuncionario.nextLine();

            
            if (!repositorfuncionario.verificarFuncionario(cpfb) ) {
                System.out.println("Digite a Data de Nascimento do funcionário (formato dd/MM/yyyy): ");
                String dataNasimentob = inputfuncionario.nextLine();
                System.out.println("Digite o email do funcionário: ");
                String emailb = inputfuncionario.nextLine();
                System.out.println("Digite o telefone do funcionário: ");
                String telefoneb = inputfuncionario.nextLine();

                repositorfuncionario.salvar(new Funcionario(nomeb, cpfb, dataNasimentob, emailb, telefoneb));
                System.out.println("Cadastro realizado com sucesso!");
                break; 
            } else {
                System.out.println("Este CPF já foi cadastrado. Tente novamente.");
				break;
            }
        }
    }

	public void mostrando_funcionario() {
		repositorfuncionario.mostrando_funcionario();
	}

	public void removendo_funcionario() {
		repositorfuncionario.excluirFuncionario();
	}

    public void ver_e_add_funcionario() {
    }

}