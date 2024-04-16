package lab7.ex3;

public class Products {

	private String id;
	private String name;
	private double price;
	private int quality;

	public Products(String id, String name, double price, int quality) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quality = quality;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuality() {
		return quality;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + ", quality=" + quality + "]";
	}

}
