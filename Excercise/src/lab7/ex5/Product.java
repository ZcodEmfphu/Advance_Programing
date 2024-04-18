package lab7.ex5;

public class Product {

	private String sku;
	private String name;
	private int quanlity;

	public Product(String sku, String name) {
		super();
		this.sku = sku;
		this.name = name;
		this.quanlity = 0;
	}

	public String getSku() {
		return sku;
	}

	public String getName() {
		return name;
	}

	public int getQuanlity() {
		return quanlity;
	}

	public void addQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}

	public void updateQuanlity(int quanlity) {
		this.quanlity += quanlity;
	}

	@Override
	public String toString() {
		return "\nProduct [sku:" + sku + ", name:" + name + ", quanlity:" + quanlity + "]";
	}

}
