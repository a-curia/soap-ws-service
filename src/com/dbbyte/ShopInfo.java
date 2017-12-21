package com.dbbyte;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.dbbyte.business.ProductServiceImpl;


@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {

	
	@WebMethod()
	public String getShopInfo(String property) {
		String response = "Invalid property!";
		
		if("shopName".equals(property)) {
			response = "Test Mart";
		} else if ("since".equals(property)) {
			response = "since 2002";
		}
		
		return response;
	}
	
}
