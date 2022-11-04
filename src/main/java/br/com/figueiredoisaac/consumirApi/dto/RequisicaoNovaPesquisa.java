package br.com.figueiredoisaac.consumirApi.dto;

import javax.validation.constraints.NotBlank;

import br.com.figueiredoisaac.consumirApi.model.Filme;

public class RequisicaoNovaPesquisa {

	@NotBlank
	private int rank;


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public Filme toFilme() {
		Filme filme = new Filme();
		filme.setRank(rank);
		return filme;
	}
}
