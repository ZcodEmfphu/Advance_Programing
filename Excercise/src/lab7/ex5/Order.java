package lab7.ex5;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private String id;
	private Supplier supplier;
	private List<Product> listProduct;

	public Order(String id, Supplier supplier) {
		super();
		this.id = id;
		this.supplier = supplier;
		this.listProduct = new ArrayList<Product>();
	}

	public String getId() {
		return id;
	}

	public List<Product> getListProduct() {
		return listProduct;
	}

	public boolean findProduct(Product product) {
		for (Product items : listProduct) {
			if (items.getSku().equals(product.getSku())) {
				return true;
			}
		}
		return false;
	}

	public void addProduct(Product product, int quanlity) {
		listProduct.add(product);
		product.updateQuanlity(quanlity);
	}

	public void display() {
		StringBuilder sb = new StringBuilder();

		sb.append("Bill of ").append(supplier.getName()).append(": \n");
		for (int i = 0; i < listProduct.size(); i++) {
			sb.append(i + 1).append(". ").append(listProduct.get(i)).append("\n");
		}
		System.out.println(sb.toString());
		System.out.println("-------------------------------------------");
	}

	@Override
	public String toString() {
		return "Order [supplier:" + supplier + "\n" + listProduct + "]";
	}

}
