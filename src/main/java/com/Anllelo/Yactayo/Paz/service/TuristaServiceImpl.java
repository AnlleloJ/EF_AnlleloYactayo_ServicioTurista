package com.Anllelo.Yactayo.Paz.service;

import java.util.List;

import com.Anllelo.Yactayo.Paz.Repository.TuristaRepository;
import com.Anllelo.Yactayo.Paz.model.Turista;


public class TuristaServiceImpl implements TuristaService {

	
	
	private TuristaRepository repository;
	
	
	
	@Override
	public List<Turista> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Turista ObtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Turista turista) {
		// TODO Auto-generated method stub
		repository.save(turista);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
		repository.deleteById(id);

	}

}
