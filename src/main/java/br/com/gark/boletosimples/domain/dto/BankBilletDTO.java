package br.com.gark.boletosimples.domain.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class BankBilletDTO {

	@JsonProperty("id")
	private Long id;

	@JsonProperty("amount")
	private BigDecimal amount;

	@JsonProperty("paid_amount")
	private BigDecimal paidAmount;

	@JsonProperty("expire_at")
	private String expireDate;

	@JsonProperty("paid_at")
	private String paidDate;

	@JsonProperty("description")
	private String description;

	@JsonProperty("status")
	private String status;

	@JsonProperty("shorten_url")
	private String shortenUrl;

	@JsonProperty("our_number")
	private String ourNumber;

	@JsonProperty("customer_person_name")
	private String customerPersonName;

	@JsonProperty("customer_cnpj_cpf")
	private String customerCnpjCpf;

	@JsonProperty("customer_email")
	private String customerEmail;

	@JsonProperty("customer_address")
	private String customerAddress;

	@JsonProperty("customer_city_name")
	private String customerCityName;

	@JsonProperty("customer_state")
	private String customerState;

	@JsonProperty("customer_neighborhood")
	private String customerNeighborhood;

	@JsonProperty("customer_zipcode")
	private String customerZipcode;

	@JsonProperty("customer_address_number")
	private String customerAddressNumber;

	@JsonProperty("customer_address_complement")
	private String customerAddressComplement;

	@JsonProperty("customer_phone_number")
	private String customerPhoneNumber;

	@JsonProperty("customer_id")
	private String customerId;

	@JsonProperty("notification_url")
	private String notificationUrl;

	@JsonProperty("send_email_on_creation")
	private Boolean sendEmialOnCreation;

	@JsonProperty("bank_billet_account_id")
	private String bankBilletAccountId;

}