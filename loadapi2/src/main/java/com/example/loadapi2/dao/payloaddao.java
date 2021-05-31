package com.example.loadapi2.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loadapi2.controller.entities.payload;


public interface payloaddao extends JpaRepository<payload, Long>{
	
}