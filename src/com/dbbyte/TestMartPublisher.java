package com.dbbyte;

import javax.xml.ws.Endpoint;


public class TestMartPublisher {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8090/productcatalog", new ProductCatalog());
	}

}
