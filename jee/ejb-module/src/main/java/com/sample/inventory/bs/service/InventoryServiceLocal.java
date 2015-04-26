package com.sample.inventory.bs.service;

import java.util.List;

import javax.ejb.Local;

import com.sample.inventory.eis.bo.Product;

@Local
public interface InventoryServiceLocal {

	List<Product> getProducts();

}
