package dev.abibou.pms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.abibou.pms.dao.ProductDAO;
import dev.abibou.pms.dto.Product;

public class ProductServiceImpl implements ProductServices {
	
	@Autowired
	ProductDAO productDAO;

	@Override
	public void createProduct(Product product) {
		int n = productDAO.saveProduct(product);
		
		if(n>0) {
			System.out.println("Product successfull saved to Stock");
		}
		else {
			System.out.println("Internal error... Try again");
		}
		
	}

	@Override
	public Product findProductByID(int productID) {

		return null;
	}

	@Override
	public void updateProduct(int productID, Product product) {
		int n = productDAO.updateProduct(productID, product);
		
		if(n>0) {
			System.out.println("Product successfull update in the Stock");
		}
		else {
			System.out.println("Internal error... Try again");
		}
		
	}

	@Override
	public void deleteProductByID(int productID) {
		int n = productDAO.deleteByID(productID);
		
		if(n>0) {
			System.out.println("Product successfull deleted in the Stock");
		}
		else {
			System.out.println("Internal error... Try again");
		}
		
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
