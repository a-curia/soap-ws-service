package com.dbbyte.business;

import java.util.ArrayList;
import java.util.List;

import com.dbbyte.models.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("book1");
		bookList.add("book2");
		bookList.add("book3");

		movieList.add("Movie1");
		movieList.add("Movie2");
		movieList.add("Movie3");

		musicList.add("Music1");
		musicList.add("Music2");
		musicList.add("Music3");
	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Movies");
		categories.add("Music");
		return categories;
	}

	public List<String> getProducts(String category) {

		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "movies":
			return movieList;
		case "music":
			return musicList;
		}
		return null;
	}

	public boolean addProductToCategory(String category, String product) {

		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		default:
			return false;
		}

		return true;
	}

	public List<Product> getProductsV2(String category) {
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("a book 1", "12356", 25.36));
		productList.add(new Product("a book 2", "5435", 89.36));
		
		return productList;
	}

}
