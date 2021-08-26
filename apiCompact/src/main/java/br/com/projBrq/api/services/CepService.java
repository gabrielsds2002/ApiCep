package br.com.projBrq.api.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import br.com.projBrq.api.domain.AcessoRequest;
import br.com.projBrq.api.domain.AcessoResponse;

@Service
public class CepService {
	private String urlCep = "https://viacep.com.br/ws/";
	private String opcoes = "/json";

	public AcessoResponse obterAcessoResponse(AcessoRequest request) {
		return new AcessoResponse();
	}

	public AcessoResponse obterDadosAcessoResponse(String acesso) {

		try {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder(URI.create(urlCep + acesso + opcoes)).build();
			CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, BodyHandlers.ofString());
			String rawResult = response.get().body().toString();
			return new Gson().fromJson(rawResult, AcessoResponse.class);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
}