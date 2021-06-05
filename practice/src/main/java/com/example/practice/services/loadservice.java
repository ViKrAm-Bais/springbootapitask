package com.example.practice.services;

import java.util.List;
import java.util.UUID;

import com.example.practice.entities.Load;
import com.example.practice.model.loadrequest;
import com.example.practice.model.loadresponse;

public interface loadservice {
	public List<Load> getload();
	public loadresponse postload(loadrequest loadrequestobj);
	public Load findLoad(UUID ownerid);
	public Load updateload(loadrequest loadrequestobj);
	public String deleteload(UUID ownerid);
	public Load findLoadbyname(String name);
}
