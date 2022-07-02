package com.example.movieticketbooking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movieticketbooking.entity.Movie;
import com.example.movieticketbooking.entity.Screen;
import com.example.movieticketbooking.entity.Seat;

public interface ScreenRepository extends JpaRepository<Screen,Integer> {

	

}
