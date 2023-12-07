package entidades;

public class Cliente extends Pessoa {
    

    public Cliente(String nome, String cpf, String dataNasimento, String telefone, String email) {
        super(nome, cpf, dataNasimento, telefone, email);
        this.telefone = telefone;
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasimento = dataNasimento;
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
}