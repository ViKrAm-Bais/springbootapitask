package com.example.practice.model;

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
public class loadrequest {
	private UUID ownerid;
	private String name;
	private String work;
}
