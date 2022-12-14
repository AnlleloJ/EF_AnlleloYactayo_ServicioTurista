package com.Anllelo.Yactayo.Paz.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Anllelo.Yactayo.Paz.model.Turista;
import com.Anllelo.Yactayo.Paz.service.TuristaService;


@Controller
@RequestMapping("/turista/v1")
public class TuristaController {
	
	@Autowired
	private TuristaService service;
	
	
	//listar
	@GetMapping("/listar")
	public @ResponseBody List<Turista> listar(){
		return service.listar();
	}
	//por id
	@GetMapping("/listar/{id}")
	public @ResponseBody Turista obtener(@PathVariable Integer id){
		return service.ObtenerId(id);
	}
	//guardar
	@PostMapping("/guardar")
	public ResponseEntity<Void>  guardar(@RequestBody Turista turista) {
		service.guardar(turista);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//eliminar
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		Turista turista= service.ObtenerId(id);
		if(turista != null) {
			service.eliminar(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}		
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}

}
