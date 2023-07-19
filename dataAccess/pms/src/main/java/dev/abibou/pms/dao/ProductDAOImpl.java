package dev.abibou.pms.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import dev.abibou.pms.dto.Product;

public class ProductDAOImpl implements ProductDAO {

	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt=jt;
	}
	
	@Override
	public int saveProduct(Product product) {
		String sql = "insert into product_dtls values("+product.getProductID()+",'"+product.getProductName()+"',"+product.getProductPrice()+")";
		int n = jt.update(sql);
		return n;
	}

	@Override
	public Product findByID(int productID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateProduct(int productID, Product product) {
		String sql = "update product_dtls set product_name='"+product.getProductName()+"',product_price="+product.getProductPrice()+" where product_id="+productID;
		int n = jt.update(sql);
		return n;
	}

	@Override
	public int deleteByID(int productID) {
		String sql = "delete from product_dtls where product_id="+productID;
		int n = jt.update(sql);
		return n;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
