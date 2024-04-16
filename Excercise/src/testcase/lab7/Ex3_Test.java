package testcase.lab7;

import org.junit.Test;

import lab7.ex3.*;

public class Ex3_Test {

	@Test
	public void onlineShoppingSystem() {

		Products product1 = new Products("001", "Laptop", 1000.0, 5);
		Products product2 = new Products("002", "Phone", 500.0, 10);

		Customers customer1 = new Customers("Alice");

		customer1.addToCart(product1);
		customer1.addToCart(product2);

		customer1.displayCart();

		customer1.checkout();
	}

}
