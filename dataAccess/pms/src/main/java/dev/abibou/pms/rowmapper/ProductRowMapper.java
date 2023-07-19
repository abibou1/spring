package dev.abibou.pms.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dev.abibou.pms.dto.Product;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		
		product.setProductID(rs.getInt("product_id"));
		product.setProductName(rs.getString("product_name"));
		product.setProductPrice(rs.getFloat("product_price"));

		
		return product;
	}

}
