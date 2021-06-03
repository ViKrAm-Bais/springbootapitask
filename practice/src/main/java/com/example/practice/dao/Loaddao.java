package com.example.practice.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.entities.Load;

@Repository
public interface Loaddao extends JpaRepository<Load , UUID>
{
	public List<Load> findByName(String name);
	public List<Load> findAllByOwnerid(UUID ownerid);
}
