package br.com.gark.boletosimples.domain.dto;

import java.io.Serializable;

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
public class BankBilletDTOWrapper implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("bank_billet")
	BankBilletDTO bankBillet;

}