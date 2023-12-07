package interfacess;

public class Teste implements Adicionando, Removendo {

    @Override
    public void adicionando01() {
        System.out.println("Cadastro realizado com sucesso!");
    }

    @Override
    public void removendo01() {
        System.out.println("Excluindo cadastro!");
    }
    
}