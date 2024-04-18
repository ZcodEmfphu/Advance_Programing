package testcase.lab7;

import org.junit.Test;

import lab7.ex5.*;

public class Ex5_Test {

	@Test
	public void inventoryManagementSystem() {

		Store store = new Store("BeeBee");

		Product product1 = new Product("M01", "Keyboard");
		Product product2 = new Product("M02", "Mouse");

		Supplier supplier1 = new Supplier("S01", "Supplier A", "Quan9");
		Supplier supplier2 = new Supplier("S02", "Supplier B", "Thu Duc");

		Order order1 = new Order("1", supplier1);

		order1.addProduct(product1, 10);
		order1.addProduct(product2, 20);

		order1.display();

		store.addOrder(order1);
		store.display();
	}

}
