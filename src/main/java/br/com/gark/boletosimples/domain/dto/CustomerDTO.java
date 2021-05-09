package br.com.gark.boletosimples.domain.dto;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class CustomerDTO {

	@JsonProperty("id")
	private Long id;

	@JsonProperty("person_type")
	private String personType;

	@NotNull
	@JsonProperty("person_name")
	private String personName;

	@NotNull
	@JsonProperty("cnpj_cpf")
	private String cpfCnpj;

	@NotNull
	@JsonProperty("address")
	private String address;

	@NotNull
	@JsonProperty("city_name")
	private String cityName;

	@NotNull
	@JsonProperty("state")
	private String state;

	@NotNull
	@JsonProperty("neighborhood")
	private String neighborhood;

	@NotNull
	@JsonProperty("zipcode")
	private String zipcode;

	@JsonProperty("address_number")
	private String addressNumber;

	@JsonProperty("address_complement")
	private String addressComplement;

	@JsonProperty("phone_number")
	private String phoneNumber;

	@JsonProperty("email")
	private String email;

	@JsonProperty("mobile_local_code")
	private String mobileLocalCode;

	@JsonProperty("mobile_number")
	private String mobileNumber;

}
