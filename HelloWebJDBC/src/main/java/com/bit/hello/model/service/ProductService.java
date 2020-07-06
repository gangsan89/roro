package com.bit.hello.model.service;

import java.util.List;

import com.bit.hello.model.dto.Product;

public interface ProductService {
	List<Product> selectAll();

	Product selectOne(int id);
}
