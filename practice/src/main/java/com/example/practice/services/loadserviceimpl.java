package com.example.practice.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
	
	public Load findLoad(UUID ownerid)
	{
		System.out.println("UUID is: " + ownerid);
		Optional<Load> loadobj = loaddaoobj.findByowner(ownerid);
		Load load = new Load();
		if(loadobj.isPresent()) {
			load = loadobj.get();
			System.out.println("true");
			return load;
		}
		else {
			System.out.println("false");
		}
		return load;
	}
	
	public Load findLoadbyname(String name)
	{
		System.out.println("name is: " + name);
		Optional<Load> loadobj = loaddaoobj.findByname(name);
		Load load = new Load();
		if(loadobj.isPresent()) {
			load = loadobj.get();
			System.out.println("true");
			return load;
		}
		else {
			System.out.println("false");
		}
		return load;
	}
	

	

	public Load updateload(loadrequest loadrequestobj)
	{
		System.out.println("UUID is: " + loadrequestobj.getOwnerid());
		Optional<Load> loadobj = loaddaoobj.findByowner(loadrequestobj.getOwnerid());
		if(loadobj.isPresent())
		{
			Load load = loadobj.get();
			load.setName(loadrequestobj.getName());
			load.setWork(loadrequestobj.getWork());
			loaddaoobj.save(load);
			return loadobj.get();
		}
		return null;
	}
	

	public String deleteload(UUID ownerid)
	{
		System.out.println("UUID is: " + ownerid);
		Optional<Load> loadobj = loaddaoobj.findByowner(ownerid);
		if(loadobj.isPresent())
		{
			Load load = loadobj.get();
			loaddaoobj.delete(load);
			return "Done";
		}
		else return "user not available";
	}

}
