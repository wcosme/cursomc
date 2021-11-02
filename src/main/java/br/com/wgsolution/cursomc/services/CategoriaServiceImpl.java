package br.com.wgsolution.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wgsolution.cursomc.domain.Categoria;
import br.com.wgsolution.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Categoria buscar(Long id) {
		
		Optional<Categoria> obj = repository.findById(id);
		
		return obj.orElse(null);
	}
}
