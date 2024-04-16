package lab7.ex3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Products> listProduct;

	public ShoppingCart() {
		super();
		this.listProduct = new ArrayList<Products>();
	}

	public void addProduct(Products products) {
		listProduct.add(products);
	}

	public void removeProduct(Products products) {
		listProduct.remove(products);
	}

	public void viewProduct() {
		for (Products items : listProduct) {
			System.out.println(items);
		}
	}

	public double getTotalPrice() {
		double total = 0.0;
		for (Products items : listProduct) {
			total += items.getPrice() * items.getQuality();
		}
		return total;
	}

	@Override
	public String toString() {
		return "ShoppingCart [listProduct=" + listProduct + "]";
	}

}
