package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.ProductService;

public class Program {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Notebook", 2900.0));
		products.add(new Product("Adaptador", 100.0));
		products.add(new Product("Tesoura", 20.0));
		products.add(new Product("Tablet", 500.0));
		
		System.out.println((new ProductService().filteredSum(products, p -> p.getName().charAt(0) == 'T')));
	}

}
