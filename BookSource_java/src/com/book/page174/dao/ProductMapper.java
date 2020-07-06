package com.book.page174.dao;

import java.util.List;

import com.book.page174.Product;

public interface ProductMapper {
	List<Product> findProductList(int id);
	List<Product> findProductPrice(int price);
	//Product findProduct(int i);
	
}
