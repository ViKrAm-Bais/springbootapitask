package com.example.practice.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.dao.Loaddao;
import com.example.practice.entities.Load;
import com.example.practice.model.loadrequest;
import com.example.practice.model.loadresponse;

@Service
public class loadserviceimpl implements loadservice{
	@Autowired
	Loaddao loaddaoobj;
	
	
	public List<Load> getload() {
		
		return loaddaoobj.findAll();
	}

	public loadresponse postload(loadrequest loadrequestobj)
	{
		Load loadobj = new Load();
		loadobj.setId(UUID.randomUUID());
		loadobj.setOwnerid(loadrequestobj.getOwnerid());
		loadobj.setName(loadrequestobj.getName());
		loadobj.setWork(loadrequestobj.getWork());
		loadobj.setStatus("pending");
		loadresponse loadresponseobj = new loadresponse();
		loadresponseobj.setStatus("pending");
		loaddaoobj.save(loadobj);	
		return loadresponseobj;
	}
	
	public List<Load> findLoad(UUID ownerid)
	{
		if(ownerid!=null)
			 return loaddaoobj.findAllByOwnerId(ownerid);
		return loaddaoobj.findByStatus("pending");
	}
	

	public loadresponse updateload(loadrequest loadrequestobj)
	{
		loadresponse loadresponseobj = new loadresponse();
		return loadresponseobj;
	}
	
	
}
