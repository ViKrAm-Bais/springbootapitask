package com.example.loadapi2.services;


import java.util.List;

import com.example.loadapi2.controller.entities.payload;


public interface payloadservice {
	
	public List<payload> getpayload();
	public payload getpayload(long payloadID);
	
	public payload addpayload(payload payload1);
	public payload putpayload(payload payload1);
	public void deletepayload(long parseLong);
}