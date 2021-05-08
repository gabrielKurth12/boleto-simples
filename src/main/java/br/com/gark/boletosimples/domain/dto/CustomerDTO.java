package br.com.gark.boletosimples.domain.dto;

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
	Long id;

	@JsonProperty("person_type")
	String personType;

	@JsonProperty("person_name")
	String personName;

	@JsonProperty("cnpj_cpf")
	String cpfCnpj;

	@JsonProperty("address")
	String address;

	@JsonProperty("state")
	String state;

	@JsonProperty("neighborhood")
	String neighborhood;

	@JsonProperty("zipcode")
	String zipcode;

	@JsonProperty("address_number")
	String addressNumber;

	@JsonProperty("address_complement")
	String addressComplement;

	@JsonProperty("phone_number")
	String phoneNumber;

	@JsonProperty("email")
	String email;

	@JsonProperty("mobile_local_code")
	String mobileLocalCode;

	@JsonProperty("mobile_number")
	String mobileNumber;

	@JsonProperty("city_name")
	String cityName;

}
