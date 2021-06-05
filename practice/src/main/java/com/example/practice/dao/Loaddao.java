package com.example.practice.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.practice.entities.Load;

@Repository
public interface Loaddao extends JpaRepository<Load , UUID>
{
	public List<Load> findByName(String name);
	public List<Load> findAllByOwnerid(UUID ownerid);
	public List<Load> findByStatus(String string);
	
	@Query("select l from Load l where l.ownerid = :ownerid ")
	public Optional<Load> findByowner(UUID ownerid);
	
	@Query("select l from Load l where l.name = :name")
	public Optional<Load> findByname(String name);
	/*
	@Query("select l from Load l where l.work = :work")
	public Optional<Load> findBywork(String work);
	*/
	
}
