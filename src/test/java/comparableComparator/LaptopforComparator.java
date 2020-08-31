package comparableComparator;

public class LaptopforComparator  {
	
	String brand;
	int ram;
	double price;
	

	public LaptopforComparator(String brand, int ram, double price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}


	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}


	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}


	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}


	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	

}
