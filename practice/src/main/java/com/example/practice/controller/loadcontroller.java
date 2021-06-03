package com.example.practice.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.practice.entities.Load;
import com.example.practice.model.loadrequest;
import com.example.practice.model.loadresponse;
import com.example.practice.services.loadserviceimpl;

@RestController
public class loadcontroller {
	
	@Autowired
	public loadserviceimpl loadserviceobj;
	
	@GetMapping("/home")
	public String home()
	{
		return "welcome";
	}
	
	@GetMapping("/load")
	public List<Load> getload()
	{
		return loadserviceobj.getload();
	}
	
	
	@PostMapping("/load")
	public loadresponse postload(@RequestBody loadrequest loadrequestobj) {
		System.out.print(loadrequestobj.getOwnerid());
		return loadserviceobj.postload(loadrequestobj);
	}
	@GetMapping("/load/{ownerid}")
	public List<Load> findload(@RequestParam(name="ownerid",required=false) UUID ownerid)
	{
		return loadserviceobj.findLoad(ownerid);
	}
	@PutMapping("/load")
    public loadresponse updateload(@RequestBody loadrequest loadrequestobj) {
		
		return loadserviceobj.updateload(loadrequestobj);
		
	}
}