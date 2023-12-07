package entidades;

public class ServicoDeQuarto {

	private String tipo_do_servico;
	private String valor_do_servico;

	public ServicoDeQuarto(String tipo_do_servico, String valor_do_servico) {

		this.tipo_do_servico = tipo_do_servico;
		this.valor_do_servico = valor_do_servico;
	}

	public String getTipo_do_servico() {
		return tipo_do_servico;
	}

	public void setTipo_do_servico(String tipo_do_servico) {
		this.tipo_do_servico = tipo_do_servico;
	}

	public String getValor_do_servico() {
		return valor_do_servico;
	}

	public void setValor_do_servico(String valor_do_servico) {
		this.valor_do_servico = valor_do_servico;
	}

}