package dev.abibou.pms.DAO;

import java.util.List;

import dev.abibou.pms.dto.Product;

public interface ProductDAO {
	
	public int saveProduct(Product product);
	public Product findByID(int productID);
	public int updateProduct(int productID, Product product);
	public int deleteByID(int productID);
	public List<Product> findAll();

}
