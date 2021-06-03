package com.example.practice.services;

import java.util.List;
import java.util.UUID;

import com.example.practice.entities.Load;
import com.example.practice.model.loadrequest;
import com.example.practice.model.loadresponse;

public interface loadservice {
	public List<Load> getload();
	public loadresponse postload(loadrequest loadrequestobj);
	public List<Load> findLoad(UUID ownerid);
	public loadresponse updateload(loadrequest loadrequestobj);
}
