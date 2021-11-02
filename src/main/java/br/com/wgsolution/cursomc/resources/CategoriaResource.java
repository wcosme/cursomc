package br.com.wgsolution.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wgsolution.cursomc.domain.Categoria;
import br.com.wgsolution.cursomc.services.CategoriaServiceImpl;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaServiceImpl service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> buscaTodos(@PathVariable Long id) {
		
		Categoria categoria = service.buscar(id);		
		
		return ResponseEntity.ok().body(categoria);
	}

}
