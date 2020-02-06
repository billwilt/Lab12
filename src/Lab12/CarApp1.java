package Lab12;

import java.util.ArrayList;
import java.util.Scanner;


public class CarApp1 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int numOfCars = 0;
		
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		
		ArrayList<Car> autos = new ArrayList<>();
		System.out.print("How many cars are you entering: ");
		numOfCars = scnr.nextInt();
		scnr.nextLine(); // clear scanner
		
		for (int i = 0; i < numOfCars; ++i) {
			System.out.println("Enter car #" + (i+1) + " make: ");
			String make = scnr.nextLine();
			System.out.println("Enter car #" + (i+1) + " model: ");
			String model = scnr.nextLine();
			System.out.println("Enter car #" + (i+1) + " year: ");
			int year = scnr.nextInt();
			System.out.println("Enter car #" + (i+1) + " price: ");
			double price = scnr.nextDouble();
			
			Car newCar = new Car(make, model, year, price);
			autos.add(newCar);
			
			scnr.nextLine(); // clear scanner
		}
		
		//DecimalFormat df = new DecimalFormat("#.00");
		
		
		for (Car c : autos) {
			System.out.println(c.getMake() + " " + c.getModel() + " " + c.getYear() + " $" + (String.format( "%.2f", c.getPrice())));
		}

		scnr.close();
	}

	
}
