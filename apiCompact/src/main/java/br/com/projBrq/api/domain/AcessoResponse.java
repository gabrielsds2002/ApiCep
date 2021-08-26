package br.com.projBrq.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AcessoResponse {
	
	private String cep;
	private String 	logradouro;
	private String localidade;
	private String complemento;
	private String bairro;
	

}
