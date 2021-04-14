package br.com.gark.boletosimples.domain.wrapper;
import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.gark.boletosimples.domain.entity.Boleto;

public class BoletoWrapper implements Serializable {

	private static final long serialVersionUID = 1L;

	@SerializedName("bank_billet")
	Boleto boleto;

	public BoletoWrapper(Boleto boleto) {
		super();
		this.boleto = boleto;
	}

	public Boleto getBoleto() {
		return boleto;
	}

	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
}