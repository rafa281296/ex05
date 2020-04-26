package br.usjt.ex05;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;




@RestController
@RequestMapping("/cidades")
public class CidadeResource {

	@Autowired
	private CidadeRepository cidadeRepo;
	
	@GetMapping("/lista")
	public List<Cidade> todosOsLivros() {
		return cidadeRepo.findAll();
	}
	
	@PostMapping("/salvar")
	// @ResponseStatus (HttpStatus.CREATED) agora desnecessária
	public ResponseEntity<Cidade> salvar(@RequestBody Cidade cidade, HttpServletResponse response) {
		Cidade l = cidadeRepo.save(cidade);
		URI uri = ServletUriComponentsBuilder.

				fromCurrentServletMapping().path("/{id}").buildAndExpand(l.getId()).toUri();
		// desnecessário também
		// response.setHeader("Location", uri.toASCIIString());
		return ResponseEntity.created(uri).body(l);
	}

}
