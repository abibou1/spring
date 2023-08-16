package dev.abibou.pms.services;

import java.util.List;

import dev.abibou.pms.dto.Product;

public interface ProductServices {
	
	public void createProduct(Product product);
	
	public Product findProductByID(int productID);
	
	public void updateProduct(int productID, Product product);
	
	public void deleteProductByID(int productID);
	
	public List<Product> findAllProducts();
	

}
