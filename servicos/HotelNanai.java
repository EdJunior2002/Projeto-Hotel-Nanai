package servicos;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class HotelNanai {
    
    public static void main(String[] args) {
        try (Scanner input_do_menu = new Scanner(System.in)) {
            int repeticao = 1;
            while (repeticao < 2 ){
                JOptionPane.showMessageDialog(null, "-----------------------------------\nSEJA BEM VINDO(A) AO HOTEL NANAI\n-----------------------------------");
                String menu = "[1] HOTEL NANAI\n[2] CADASTRO   |  CONSULTAS  |  RESERVA  |  EXCLUIR\n>";
                
                String entrada = JOptionPane.showInputDialog(menu);

                if (entrada == null) {
                    break;
                }

                int forma_de_cadastro = Integer.parseInt(entrada);
                JOptionPane.showMessageDialog(null, "\n\n");

                switch (forma_de_cadastro){
                    case 1:
                        HotelNanaiExemplo exemplo = new HotelNanaiExemplo();
                        exemplo.ver_Hotel_Nanai();
                        break;

                    case 2:
                        SubMenu clienteservicoteste = new SubMenu();
                        clienteservicoteste.ver_e_add_cliente();
                        break;
                }
            }
        }
    }
}