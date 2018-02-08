package task3;

import java.util.Scanner;

public class Country {

	public static void main(String[] args) {
	
		System.out.println("Enter the name of the country");
		Scanner s = new Scanner(System.in);
		String country = s.nextLine();
		
		Continents continents;
		
		switch (country) {
		case "Ukraine": case "Germany": case "France": case "UK": case "Romania":
			continents = Continents.EUROPE;
			System.out.println(country + " is in " + continents);
			break;
		case "China": case "India": case "Japan": case "Israel":
			continents = Continents.ASIA;
			System.out.println(country + " is in " + continents);
		break;
		case "Egypt": case "Algeria": case "Nigeria":
			continents = Continents.AFRIKA;
			System.out.println(country + " is in " + continents);
		break;
		case "USA": case "Canada": case "Mexico":
			continents = Continents.NORTHAMERICA;
			System.out.println(country + " is in " + continents);
			break;
		case "Brazil": case "Colombia": case "Peru":
			continents = Continents.SOUTHAMERICA;
			System.out.println(country + " is in " + continents);
		case "Australia": case "New Zeeland":
			continents = Continents.AUSTRALIA;
			System.out.println(country + " is in " + continents);
		break;
		default:
			System.out.println("Please enter name of another country");
		}
		
	}

}
