package repositorio;

import java.util.ArrayList;
import entidades.MetodoDePagamento;


public class PagamentoRepositorio {
    

    ArrayList<MetodoDePagamento> creditolist  = new ArrayList<>();
    ArrayList<MetodoDePagamento> debitolist = new ArrayList<>();
    ArrayList<MetodoDePagamento> pixlist = new ArrayList<>();
    ArrayList<MetodoDePagamento> especielist = new ArrayList<>();
    ArrayList<MetodoDePagamento> chequelist = new ArrayList<>();
    

    public void salvarcredito(MetodoDePagamento pagamentocredito) {
        creditolist.add(pagamentocredito);
    }

    public void salvardebito(MetodoDePagamento pagamentodebito) {
        debitolist.add(pagamentodebito);
    }

    public void salvarpix(MetodoDePagamento pagamentopix) {
        pixlist.add(pagamentopix);
    }

    public void salvarespecie(MetodoDePagamento pagamentoespecie) {
        especielist.add(pagamentoespecie);
    }

    public void salvarcheque(MetodoDePagamento pagamentocheque) {
        chequelist.add(pagamentocheque);
    }
    
    public void mostrando_credito() {
        System.out.println("MOSTRANDO TIPO DE PAGAMENTO (credito): ");
        for (int i = 0; i < creditolist.size(); i++) {
            System.out.println(i + 1 + "º: " + creditolist.get(i).getTipo_do_pagamento() + "\nR$:"
                    + creditolist.get(i).getValor_do_pagamento());
        }
    }

public void mostrando_debito(){
    System.out.println("MOSTRANDO TIPO DE PAGAMENTO (debito)");
    for (int i = 0; i< debitolist.size(); i++){
        System.out.println(i + 1 + "º: " + debitolist.get(i).getTipo_do_pagamento() + "\nR$:"
                    + debitolist.get(i).getValor_do_pagamento());
    }
}

    public void mostrando_pix() {
        System.out.println("MOSTRANDO TIPO DE PAGAMENTO (pix)");
        for (int i = 0; i < pixlist.size(); i++) {
           System.out.println(i + 1 + "º: " + pixlist.get(i).getTipo_do_pagamento() + "\nR$:"
                    + pixlist.get(i).getValor_do_pagamento());
        }
    }

   public void mostrando_especie() {
        System.out.println("MOSTRANDO TIPO DE PAGAMENTO (espécie)");
        for (int i = 0; i < especielist.size(); i++) {
           System.out.println(i + 1 + "º: " + especielist.get(i).getTipo_do_pagamento() + "\nR$:"
                    + especielist.get(i).getValor_do_pagamento());
        }
    }

       public void mostrando_cheque() {
        System.out.println("MOSTRANDO TIPO DE PAGAMENTO (cheque)");
        for (int i = 0; i < chequelist.size(); i++) {
       System.out.println(i + 1 + "º: " + chequelist.get(i).getTipo_do_pagamento() + "\nR$:"
                    + chequelist.get(i).getValor_do_pagamento());
        }
    }
}