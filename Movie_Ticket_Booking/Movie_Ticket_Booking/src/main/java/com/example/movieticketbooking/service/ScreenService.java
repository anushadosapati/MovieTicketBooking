package com.example.movieticketbooking.service;


import java.util.List;

import com.example.movieticketbooking.entity.Screen;
import com.example.movieticketbooking.entity.Seat;
import com.example.movieticketbooking.exception.ScreenNotFoundException;

public interface ScreenService {
	
	public List<Screen> findAll();
	
	public Screen findById(int screenId) throws ScreenNotFoundException;

	void save(Screen theScreen);

	String deleteById(int screenId) throws ScreenNotFoundException;
}