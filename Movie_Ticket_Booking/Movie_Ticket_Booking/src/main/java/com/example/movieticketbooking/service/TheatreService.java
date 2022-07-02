package com.example.movieticketbooking.service;

import java.util.List;
import java.util.Optional;

import com.example.movieticketbooking.entity.Theatre;
import com.example.movieticketbooking.exception.TheatreNotFoundException;

public interface TheatreService {
	
	public List<Theatre> findAll();
	
	public Theatre findById(int theatreId) throws TheatreNotFoundException;

	public void save(Theatre theTheatre);

	public String deleteById(int theatreId) throws TheatreNotFoundException;

}