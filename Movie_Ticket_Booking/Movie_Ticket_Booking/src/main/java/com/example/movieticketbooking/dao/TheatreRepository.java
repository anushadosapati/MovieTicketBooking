package com.example.movieticketbooking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movieticketbooking.entity.Movie;
import com.example.movieticketbooking.entity.Theatre;

public interface TheatreRepository extends JpaRepository<Theatre,Integer> {

	

}
