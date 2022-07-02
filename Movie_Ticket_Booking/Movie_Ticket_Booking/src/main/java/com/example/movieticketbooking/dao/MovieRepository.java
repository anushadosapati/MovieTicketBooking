package com.example.movieticketbooking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movieticketbooking.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

	//List<Movie> findAllByOrderByRatingAsc(double rating); 

}
