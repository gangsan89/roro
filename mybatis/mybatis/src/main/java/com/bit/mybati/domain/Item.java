package com.bit.mybati.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Item {
	public Item() {}
	
	@Builder
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	};
	private int price;
	private String name;
}
