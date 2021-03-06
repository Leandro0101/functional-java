package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Pendrive", 50.00));
		
//		list.removeIf(p -> p.getPrice() >= 100);
		list.removeIf(Product::staticProductPredicate);
		
		for(Product p : list) {
			System.out.println(p.getName());
		}
	}

}
