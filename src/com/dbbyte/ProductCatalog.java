package com.dbbyte;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dbbyte.business.ProductServiceImpl;
import com.dbbyte.models.Product;


//@WebService(name="TestMartCatalog",portName="TestMartCatalogPort",serviceName="TestMartCatalogService",
//targetNamespace="http://www.testmart.com")

@WebService(endpointInterface="com.dbbyte.ProductCatalogInterface") // only annotatin required in implementation
public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl service = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.dbbyte.ProductCatalogInterface#getProductCategories()
	 */
	@Override
//	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public List<String> getProductCategories() {
		return service.getProductCategories();
	}

	/* (non-Javadoc)
	 * @see com.dbbyte.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		return service.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see com.dbbyte.ProductCatalogInterface#getProductsV2(java.lang.String)
	 */
	@Override
	@WebMethod
	public List<Product> getProductsV2(String category) {
		return service.getProductsV2(category);
	}
	
	
	/* (non-Javadoc)
	 * @see com.dbbyte.ProductCatalogInterface#addProducts(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProducts(String category, String product) {
		return service.addProductToCategory(category, product);
	}
}
