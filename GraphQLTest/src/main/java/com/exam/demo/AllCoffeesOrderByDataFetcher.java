package com.exam.demo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class AllCoffeesOrderByDataFetcher implements DataFetcher<List<Coffee>> {

	private final CoffeeRepository coffeeRepository;
	
	public AllCoffeesOrderByDataFetcher(CoffeeRepository coffeeRepository) {
		this.coffeeRepository = coffeeRepository;
	}
	
	@Override
	public List<Coffee> get(DataFetchingEnvironment environment) {
		return coffeeRepository.findAll(
		/*
		 * new Sort( Sort.Direction.fromString(environment.getArgument("sortOrder")),
		 * (environment.getArgument("sortBy")))
		 */);
	}
}
