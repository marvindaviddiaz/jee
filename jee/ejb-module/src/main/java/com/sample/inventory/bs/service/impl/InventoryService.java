package com.sample.inventory.bs.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.sample.inventory.bs.service.InventoryServiceLocal;
import com.sample.inventory.bs.service.InventoryServiceRemote;
import com.sample.inventory.eis.bo.Product;

/**
 * Session Bean implementation class InventoryBean
 */
@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class InventoryService implements InventoryServiceRemote, InventoryServiceLocal {

	/**
	 * Default constructor.
	 */
	public InventoryService() {
		super();
		System.out.print("################## New Instance InventoryService()");
	}

	@Override
	public List<Product> getProducts() {

		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "Coca12onz", "Coca-Cola 12 onzas", 5.00));
		list.add(new Product(1, "Peps12onz", "Pepsi-Cola 12 onzas", 6.00));
		list.add(new Product(1, "7Up12onz", "7-Up 12 onzas", 3.50));

		return list;
	}

}
