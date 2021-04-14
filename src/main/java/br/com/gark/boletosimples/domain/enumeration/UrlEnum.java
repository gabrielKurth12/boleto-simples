package br.com.gark.boletosimples.domain.enumeration;

public enum UrlEnum {

	URL_TESTE("https://sandbox.boletosimples.com.br"), //
	URL_PRODUCAO("https://boletosimples.com.br");

	private final String url;
	
	UrlEnum(String url) {
		this.url = url;
	}
	
	public String getUrl() {
		return this.url;
	}

}
