package br.com.projBrq.api.domain;

import lombok.Getter;
import lombok.Setter;


  // classe de entrada o que entra 
@Getter
@Setter
public class AcessoRequest {
	
	private String cep;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	
	
	

}
