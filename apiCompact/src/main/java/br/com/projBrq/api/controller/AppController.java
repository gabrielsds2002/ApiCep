package br.com.projBrq.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projBrq.api.domain.AcessoRequest;
import br.com.projBrq.api.domain.AcessoResponse;
import br.com.projBrq.api.services.CepService;

@RestController
@RequestMapping("/cep")

public class AppController {
	
	@Autowired
	
	private CepService cepService;
	
	
	@PostMapping
	public ResponseEntity<Object> buscaCep(@RequestBody AcessoRequest request) {
		
		AcessoResponse response = cepService.obterDadosAcessoResponse(request.getCep());
		
		//response.setEndereco("abc");
		
		ResponseEntity<Object> result = new ResponseEntity<Object>(response, HttpStatus.OK);                                   // criando um objt que vai retornar null
		return result;                                                          // retorno do result. 

	}

}
