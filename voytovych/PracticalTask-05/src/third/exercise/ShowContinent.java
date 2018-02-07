package third.exercise;

public class ShowContinent {

	public static void output(String country) {
		
		switch (country) {
		case "shanghai":
		case "delhi":
		case "mumbai":
		case "moscow":
			System.out.println("The country is in " + Continents.Asia.getNameOfContinent());
			break;
		case "london":
		case "berlin":
		case "madrid":
		case "kiev":
			System.out.println("The country is in " + Continents.Europe.getNameOfContinent());
			break;
		case "luanda":
		case "nairobi":
		case "mogadishu":
		case "alexandria":
			System.out.println("The country is in " + Continents.Africa.getNameOfContinent());
			break;
		case "sydney":
		case "melbourne":
		case "perth":
		case "adelaide":
			System.out.println("The country is in " + Continents.Australia.getNameOfContinent());
			break;
		case "mexico":
		case "new york":
		case "toronto":
		case "chicago":
			System.out.println("The country is in " + Continents.NorthAmerica.getNameOfContinent());
			break;
		case "lima":
		case "bogota":
		case "caracas":
		case "campinas":
			System.out.println("The country is in " + Continents.SouthAmerica.getNameOfContinent());
			break;

		default:
			System.out.println("Invalid country name!");
			break;
		}
		
	}

}
