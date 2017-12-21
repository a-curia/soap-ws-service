package com.dbbyte;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dbbyte.business.ProductServiceImpl;


@WebService
public class ProductCatalog {

	ProductServiceImpl service = new ProductServiceImpl();
	
	@WebMethod
	public List<String> getProductCategories() {
		return service.getProductCategories();
	}

	public List<String> getProducts(String category) {
		return service.getProducts(category);
	}
	
	public boolean addProducts(String category, String product) {
		return service.addProductToCategory(category, product);
	}
}
