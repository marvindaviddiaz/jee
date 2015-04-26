package com.sample.inventory.eis.bo;

import java.io.Serializable;

public class Product implements Serializable{

	private static final long serialVersionUID = 6081146756275331329L;
	
	private Integer id;
	private String code;
	private String name;
	private Double price;

	public Product() {
		super();
	}

	public Product(Integer id, String code, String name, Double price) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
