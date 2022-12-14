package com.Anllelo.Yactayo.Paz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Anllelo.Yactayo.Paz.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository <Turista, Integer>{

}
