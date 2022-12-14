package com.Anllelo.Yactayo.Paz.service;

import java.util.List;

import com.Anllelo.Yactayo.Paz.model.Turista;

public interface TuristaService {
	
	List<Turista> listar();
	Turista ObtenerId(Integer id);	
	void guardar(Turista turista);
	void eliminar(Integer id);

}
