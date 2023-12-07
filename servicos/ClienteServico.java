package servicos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import entidades.Cliente;
import interfacess.Teste;
import repositorio.ClienteRepositorio;


public class ClienteServico {

    Scanner inputcliente = new Scanner(System.in);
    ClienteRepositorio repositoriocliente = new ClienteRepositorio();
    Teste teste01 = new Teste();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public void cadastrar() {
        System.out.println("Digite o nome do Cliente: ");
        String nomeb = inputcliente.nextLine();

        
        while (true) {
            System.out.println("Digite o CPF do cliente: ");
            String cpfb = inputcliente.nextLine();
            System.out.println("Digite o email do Cliente: ");
            String emailb = inputcliente.nextLine();
            System.out.println("Digite o telefone do Cliente: ");
            String telefoneb = inputcliente.nextLine();

            if (!verificarCadastro(cpfb, emailb, telefoneb)) {
                System.out.println("Digite a Data de Nascimento do Cliente (formato dd/MM/yyyy): ");
                String dataNasimentob = inputcliente.nextLine();

                try {
                    Date dataNascimento = dateFormat.parse(dataNasimentob);
                    if (idadeCliente(dataNascimento) < 18) {
                        System.out.println("Cliente menor de idade.Tente novamente!");
                        break;
                    }

                    repositoriocliente.salvar(new Cliente(nomeb, cpfb, dataNasimentob, emailb, telefoneb));
                    teste01.adicionando01();
                    break; 
                } catch (ParseException e) {
                    System.out.println("Formato de data inválido. Tente novamente.");
                }
            }
        }
    }

    public void mostrando_cliente() {
        repositoriocliente.mostrando_cliente();
    }

    public void removendo_cliente() {
        repositoriocliente.excluirCliente();
    }

    public void ver_e_add_comida() {
        
    }

    private boolean verificarCadastro(String cpf, String email, String telefone) {
        if (repositoriocliente.verificarCliente(cpf)) {
            System.out.println("Este CPF já foi cadastrado. Tente novamente.");
            return true;
        }

        if (repositoriocliente.verificarClientePorEmail(email)) {
            System.out.println("Este e-mail já foi cadastrado. Tente novamente.");
            return true;
        }

        if (repositoriocliente.verificarClientePorTelefone(telefone)) {
            System.out.println("Este telefone já foi cadastrado. Tente novamente.");
            return true;
        }

        return false;
    }

    private int idadeCliente(Date dataNascimento) {
        Calendar dataNascimentoCal = Calendar.getInstance();
        dataNascimentoCal.setTime(dataNascimento);
        Calendar hoje = Calendar.getInstance();
        int idade = hoje.get(Calendar.YEAR) - dataNascimentoCal.get(Calendar.YEAR);

        if (hoje.get(Calendar.DAY_OF_YEAR) < dataNascimentoCal.get(Calendar.DAY_OF_YEAR)) {
            idade--;
        }

        return idade;
    }
}