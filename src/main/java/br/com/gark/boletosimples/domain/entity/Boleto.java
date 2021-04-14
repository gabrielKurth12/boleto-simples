package br.com.gark.boletosimples.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Boleto implements Serializable {

	private static final long serialVersionUID = 1L;

	@SerializedName("id")
	Long idBoleto;

	@SerializedName("amount")
	BigDecimal valor;

	@SerializedName("paid_amount")
	BigDecimal valorPago;

	@SerializedName("expire_at")
	String dataVencimento;

	@SerializedName("paid_at")
	String dataPagamento;

	@SerializedName("description")
	String descricao;

	@SerializedName("status")
	String situacao;

	@SerializedName("shorten_url")
	String urlBoleto;

	@SerializedName("our_number")
	String nossoNumero;

	@SerializedName("customer_person_type")
	String tipoCliente;

	@SerializedName("customer_person_name")
	String nomeCliente;

	@SerializedName("customer_cnpj_cpf")
	String cpfCnpjCliente;

	@SerializedName("customer_email")
	String emailCliente;

	@SerializedName("customer_address")
	String enderecoCliente;

	@SerializedName("customer_city_name")
	String cidadeCliente;

	@SerializedName("customer_state")
	String ufCliente;

	@SerializedName("customer_neighborhood")
	String bairroCliente;

	@SerializedName("customer_zipcode")
	String cepCliente;

	@SerializedName("customer_address_number")
	String numeroCliente;

	@SerializedName("customer_address_complement")
	String complementoCliente;

	@SerializedName("customer_phone_number")
	String telefoneCliente;

	@SerializedName("customer_id")
	String idCliente;

	@SerializedName("notification_url")
	String urlNotificacao;

	@SerializedName("send_email_on_creation")
	Boolean enviaEmail;

	@SerializedName("created_via_api")
	Boolean incluidoIntegracao;

	@SerializedName("bank_billet_account_id")
	String carteira;

//	public Boleto(BigDecimal valor, String dataVencimento, String descricao, String idCliente, String urlNotificacao) {
//		super();
//		this.valor = valor;
//		this.dataVencimento = dataVencimento;
//		this.descricao = descricao;
//		this.idCliente = idCliente;
//		this.urlNotificacao = urlNotificacao;
//	}
//
//	public Boleto(BigDecimal valor, String dataVencimento, String descricao, String nomeCliente, String cpfCnpjCliente,
//			String emailCliente, String urlNotificacao, String carteira) {
//		super();
//		this.valor = valor;
//		this.dataVencimento = dataVencimento;
//		this.descricao = descricao;
//		this.nomeCliente = nomeCliente;
//		this.cpfCnpjCliente = cpfCnpjCliente;
//		this.emailCliente = emailCliente;
//		this.urlNotificacao = urlNotificacao;
//		this.carteira = carteira;
//	}
//
//	public Boleto(BigDecimal valor, String dataVencimento, String descricao, String nomeCliente, String cpfCnpjCliente,
//			String emailCliente, String enderecoCliente, String cidadeCliente, String ufCliente, String bairroCliente,
//			String cepCliente, String numeroCliente, String complementoCliente, String telefoneCliente,
//			String idCliente, String urlNotificacao, Boolean enviaEmail) {
//		super();
//		this.valor = valor;
//		this.dataVencimento = dataVencimento;
//		this.descricao = descricao;
//		this.nomeCliente = nomeCliente;
//		this.cpfCnpjCliente = cpfCnpjCliente;
//		this.emailCliente = emailCliente;
//		this.enderecoCliente = enderecoCliente;
//		this.cidadeCliente = cidadeCliente;
//		this.ufCliente = ufCliente;
//		this.bairroCliente = bairroCliente;
//		this.cepCliente = cepCliente;
//		this.numeroCliente = numeroCliente;
//		this.complementoCliente = complementoCliente;
//		this.telefoneCliente = telefoneCliente;
//		this.idCliente = idCliente;
//		this.urlNotificacao = urlNotificacao;
//		this.enviaEmail = enviaEmail;
//	}

}