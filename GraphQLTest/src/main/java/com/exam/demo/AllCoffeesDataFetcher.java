package com.exam.demo;

import java.util.List;

import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class AllCoffeesDataFetcher implements DataFetcher<List<Coffee>> {

	private final CoffeeRepository coffeeRepository;
	
	public AllCoffeesDataFetcher(CoffeeRepository coffeeRepository) {
		this.coffeeRepository = coffeeRepository;
	}
	
	
	@Override
	public List<Coffee> get(DataFetchingEnvironment dataFetchingEnvironment) {
		return coffeeRepository.findAll();
	}
}
