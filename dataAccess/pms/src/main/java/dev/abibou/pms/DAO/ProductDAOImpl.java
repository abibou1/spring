package dev.abibou.pms.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.abibou.pms.dto.Product;

public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	ProductDAO productDAO;
	
	@Override
	public int saveProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product findByID(int productID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateProduct(int productID, Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByID(int productID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
