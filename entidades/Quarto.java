package entidades;

public class Quarto {

	private String tipo_do_quarto;
	private String valor_do_quarto;

	public Quarto(String tipo_do_quarto, String valor_do_quarto) {

		this.tipo_do_quarto = tipo_do_quarto;
		this.valor_do_quarto = valor_do_quarto;
	}

	public String getTipo_do_quarto() {
		return tipo_do_quarto;
	}

	public void setTipo_do_quarto(String tipo_do_quarto) {
		this.tipo_do_quarto = tipo_do_quarto;
	}

	public String getValor_do_quarto() {
		return valor_do_quarto;
	}

	public void setValor_do_Quarto(String valor_do_quarto) {
		this.valor_do_quarto = valor_do_quarto;
	}

}