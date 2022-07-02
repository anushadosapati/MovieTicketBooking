package com.example.movieticketbooking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movieticketbooking.entity.Theatre;
import com.example.movieticketbooking.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> 
{
	

	public User findByEmail(String email);


	public User findByUserName(String userName);

	
}
