package com.mymart.dao;
import com.mymart.model.Product;
import java.util.*;

public class ProductDAO {
	
	static LinkedList<Product> i=new  LinkedList<>();
	
	public void addProduct(int productId3, String productName3, double productPrice3) {
		
		Product p = new Product(1,"parle-G",10.00);
		
	}
	
	public Product getAllProduct() {
	 LinkedList<Product> l=i.get(Object o);
	return l;
	}
}
