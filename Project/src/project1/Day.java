package project1;

import java.io.IOException;

/**
 * @author Mykola Boieru
 *
 */
public class Day {
	private String name;
	private double income;
	private double utilities;
	private double food;
	private double house;
	private double medicine;
	private double cigarettes;
	private double entertainment;
	private double goodies;
	private String comment = "немає";
	
	
	/**
	 * Constructor for Day without comment
	 * @param name
	 * @param income
	 * @param utilities
	 * @param food
	 * @param house
	 * @param medicine
	 * @param cigarettes
	 * @param entertainment
	 * @param goodies
	 * @param comment
	 * @throws IOException
	 */
	public Day(String name, double income, double utilities, double food, double house, double medicine, 
			double cigarettes, double entertainment, double goodies, String comment) throws IOException{
		this.name = name;
		this.income = income;
		this.utilities = utilities;
		this.food = food;
		this.house = house;
		this.medicine = medicine;
		this.cigarettes = cigarettes;
		this.entertainment = entertainment;
		this.goodies = goodies;
		this.comment = comment;
	}
	
	/**
	 * Constructor for Day with comment
	 * @param name
	 * @param income
	 * @param utilities
	 * @param food
	 * @param house
	 * @param medicine
	 * @param cigarettes
	 * @param entertainment
	 * @param goodies
	 * @param coment
	 * @throws IOException
	 */
	public Day(String name, double income, double utilities, double food, double house, double medicine, 
			double cigarettes, double entertainment, double goodies) throws IOException{
		this.name = name;
		this.income = income;
		this.utilities = utilities;
		this.food = food;
		this.house = house;
		this.medicine = medicine;
		this.cigarettes = cigarettes;
		this.entertainment = entertainment;
		this.goodies = goodies;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public double getUtilities() {
		return utilities;
	}

	public void setUtilities(int utilities) {
		this.utilities = utilities;
	}

	public double getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public double getHouse() {
		return house;
	}

	public void setHouse(int house) {
		this.house = house;
	}

	public double getMedicine() {
		return medicine;
	}

	public void setMedicine(int medicine) {
		this.medicine = medicine;
	}

	public double getCigarettes() {
		return cigarettes;
	}

	public void setCigarettes(int cigarettes) {
		this.cigarettes = cigarettes;
	}

	public double getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(int entertainment) {
		this.entertainment = entertainment;
	}

	public double getGoodies() {
		return goodies;
	}

	public void setGoodies(int goodies) {
		this.goodies = goodies;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	/**
	 * method for count sum of expenses
	 * @param day
	 * @return double sum of expenses
	 */
	public double sum(Day day[]) {
		double sum = 0;
		sum += utilities + food + house + medicine + cigarettes + entertainment + goodies;
		return sum;
	}
	
	/**
	 * method for count sum of expenses of day
	 * @return double sum
	 */
	public double sumDay() {
		return utilities + food + house + medicine + cigarettes + entertainment + goodies;
	}
	
	/**
	 * method for count balance
	 * @return double (income - expenses)
	 */
	public double balance() {
		return income - (utilities + food + house + medicine + cigarettes + entertainment + goodies);
	}
	
	/**
	 * method for showing comments
	 */
	public void comments() {
		if(comment != "немає") {
			System.out.println("[" + name + "]" + "[" + comment + "]");
		}
	}
	
	/**
	 * Method for count sum of expenses for utilities, payment for Internet and telephone charges
	 * @param day
	 * @return double sum
	 */
	public double costUtilities(Day day[]) {
		double sum = 0;
		sum += utilities;
		return sum;
	}
	/**
	 * Method for count sum of expenses for food
	 * @param day
	 * @return double sum
	 */
	public double costFood(Day day[]) {
		double sum = 0;
		sum += food;
		return sum;
	}
	/**
	 * Method for count sum of expenses  for household goods
	 * @param day
	 * @return double sum
	 */
	public double costHouse(Day day[]) {
		double sum = 0;
		sum += house;
		return sum;
	}
	/**
	 * method for count sum of expenses for medicine(s)
	 * @param day
	 * @return double sum
	 */
	public double costMedicine(Day day[]) {
		double sum = 0;
		sum += medicine;
		return sum;
	}
	/**
	 * method for count sum of expenses for cigarettes
	 * @param day
	 * @return double sum
	 */
	public double costCigarettes(Day day[]) {
		double sum = 0;
		sum += cigarettes;
		return sum;
	}
	/**
	 * method for count sum of expenses for entertainment, rest, cinema etc.
	 * @param day
	 * @return double sum
	 */
	public double costEntertainment(Day day[]) {
		double sum = 0;
		sum += entertainment;
		return sum;
	}
	/**
	 * method for count sum of expenses for goodies
	 * @param day
	 * @return double sum
	 */
	public double costGoodies(Day day[]) {
		double sum = 0;
		sum += goodies;
		return sum;
	}
	
	/**
	 * method for sorting days by expenses
	 * @param day
	 */
	public static void sort(Day[] day) {
		Day temp;
		for (int i = 0; i < day.length; i++) {
			for (int j = i + 1; j < day.length; j++) {
				if (day[i].sum(day) < day[j].sum(day)) {
					temp = day[i];
					day[i] = day[j];
					day[j] = temp;
				}
			}
		}
		for(int i = 0; i < day.length; i++) {
			System.out.println(day[i].getName() + " = " + day[i].sum(day));
		}
	}
	
	/**
	 * method for averaging costs
	 * @param costs
	 */
	public static void average(double[] costs) {
		double average = 0;
		for(int i = 0; i < costs.length; i++) {
			average += costs[i];
		}
		average /= costs.length;
		System.out.println("Середні витрати на день складають: "+ average);
	}
	
	/**
	 * method for averaging costs without expenses for utilities
	 * @param costs
	 */
	public static void averageWithoutUtilities(double[] costs) {
		double averageWitUtil = 0;
		for(int i = 1; i < costs.length; i++) {
			averageWitUtil += costs[i];
		}
		averageWitUtil /= costs.length;
		System.out.println("Середні витрати (без урахування комунальних виплат) складають на день: " + averageWitUtil);
	}
	
	/**
	 * method for counting balance
	 * @param day
	 */
	public static void countBalance(Day[] day) {
		double balance = 0;
		for(int i = 0; i < day.length; i++) {
			balance += day[i].balance();
		}
		System.out.println("Залишок коштів на кінец тижня = " + balance);
	}
	    
	/**
	 * method for counting income
	 * @param day
	 */
	public static void countIncome(Day[] day) {
		double inc = 0;
		for(int i = 0; i < day.length; i++) {
			inc += day[i].getIncome();
		}
		System.out.println("Загальний дохід = " + inc);
	}
	     
	/**
	 * method for counting sum of all expenses
	 * @param day
	 */
	public static void countCostsSum(Day[] day) {
		double sumCosts = 0;
		for(int i = 0; i < day.length; i++) {
			sumCosts +=day[i].sumDay();
		}
		System.out.println("Загальна сума витат = " + sumCosts);
	}
	    
	/**
	 * method for showing expenses per day
	 * @param day
	 */
	public static void costOfDay(Day[] day) {
		for(int i = 0; i < day.length; i++) {
			System.out.println(day[i].name + " = " + day[i].sum(day));
		}
	}
	
	/**
	 * method for showing comment
	 * @param day
	 */
	public static void showComments(Day[] day) {
		for(int i = 0; i < day.length; i++) {
			if(day[i].comment != "немає") {
				System.out.println("[" + day[i].name + "]" + "[" + day[i].comment + "]");
			}
		}
	}
	
	@Override
	public String toString() {
		return "\n" + "[" + name + "]" + " " + "Дохід = " + income + ", комунальні послуги = " + utilities + ", харчування = " + food + 
				", госопдарські товари = " + house +", медицина = " + medicine + ", сигарети = " + cigarettes + ", відпочинок = " + 
				entertainment + ", смаколики = " + goodies + "[Коментар = " + comment + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cigarettes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		temp = Double.doubleToLongBits(food);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(entertainment);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(goodies);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(house);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(income);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(medicine);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(utilities);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Day other = (Day) obj;
		if (Double.doubleToLongBits(cigarettes) != Double.doubleToLongBits(other.cigarettes))
			return false;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (Double.doubleToLongBits(food) != Double.doubleToLongBits(other.food))
			return false;
		if (Double.doubleToLongBits(entertainment) != Double.doubleToLongBits(other.entertainment))
			return false;
		if (Double.doubleToLongBits(goodies) != Double.doubleToLongBits(other.goodies))
			return false;
		if (Double.doubleToLongBits(house) != Double.doubleToLongBits(other.house))
			return false;
		if (Double.doubleToLongBits(income) != Double.doubleToLongBits(other.income))
			return false;
		if (Double.doubleToLongBits(medicine) != Double.doubleToLongBits(other.medicine))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(utilities) != Double.doubleToLongBits(other.utilities))
			return false;
		return true;
	}

}
