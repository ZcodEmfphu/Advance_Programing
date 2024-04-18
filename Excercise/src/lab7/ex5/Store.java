package lab7.ex5;

import java.util.ArrayList;
import java.util.List;

public class Store {

	private String name;
	private List<Order> listOrder;
	private List<Product> listProduct;

	public Store(String name) {
		super();
		this.name = name;
		this.listOrder = new ArrayList<Order>();
		this.listProduct = new ArrayList<Product>();
	}

	public void addOrder(Order order) {
		listOrder.add(order);
	}

	public void display() {
		StringBuilder sb = new StringBuilder();

		sb.append("Strore ").append(name).append(": \n");
		for (int i = 0; i < listOrder.size(); i++) {
			sb.append(i + 1).append(". ").append(listOrder.get(i)).append("\n");
		}
		System.out.println(sb.toString());
		System.out.println("-------------------------------------------");
	}

}
