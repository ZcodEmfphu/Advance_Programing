package lab7.ex3;

import java.util.ArrayList;

public class Customers {

	private String name;
	private ShoppingCart cart;

	public Customers(String name) {
		super();
		this.name = name;
		this.cart = new ShoppingCart();
	}

	public String getName() {
		return name;
	}

	public ShoppingCart getCart() {
		return cart;
	}

	public void addToCart(Products products) {
		cart.addProduct(products);
	}

	public void removeToCart(Products products) {
		cart.removeProduct(products);
	}

	public void displayCart() {
		cart.viewProduct();
	}

	public void checkout() {
		System.out.println("Total price: $" + cart.getTotalPrice());
	}

	@Override
	public String toString() {
		return "Customers [name=" + name + ", cart=" + cart + "]";
	}

}
