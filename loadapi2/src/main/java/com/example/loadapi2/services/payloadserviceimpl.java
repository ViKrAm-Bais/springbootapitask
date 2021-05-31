package com.example.loadapi2.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loadapi2.controller.entities.payload;
import com.example.loadapi2.dao.payloaddao;



@Service
public class payloadserviceimpl implements payloadservice{
	
	@Autowired
	private payloaddao payloaddao1;
	
	@Override
	public List<payload> getpayload() {
		
		return payloaddao1.findAll();
	}
	
	@Override
	public payload getpayload(long payloadID) {
		return payloaddao1.getById(payloadID);
	}

	@Override
	public payload addpayload(payload payload1) {
		payloaddao1.save(payload1);
		return payload1;
	}

	@Override
	public payload putpayload(payload payload1) {
		payloaddao1.save(payload1);
		return payload1;
	}

	@Override
	public void deletepayload(long parseLong) {
		payload entity = payloaddao1.getById(parseLong);
		payloaddao1.delete(entity);
		
	}
}

 