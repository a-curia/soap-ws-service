package com.dbbyte;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dbbyte.models.Product;


// this will be the SEI... on the server

@WebService(name="TestMartCatalog",portName="TestMartCatalogPort",serviceName="TestMartCatalogService",
targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	List<String> getProductCategories();

	List<String> getProducts(String category);

	List<Product> getProductsV2(String category);

	boolean addProducts(String category, String product);

}