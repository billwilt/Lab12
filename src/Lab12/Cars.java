package Lab12;

public class Cars {
	
	private String make = "";
	private String model = "";
	private int year = 0;
	private double price = 0.00;
	private String newUsed = "";
	private double milage = 0.00;
	
	// No arguments constructor
	//public Cars() {
	//}
	

	public Cars(String make, String model, int year, double price, String newUsed, double milage) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.newUsed = newUsed;
		this.milage = milage;
	}





	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}
	
	public String getNewUsed() {
		return newUsed;
	}

	public void setNewUsed(String newUsed) {
		this.newUsed = newUsed;
	}

	@Override
	public String toString() {
		return make + "\t " + model + "\t " + year + "\t " + price + "\t " + newUsed + "\t\t " + milage;
	}

//	@Override
//	public String toString() {
//		return "Cars [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + ", newUsed="
//				+ newUsed + ", milage=" + milage + "]";
//	}

	
	
	
	
	

}
