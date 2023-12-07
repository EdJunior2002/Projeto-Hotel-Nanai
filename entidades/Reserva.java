package entidades;

public class Reserva extends Pessoa {

    private String data_inicio;
    private String data_final;
    private String tipoDeQuarto;
    private String MetodoDePagamento;

    public Reserva(String nome, String cpf, String dataNasimento, String telefone, String email, String data_inicio,String data_final,String tipoDeQuarto,String MetodoDePagamento) {
        super(nome, cpf, dataNasimento, telefone, email);
        this.telefone = telefone;
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasimento = dataNasimento;
        this.data_inicio = data_inicio;
        this.data_final = data_final;
        this.tipoDeQuarto =tipoDeQuarto;
        this.MetodoDePagamento = MetodoDePagamento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasimento() {
        return dataNasimento;
    }

    public void setDataNasimento(String dataNascimento) {
        this.dataNasimento = dataNascimento;
    }
    public String getDataInicio() {
        return data_inicio;
    }

    public void setDataInicio(String dataInicio) {
        this.data_inicio = dataInicio;
    }
    public String getDataFinal() {
        return data_final;
    }

    public void setDataFinal(String dataFinal) {
        this.data_final = dataFinal;
    }
    public String getTipoDeQuarto() {
        return tipoDeQuarto;
    }

    public void setTipoDeQuarto(String tipodequarto) {
        this.tipoDeQuarto = tipodequarto;
    }
    public String getMetodoDePagamento() {
        return MetodoDePagamento;
    }

    public void setMetodoDePagameto(String mdpagamento) {
        this.MetodoDePagamento = mdpagamento;
    }
}