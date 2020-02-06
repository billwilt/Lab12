package Lab12;

public class Car {
	
	private String make = "";
	private String model = "";
	private int year = 0;
	private double price = 0.00;
	
	// No arguments constructor
	public Car() {
	}
	
	// Constructor with 4 arguments
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	// Getters/Setters for make
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	// Getters/Setters for model
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// Getters/Setters for year
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Getters/Setters for price
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	
	
	

}
