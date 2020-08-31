package comparableComparator;

public class Laptop implements Comparable<Laptop> {
	
	String brand;
	int ram;
	double price;
	

	public Laptop(String brand, int ram, double price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}


	@Override
	public int compareTo(Laptop o) {
		// TODO Auto-generated method stub
		if(this.price < o.price)
			return 1;
		else 
			return -1;
	}


	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	

}
