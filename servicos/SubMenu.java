package servicos;

import java.util.Scanner;

public class SubMenu {
    Scanner input_da_cliente = new Scanner(System.in);

    ClienteServico servicocliente = new ClienteServico(); 
    FuncionarioServico servicofuncionario = new FuncionarioServico();
    QuartoServico servicoquarto = new QuartoServico();
    ServicoDeQuartoServico servicodequarto = new ServicoDeQuartoServico();
    PagamentoServico servicopagamento = new PagamentoServico();
    ReservaServico servicoreserva = new ReservaServico();
    
    
    public void ver_e_add_cliente() {
        String cadastro_de_repeticao = "8";
        while (!cadastro_de_repeticao.equals("4")) {
            System.out.println("--------------------------HOTEL NANAI------------------------------------");
            System.out.println("[1] CADASTRAR ");
            System.out.println("[2] EXCLUIR "); 
            System.out.println("[3] MOSTRAR  ");
            System.out.println("[4] SAIR ");
            System.out.println("-------------------------------------------------------------------------");
            


            String variavel = input_da_cliente.nextLine();
            switch (variavel) {
                
                case "1":
                    System.out.println("\nInforme qual você quer cadatrar: ");
                    System.out.println("[1]CLIENTE\n"+ "[2]FUNCIONÁRIO\n"+ "[3]QUARTO\n" + "[4]SERVIÇO DE QUARTO\n"+"[5]METODO DE PAGAMENTO\n"+"[6]RESERVA\n"+ "[7]SAIR");
                    String tipo_de_cadastro = input_da_cliente.nextLine();
                    while (!tipo_de_cadastro.equals("7")) {
                        switch (tipo_de_cadastro) {
                            case "1":
                                servicocliente.cadastrar();
                                break;
                            case "2":
                                servicofuncionario.cadastrarFuncionario();
                                break;
                            case "3":
                            System.out.println("\nInforme qual você quer cadatrar: ");
                            System.out.println("[1]STANDART ---200\n"+ "[2]MASTER --400\n"+ "[3]MASTER SUPERIOR -- 600");
                            String caseadicionar = input_da_cliente.nextLine();
                            switch (caseadicionar) {
                                case "1":
                                    servicoquarto.adicionar_standart();
                                    break; 
                                case "2":
                                    servicoquarto.adicionando_master();                
                                    break;
                                case "3":
                                    servicoquarto.adicionando_mastersuperior();               
                                    break;
                            }
                            break;
                            case "4":
                            System.out.println("\nInforme qual você quer cadatrar: ");
                            System.out.println("[1]LIMPEZA ---200\n"+ "[2]CAFE DA MANHA --400\n"+ "[3]ALMOÇO -- 600"+
                            "[4]JANTA\n"+ "[5]BEBIDAS");
                            String casepagamento = input_da_cliente.nextLine();
                            switch (casepagamento) {
                                case "1":
                                    servicodequarto.adcionando_limpeza();
                                    break; 
                                case "2":
                                    servicodequarto.adicionando_cafeDaManha();                
                                    break;
                                case "3":
                                    servicodequarto.adicionando_almoco();              
                                    break;
                                case "4":
                                    servicodequarto.adcionando_janta();
                                case "5":
                                    servicodequarto.adcionando_bebidas();
                                }break;
                        case "5":
                            System.out.println("\nInforme qual você quer cadatrar: ");
                            System.out.println("[1]CREDITO\n"+ "[2]DEBITO\n"+ "[3]PIX\n"+
                            "[4]ESPECIE\n"+ "[5]CHEQUE");
                            String caseservico = input_da_cliente.nextLine();
                            switch (caseservico) {
                                case "1":
                                    servicopagamento.adcionando_credito();
                                    break; 
                                case "2":
                                    servicopagamento.adicionando_debito();                
                                    break;
                                case "3":
                                    servicopagamento.adicionando_pix();               
                                    break;
                                case "4":
                                    servicopagamento.adicionando_especie();
                                case "5":
                                    servicopagamento.adicionando_cheque();
                                }
                        case "6":
                                servicoreserva.cadastrarReserva();
                                break;
                    }
                        System.out.println("\nInforme qual você quer cadatrar: ");
                        System.out.println("[1]CLIENTE\n"+ "[2]FUNCIONÁRIO\n"+ "[3]QUARTO\n" + "[4]SERVIÇO DE QUARTO\n"+"[5]METODO DE PAGAMENTO\n"+"[6]RESERVA\n"+ "[7]SAIR" );
                        tipo_de_cadastro = input_da_cliente.nextLine();                       

                    }
                    break;
                case "2":

                    System.out.println("\nInforme qual você quer remover: ");
                    System.out.println("[1]CLIENTE\n"+ "[2]FUNCIONÁRIO\n"+ "[3]QUARTO\n" + "[4]RESERVA\n"+"[6]SAIR");
                    String caseexcluir = input_da_cliente.nextLine();
                    switch (caseexcluir) {
                        case "1":
                            servicocliente.removendo_cliente();  
                            break; 
                        case "2":
                            servicofuncionario.removendo_funcionario();                
                            break;
                        case "3":
                            System.out.println("\nInforme qual você quer remover: ");
                            System.out.println("[1]STANDAT \n"+ "[2]MASTER \n"+ "[3]MASTER SUPERIOR ");
                            String caseremover = input_da_cliente.nextLine();
                            switch (caseremover) {
                                case "1":
                                    servicoquarto.removendo_standart();
                                    break; 
                                case "2":
                                    servicoquarto.excluindo_master();                
                                    break;
                                case "3":
                                    servicoquarto.excluindo_mastersuperior();            
                                    break;
                        
                                }
                        case "4":
                            servicoreserva.removendo_Reserva();
                            break;
                    }
                    break;
                case "3":
                     System.out.println("\nInforme qual você quer mostar ");
                    System.out.println("[1]CLIENTE\n"+ "[2]FUNCIONÁRIO\n"+ "[3]QUARTO\n" + "[4]SERVIÇO DE QUARTO\n"+"[5]METODO DE PAGAMENTO\n"+"[6]RESERVA"+ "\n[7]SAIR");
                    String casemostar = input_da_cliente.nextLine();
                    switch (casemostar) {
                        case "1":
                        servicocliente.mostrando_cliente();  
                            break; 
                        case "2":
                            servicofuncionario.mostrando_funcionario();               
                            break;
                        case "3":
                            System.out.println("\nInforme qual você quer mostrar: ");
                            System.out.println("[1]STANDAT\n"+ "[2]MASTER\n"+ "[3]MASTER SUPERIOR");
                            String caseadicionar = input_da_cliente.nextLine();
                            switch (caseadicionar) {
                                case "1":
                                    servicoquarto.mostrando_standart();
                                    break; 
                                case "2":
                                    servicoquarto.mostrando_master();                
                                    break;
                                case "3":
                                    servicoquarto.mostrando_mastersuperior();                
                                    break;
                                }break;
                case "4":
                            System.out.println("\nInforme qual você quer mostar: ");
                            System.out.println("[1]LIMPEZA ---200\n"+ "[2]CAFE DA MANHA --400\n"+ "[3]ALMOÇO -- 600"+
                            "[4]JANTA\n"+ "[5]BEBIDAS");
                            String caseservico = input_da_cliente.nextLine();
                            switch (caseservico) {
                                case "1":
                                    servicodequarto.mostrando_limpeza();
                                    break; 
                                case "2":
                                    servicodequarto.mostrando_cafedamanha();                
                                    break;
                                case "3":
                                    servicodequarto.mostrando_almoco();;               
                                    break;
                                case "4":
                                    servicodequarto.mostrando_janta();
                                case "5":
                                    servicodequarto.mostrando_bebidas();
                        }break;
                case "5":
                        System.out.println("\nInforme qual você quer mostrar: ");
                            System.out.println("[1]CREDITO\n"+ "[2]DEBITO\n"+ "[3]PIX\n"+
                            "[4]ESPECIE\n"+ "[5]CHEQUE");
                            String mostrandopagamento = input_da_cliente.nextLine();
                            switch (mostrandopagamento) {
                                case "1":
                                    servicopagamento.mostrando_credito();
                                    break; 
                                case "2":
                                    servicopagamento.mostrando_debito();                
                                    break;
                                case "3":
                                    servicopagamento.mostrando_pix();               
                                    break;
                                case "4":
                                    servicopagamento.mostrando_especie();
                                case "5":
                                    servicopagamento.mostrando_cheque();
                        }
                case "6": 
                        servicoreserva.mostrando_reserva();
                case "7":
                    cadastro_de_repeticao = variavel;
                    
                }
            case "4":
                cadastro_de_repeticao = variavel;
                break;
            }
        }

    }

}