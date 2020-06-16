package com.exam.demo;

import org.springframework.stereotype.Service;

import graphql.ExecutionResult;

@Service
public class CoffeeUseCase {

	private final CoffeeDetails coffeeDetails;
	
	public CoffeeUseCase(CoffeeDetails coffeeDetails) {
		this.coffeeDetails = coffeeDetails;
	}
	
	public ExecutionResult execute(String query) {
		return coffeeDetails.execute(query);
	}
	
	/*
	 * public List<Coffee> findAll(){ return coffeeDetails.findAll(); }
	 * 
	 * public Coffee findByCid(String cid) { return coffeeDetails.findByCid(cid); }
	 */
}
