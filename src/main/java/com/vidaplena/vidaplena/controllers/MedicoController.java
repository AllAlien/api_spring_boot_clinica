package com.vidaplena.vidaplena.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vidaplena.vidaplena.Repositories.MedicoRepository;
import com.vidaplena.vidaplena.model.entities.Medico;

@RestController
@RequestMapping("/medico")
public class MedicoController {
	
	@Autowired
	private MedicoRepository repository;
	
	@PostMapping
	public ResponseEntity<Medico> cadastrarMedico(@RequestBody Medico medico){
		
		if (medico != null) {
			repository.save(medico);
			return ResponseEntity.status(201).body(medico);
		}
		
		return ResponseEntity.status(400).body(medico);
		
	}
	
	@GetMapping
	public ResponseEntity<Iterable<Medico>> listarTodos (){
		Iterable<Medico> lista =  repository.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity< Optional< Medico> > buscarPorId(@PathVariable Long id){
		
		 Optional<Medico> medico = repository.findById(id);
		 
		 return ResponseEntity.ok().body(medico);		 
		 
	}
	
	
}
