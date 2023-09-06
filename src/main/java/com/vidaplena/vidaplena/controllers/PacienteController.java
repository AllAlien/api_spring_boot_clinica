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

import com.vidaplena.vidaplena.Repositories.PacienteRepository;
import com.vidaplena.vidaplena.model.entities.Paciente;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

	@Autowired
	private PacienteRepository repository;
	
	@PostMapping
	public Paciente cadastrarPaciente (@RequestBody Paciente paciente) {
		if(paciente != null) {
			Paciente novo_paciente = repository.save(paciente);
			return novo_paciente;
		}
		
		return null;
	}
	
	
	@PutMapping
	public Paciente atualizarPaciente (@RequestBody Paciente paciente) {
		Paciente novo_paciente = repository.save(paciente);
		return novo_paciente;		
	}
	
	@GetMapping
	public Iterable<Paciente> listarTodos(){
		
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Paciente> buscarPorId(@PathVariable Long id) {
		return repository.findById(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void excluirPaciente(@PathVariable Long id){
		 repository.deleteById(id);
	
	}
}
