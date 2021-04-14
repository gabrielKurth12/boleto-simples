package br.com.gark.boletosimples.domain.enumeration;

public enum MethodEnum {

//	BANK_BILLET_ACCOUNT("/api/v1/bank_billet_accounts"), //
//	BANK_BILLETS("/api/v1/bank_billets"), //
	CUSTOMERS("/api/v1/customers"), //
	SET_DEFAULT("/set_default");
	
	private final String method;

	MethodEnum(String method) {
		this.method = method;
	}
	
	public String getMethod() {
		return this.method;
	}

}
