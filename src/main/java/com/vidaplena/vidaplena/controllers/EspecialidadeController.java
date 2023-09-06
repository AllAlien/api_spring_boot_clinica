package com.vidaplena.vidaplena.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vidaplena.vidaplena.Repositories.EspecialidadeRepository;
import com.vidaplena.vidaplena.model.entities.Especialidade;

@RestController
@RequestMapping("/especialidade")
public class EspecialidadeController {

	@Autowired
	private EspecialidadeRepository repository;
	
	@PostMapping
	public Especialidade cadastrarEspecialidade (@RequestBody Especialidade especialidade) {
		if(especialidade != null) {
			Especialidade novo_especialidade = repository.save(especialidade);
			return novo_especialidade;
		}
		
		return null;
	}
	
	
	@PutMapping
	public Especialidade atualizarEspecialidade (@RequestBody Especialidade especialidade) {
		Especialidade novo_especialidade = repository.save(especialidade);
		return novo_especialidade;		
	}
	
	@GetMapping
	public Iterable<Especialidade> listarTodos(){
		
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Especialidade> buscarPorId(@PathVariable Long id) {
		return repository.findById(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void excluirEspecialidade(@PathVariable Long id){
		 repository.deleteById(id);
	
	}
}