package com.ilp.entity;

public class Service {

	private String serviceCode;
	private String serviceName;
	private double servicePrice;
	
	public Service(String serviceCode,String serviceName,double servicePrice) {
		this.serviceCode =serviceCode;
		this.serviceName =serviceName;
		this.servicePrice=servicePrice;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public String getServiceName() {
		return serviceName;
	}

	public double getServicePrice() {
		return servicePrice;
	}
	
	
}
