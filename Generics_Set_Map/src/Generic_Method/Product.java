package Generic_Method;

public class Product implements Comparable<Product>{

	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	public int compareTo(Product other) {
		return price.compareTo(other.getPrice());
	}

}