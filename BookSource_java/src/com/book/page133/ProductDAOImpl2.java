package com.book.page133;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ProductDAOImpl2 extends JdbcDaoSupport implements ProductDAO {

	@Override
	public List<Product> findProductList() {
		String sql = "select * from product";
		ProductRowMapper rowMapper= new ProductRowMapper();
		List<Product> products = getJdbcTemplate().query(sql, rowMapper);
		return products;
	}
	
		
	
}
