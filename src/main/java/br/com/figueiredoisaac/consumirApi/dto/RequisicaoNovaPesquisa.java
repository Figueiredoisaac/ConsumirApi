package br.com.figueiredoisaac.consumirApi.dto;

import br.com.figueiredoisaac.consumirApi.model.Filme;

public class RequisicaoNovaPesquisa {

	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Filme toFilme() {
		Filme filme = new Filme();
		filme.setTitle(title);
		return filme;
	}
}
