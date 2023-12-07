package entidades;

public class MetodoDePagamento {

	private String tipo_do_pagamento;
	private String valor_do_pagamento;

	public MetodoDePagamento (String tipo_do_pagamento, String valor_do_pagamento) {

		this.tipo_do_pagamento = tipo_do_pagamento;
		this.valor_do_pagamento = valor_do_pagamento;
    }
	public String getTipo_do_pagamento() {
		return tipo_do_pagamento;
	}

	public void setTipo_do_pagamento(String tipo_do_pagamento) {
		this.tipo_do_pagamento = tipo_do_pagamento;
	}

	public String getValor_do_pagamento() {
		return valor_do_pagamento;
	}

	public void setValor_do_pagamento(String valor_do_pagamento) {
		this.valor_do_pagamento = valor_do_pagamento;
	}
}