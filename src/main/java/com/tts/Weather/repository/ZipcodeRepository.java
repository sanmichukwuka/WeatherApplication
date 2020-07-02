package com.tts.Weather.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tts.Weather.model.Zipcode;

public interface ZipcodeRepository extends CrudRepository<Zipcode, Long> {
	
	public List<Zipcode> findAllByOrderByCreatedAtDesc();
	public List<Zipcode> findAll();
	
}
