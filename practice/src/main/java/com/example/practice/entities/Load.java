package com.example.practice.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "load")
@Data
public class Load {
	@Id
	private UUID id;
	private UUID ownerid;
	private String name;
	private String work;
	private String status;
}
