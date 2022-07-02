package com.example.movieticketbooking.service;

import java.util.List;
import java.util.Optional;

import com.example.movieticketbooking.entity.Seat;
import com.example.movieticketbooking.exception.SeatNotFoundException;
import com.example.movieticketbooking.entity.Seat;

public interface SeatService {
	
	public List<Seat> findAll();
	
	public Seat findById(int seatId) throws SeatNotFoundException;

	public void save(Seat theSeat);

	public String deleteById(int seatId) throws SeatNotFoundException;
	
	public Seat findAllByScreenId(int screenId);

	

}