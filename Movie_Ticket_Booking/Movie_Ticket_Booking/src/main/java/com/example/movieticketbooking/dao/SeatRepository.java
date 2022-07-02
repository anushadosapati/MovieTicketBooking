package com.example.movieticketbooking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movieticketbooking.entity.Movie;
import com.example.movieticketbooking.entity.Seat;

public interface SeatRepository  extends JpaRepository<Seat,Integer>{

}
