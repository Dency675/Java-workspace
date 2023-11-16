package com.ilp.service;

import com.ilp.entity.Service;

public class ServiceService {

	public static Service createService() {
		Service service = new Service("SE100","Service1",10230);
		return service;
	}

	public static void displayService(Service service) {
		// TODO Auto-generated method stub
		System.out.println("Service Code"+"\t"+"Service Name"+"\t"+"Service Price");
		System.out.println(service.getServiceCode()+"\t\t"+service.getServiceName()+"\t\t"+service.getServicePrice());

	}

}
