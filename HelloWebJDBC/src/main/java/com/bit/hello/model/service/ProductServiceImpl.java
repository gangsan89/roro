package com.bit.hello.model.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bit.hello.model.dao.DBConnection;
import com.bit.hello.model.dto.Product;

@Service
public class ProductServiceImpl implements ProductService {
	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

	private static Connection connection = DBConnection.getConnection();

	@Override
	public List<Product> selectAll() {
		String sql = "select * from product";
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getInt("price"));
				list.add(p);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public Product selectOne(int id) {
		String sql = "select * from product where id = ?";

		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			Product p = new Product();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setPrice(rs.getInt("price"));
			p.setDescription(rs.getString("description"));
			return p;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
