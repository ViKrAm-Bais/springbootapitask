package com.example.loadapi2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loadapi2.controller.entities.payload;
import com.example.loadapi2.services.payloadservice;





@RestController
public class mycontroller {

	
	@Autowired
	private payloadservice payloadservice1;
	
	// just checking whether api is working or not
	@GetMapping("/home")
	public String home()
	{
		return "welcome";
	}
	
	// printing course detail for course id
	@GetMapping("/payload")
	public List<payload> getpayload()
	{
		return this.payloadservice1.getpayload();
	}
	
	@GetMapping("/payload/{payloadID}")
	public payload getpayload(@PathVariable String payloadID)
	{
		return this.payloadservice1.getpayload(Long.parseLong(payloadID));
	}
	// get the courses
	
	
	@PostMapping("/payload")
	public payload addpayload(@RequestBody payload payload1)
	{
		return this.payloadservice1.addpayload(payload1);
	}
	
	//updating courses
	@PutMapping("/payload")
	public payload putpayload(@RequestBody payload payload1)
	{
		return this.payloadservice1.putpayload(payload1);
	}
	
	// deleting course with given id
	@DeleteMapping("/payload/{payloadID}")
	public ResponseEntity<HttpStatus> deletepayload(@PathVariable String payloadID)
	{
		try
		{
			this.payloadservice1.deletepayload(Long.parseLong(payloadID));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
