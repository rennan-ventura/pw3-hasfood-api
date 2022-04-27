package br.com.rennan.rentura.hasfood.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rennan.rentura.hasfood.Repository.TipoCozinhaRepository;
import br.com.rennan.rentura.hasfood.entity.TipoCozinha;

@RestController
@RequestMapping("/tipos-cozinha")
public class TipoCozinhaController {
	
	
	@Autowired
	private TipoCozinhaRepository repository;
	List<TipoCozinha> tipo = new ArrayList<TipoCozinha>();
	
	@GetMapping
	public List<TipoCozinha> getAll(){
		tipo = repository.findAll();
		return tipo;
		
	}

}
