package com.example.movieticketbooking.service;
import com.example.movieticketbooking.entity.Movie;
import com.example.movieticketbooking.entity.Theatre;
import com.example.movieticketbooking.entity.User;
import com.example.movieticketbooking.exception.UserNotFoundException;

import java.util.List;
import java.util.Optional;



public interface UserService
{
	public List<User> findAll();
	
	public User findById(int userId) throws UserNotFoundException;

	public User save(User userId);

	public String deleteById(int userId) throws UserNotFoundException;
	
	public User findUserByEmail(String email);
	 

	public User findByUserName(String userName);	 
}