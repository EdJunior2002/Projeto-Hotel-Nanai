package entidades;

public class Funcionario extends Pessoa {

    private String cargo;
    private String turno;
  
    public Funcionario(String nome, String cpf, String dataNasimento, String turno, String cargo) {
        super(nome, cpf, dataNasimento, turno, cargo);
        
        this.cargo = cargo;
        this.turno = turno;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasimento = dataNasimento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
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