package lab7.ex5;

import java.util.ArrayList;
import java.util.List;

public class Supplier {

	private String id;
	private String name;
	private String address;
	private List<Product> listProduct;

	public Supplier(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.listProduct = new ArrayList<Product>();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public List<Product> getListProduct() {
		return listProduct;
	}

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", address=" + address + ", listProduct=" + listProduct + "]";
	}
	
	
}
