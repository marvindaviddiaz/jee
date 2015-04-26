package com.sample.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.sample.inventory.bs.service.InventoryServiceLocal;
import com.sample.inventory.eis.bo.Product;

@RequestScoped
@ManagedBean
public class InventoryBean {

	@EJB
	private InventoryServiceLocal inventoryService;

	private List<Product> products;

	public InventoryBean() {
		System.out.print("################## New Instance InventoryBean()");
	}

	@PostConstruct
	public void initAction() {
		products = inventoryService.getProducts();
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
