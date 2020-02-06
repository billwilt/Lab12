package Lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		boolean boughtCarYet = false;
		String choice = "";
		String yesno = "";
		
		List <Cars> carsForSale = new ArrayList<Cars>();
		
		Cars c1 = new Cars("Nikolai", "Fusionly", 2020, 54999.90, "New", 00005.8);
		carsForSale.add(c1);
		Cars c2 = new Cars("Fourd", "Escapade", 2020, 31999.90, "New", 00015.1);
		carsForSale.add(c2);
		Cars c3 = new Cars("Chewie", "Vetteroni", 2020, 44989.20, "New", 00007.6);
		carsForSale.add(c3);
		Cars c4 = new Cars("Hyonda", "Priority", 2017, 14795.50, "Used",  35987.6);
		carsForSale.add(c4);
		Cars c5 = new Cars("Grand", "Chirpus", 2016, 18500.00, "Used", 12345.0);
		carsForSale.add(c5);
		Cars c6 = new Cars("Circus", "Witherell", 2015, 14450.00, "Used", 3500.3);
		carsForSale.add(c6);
		
		System.out.println("Welcome to the Grand Circus Motors!");
		System.out.println();
		
		System.out.println("Brand \t Model \t\t Year \t Price \t\tNew/Used\tMilage");
		System.out.println("-------\t-------\t\t-------\t -------\t------\t\t-------");
		
		for (Cars c : carsForSale) {
			System.out.println(c);
		}
		
		
		do {
			System.out.println();
		System.out.println("Which car would you like, please enter the brand name? ");
		choice = scnr.nextLine();
		
		if (choice.equalsIgnoreCase("nikolai")) {
			System.out.println(c1);
			
			boughtCarYet = true;
		} else if (choice.equalsIgnoreCase("fourd")) {
			System.out.println(c2);
			
			boughtCarYet = true;
		} else if (choice.equalsIgnoreCase("chewie")) {
			System.out.println(c3);
			
			boughtCarYet = true;
		} else if (choice.equalsIgnoreCase("hyonda")) {
			System.out.println(c4);
			
			boughtCarYet = true;
		} else if (choice.equalsIgnoreCase("grand")) {
			System.out.println(c5);
			
			boughtCarYet = true;
		} else if (choice.equalsIgnoreCase("circus")) {
			System.out.println(c6);
			
			boughtCarYet = true;
		} else {
			System.out.print("Sorry we dont have that brand. Please choose another.");
		}
		} while (boughtCarYet == false);
		
		System.out.print("Would you like to buy this car? y/n: ");
		yesno = scnr.next();
		if (yesno.equalsIgnoreCase("y")) {
			System.out.println("Excellent! Our finance department will be in touch shortly.");
		} else {
			System.out.println("Thanks for visiting our dealership.");
		}
		for (int k=1; k<6; ++k) {
			if (choice.equalsIgnoreCase("circus")) {
				System.out.println(c6);
			}
		}
		
	}
	
	
}