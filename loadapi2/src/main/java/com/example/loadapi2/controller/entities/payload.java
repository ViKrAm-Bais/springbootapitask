package com.example.loadapi2.controller.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class payload{
	
	@Id
	private long id;
	private String loadingPoint;
	private String unloadingPoint;
    private String productType;
    private String truckType;
    private long noOfTrucks;
    private double weight;
    private String optional;
    private String shipperId;
	private String Date;
	
	public payload(long id, String loadingPoint, String unloadingPoint, String productType, String truckType, long noOfTrucks, double weight, String optional, String shipperId, String Date)
	{
		super();
		this.id = id;
		//  String productType, String truckType, long noOfTrucks, double weight, String optional, String shipperId, String Date
		this.setLoadingPoint(loadingPoint);  
		this.setUnloadingPoint(unloadingPoint); 
		this.setProductType(productType); 
		this.setTruckType(truckType); 
		this.setNoOfTrucks(noOfTrucks);
		this.setWeight(weight);
		this.setOptional(optional);
		this.setShipperId(shipperId);
		this.setDate(Date);
	}
	
	public payload()
	{
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public long getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(long noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getOptional() {
		return optional;
	}

	public void setOptional(String optional) {
		this.optional = optional;
	}

	public String getShipperId() {
		return shipperId;
	}

	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
	
}
