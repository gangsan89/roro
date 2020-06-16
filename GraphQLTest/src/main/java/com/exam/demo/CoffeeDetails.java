package com.exam.demo;

import graphql.ExecutionResult;

public interface CoffeeDetails {

	/*
	 * List<Coffee> findAll(); Coffee findByCid(String cid);
	 */
	
	//GraphQL
	ExecutionResult execute(String query);
}
