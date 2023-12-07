package servicos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import entidades.Reserva;
import repositorio.ReservaRepositorio;

public class ReservaServico {

    Scanner inputreserva = new Scanner(System.in);
    ReservaRepositorio repositorioreserva = new ReservaRepositorio();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public void cadastrarReserva() {
        System.out.println("Digite o nome do Cliente: ");
        String nome = inputreserva.nextLine();

        
        while (true) {
            System.out.println("Digite o CPF do cliente: ");
            String cpf = inputreserva.nextLine();
            System.out.println("Digite o email do Cliente: ");
            String email = inputreserva.nextLine();
            System.out.println("Digite o telefone do Cliente: ");
            String telefone = inputreserva.nextLine();
            System.out.println("Informe a data inicio:");
            String inicio = inputreserva.nextLine();
            System.out.println("Informe a data final:");
            String Final = inputreserva.nextLine();
            System.out.println("Informe o tipo de quarto: \n[1]STANDAT \n"+ "[2]MASTER \n"+ "[3]MASTER SUPERIOR ");
            String tipoDeQuarto = inputreserva.nextLine();
            System.out.println("Informe o metodo de pagamento: \n[1]Credito"+"\n[2]Debito"+ "\n[3]Pix"+"\n[4]Especie"+
            "\n[5]Cheque");
            String tipoDePagamento = inputreserva.nextLine();

            if (!verificarCadastro(cpf, email, telefone)) {
                System.out.println("Digite a Data de Nascimento do Cliente (formato dd/MM/yyyy): ");
                String dataNasimentob = inputreserva.nextLine();

                try {
                    Date dataNascimento = dateFormat.parse(dataNasimentob);
                    if (idadeCliente(dataNascimento) < 18) {
                        System.out.println("Cliente menor de idade.Tente novamente!");
                        break;
                    }

                    repositorioreserva.salvar(new Reserva(nome, cpf, dataNasimentob, email, telefone,inicio,Final,tipoDeQuarto,tipoDePagamento));
                    System.out.println("Cadastro realizado com sucesso!");
                    break; 
                } catch (ParseException e) {
                    System.out.println("Formato de data inválido. Tente novamente.");
                }
            }
        }
    }

    public void mostrando_reserva() {
        repositorioreserva.mostrando_reserva();
    }

    public void removendo_Reserva() {
        repositorioreserva.excluirReserva();
    }

    public void ver_e_add_comida() {
        
    }

    private boolean verificarCadastro(String cpf, String email, String telefone) {
        if (repositorioreserva.verificarReserva(cpf)) {
            System.out.println("Este CPF já foi cadastrado. Tente novamente.");
            return true;
            
        }

        if (repositorioreserva.verificarReservaPorEmail(email)) {
            System.out.println("Este e-mail já foi cadastrado. Tente novamente.");
            return true;
        }

        if (repositorioreserva.verificarReservaPorTelefone(telefone)) {
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

