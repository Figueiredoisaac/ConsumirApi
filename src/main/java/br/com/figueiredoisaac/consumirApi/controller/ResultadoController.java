package br.com.figueiredoisaac.consumirApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.figueiredoisaac.consumirApi.model.Filme;
import br.com.figueiredoisaac.consumirApi.repository.FilmeRepository;

@Controller
public class ResultadoController {


		
//	@GetMapping("/resultado")
//	public String resultado(Model model) {
////		Filme pesquisa = (Filme) model.getAttribute("title");
//		List<Filme> filme = filmeRepository.findByTitle("teste"); 
//		model.addAttribute("filme", filme);
//		
//	return "/resultado";
//	
// }
}