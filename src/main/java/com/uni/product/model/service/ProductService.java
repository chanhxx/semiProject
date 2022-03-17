package com.uni.product.model.service;

import static com.uni.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.uni.product.model.dao.ProductDao;
import com.uni.product.model.vo.Product;


public class ProductService {
	
	public ArrayList<Product> productList() {
		
		Connection conn = getConnection();
		
		ArrayList<Product> list = new ProductDao().productList(conn);
		
		close(conn);
		
		return list;
	}

	public ArrayList<Product> selectListProduct(int category) {
		
		Connection conn = getConnection();
		
		ArrayList<Product> list = new ProductDao().selectProductList(conn, category);
		
		close(conn);
		
		return list;
	}

	public ArrayList<Product> topProduct() {
		
		Connection conn = getConnection();
		
		ArrayList<Product> list = new ProductDao().topProduct(conn);
		
		close(conn);
		
		return list;
	}

	public Product selectProduct(int no) {
		
		Connection conn = getConnection();
		
		Product p = new ProductDao().selectProduct(conn, no);
		
		close(conn);
		
		return p;
	}

	public Product changeProduct(int q, String name) {
		
		Connection conn = getConnection();
		
		Product p = new ProductDao().changeProduct(conn, q, name);
		
		close(conn);
		
		return p;
	}

}