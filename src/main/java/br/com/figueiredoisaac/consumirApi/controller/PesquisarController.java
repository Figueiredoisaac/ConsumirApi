package br.com.figueiredoisaac.consumirApi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.figueiredoisaac.consumirApi.dto.RequisicaoNovaPesquisa;
import br.com.figueiredoisaac.consumirApi.model.Filme;
import br.com.figueiredoisaac.consumirApi.repository.FilmeRepository;

@Controller
@RequestMapping("pesquisar")
public class PesquisarController {
	
	@Autowired
	private FilmeRepository filmeRepository;
	
	@GetMapping("form")
	public String buscaFilme() {
		return "pesquisar/form";
	}
	
	@PostMapping("resultado")
	public String resultadoPesquisa(RequisicaoNovaPesquisa requisicaoNovaPesquisa, Model model) {
		
		
		Filme filme = requisicaoNovaPesquisa.toFilme();
		List<Filme> filmes = filmeRepository.findByRank(filme.getRank());
		if(filmes.isEmpty()) {
			Filme naoEncontrao = new Filme(0,"Não Encontrado","Tente outro Filme");
			filmes.add(naoEncontrao);
		}
			
		model.addAttribute("filme",filmes);
		
		return "pesquisar/resultado"; 
	}
}