package com.sample.inventory.bs.service;

import java.util.List;

import javax.ejb.Remote;

import com.sample.inventory.eis.bo.Product;

@Remote
public interface InventoryServiceRemote {

	List<Product> getProducts();
}
