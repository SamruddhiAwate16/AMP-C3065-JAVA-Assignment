import java.util.LinkedList;

import com.mymart.model.Product;

public class ProductView {
	ProductService productService=new ProductService();
			
	public void addProduct() {
		//sc class
		int pId=1;
		String pName
	}
	
	public void displayAllProduct() {
		LinkedList<Product> product=productService.getAllProductService();
		for(Product p:product) {
			System.out.println("Product Details:");
			System.out.println("Product ID:"+p.getProductId());
			System.out.println("Product Name:"+p.getProductName());
			System.out.println("Product Price:"+p.getProductPrice());
		}
	}
}
