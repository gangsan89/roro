package com.exam.demo;

import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class CoffeeDataFetcher implements DataFetcher<Coffee> {
	
	private final CoffeeRepository coffeeRepository;
	
	public CoffeeDataFetcher(CoffeeRepository coffeeRepository) {
		this.coffeeRepository = coffeeRepository;
	}
	
	@Override
	public Coffee get(DataFetchingEnvironment dataFetchingEnvironment) {
		String cid = dataFetchingEnvironment.getArgument("id");
		return coffeeRepository.findByCid(cid);
	}

}
