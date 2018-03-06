package project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		Day[] day = new Day[7];
		
		day[0] = new Day("Понеділок", 2700, 2285, 200,   0,   0, 28,  69,   0, "Опалення, електрика, вода, газ");
		day[1] = new Day("Вівторок",     0,  100,  34,  65,   0,  0,  55,  56, "Телефон");
		day[2] = new Day("Середа",       0,    0,  63,   0,   0, 28,   0,  52);
		day[3] = new Day("Четвер",       0,    0, 118, 170, 476, 28, 120, 132);
		day[4] = new Day("П'ятниця",     0,    0, 369, 107,   0,  0,   0,  70);
		day[5] = new Day("Субота",    2685,    0,  64,  56,   0, 28,  30,  10, "Ще щось");
		day[6] = new Day("Неділя",       0,    0,  60,  24,   0, 28,   0,   0);
		
		double[] costs = new double[7];
		for(int i = 0; i < day.length; i++) {
		costs[0] += day[i].costUtilities(day);
		costs[1] += day[i].costFood(day);
		costs[2] += day[i].costHouse(day);
		costs[3] += day[i].costMedicine(day);
		costs[4] += day[i].costCigarettes(day);
		costs[5] += day[i].costEntertainment(day);
		costs[6] += day[i].costGoodies(day);
		}
		
		Map<String, Double> mapCosts = new HashMap<String, Double>();
		mapCosts.put("Комунальні витрати", costs[0]);
		mapCosts.put("Витрати на харчування", costs[1]);
		mapCosts.put("Витрати на господарські товари", costs[2]);
		mapCosts.put("Витрати на медицину", costs[3]);
		mapCosts.put("Витрати на сигарети", costs[4]);
		mapCosts.put("Витрати на відпочинок", costs[5]);
		mapCosts.put("Витрати на смаколики", costs[6]);
		
		int number = 0;
		while(number < 999) {
			++number;
			
		try {
		String fileName = "C:\\Users\\1\\eclipse-workspace\\Project\\src\\project1\\help.txt";
		FileReader fr = null;
		BufferedReader bb = null;
		fr = new FileReader(fileName);
		bb = new BufferedReader(fr);
		String help = null;
		
			System.out.println("Введіть команду");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String comand = br.readLine();
			
			switch(comand.toLowerCase()) {
			
			case "витрати дні" : Day.costOfDay(day);
				break;
			case "витрати сума" : Day.countCostsSum(day);
			     break;
			case "дохід сума" : Day.countIncome(day);
			    break;
			case "баланс" : Day.countBalance(day);
				break;
			case "витрати комунальні" : System.out.println("Витрати на оплату комунальних послуг = " + costs[0]);
				break;
			case "витрати харчування" : System.out.println("Витрати на харчування = " + costs[1]);
				break;
			case "витрати господарські" : System.out.println("Витрати на господарскі товари = " + costs[2]);
				break;
			case "витрати медицина" : System.out.println("Витрати на медицину = " + costs[3]);
				break;
			case "витрати сигарети" : System.out.println("Витрати на сигарети = " + costs[4]);
				break;
			case "витрати відпочинок" : System.out.println("Витрати на відпочинок = " + costs[5]);
				break;
			case "витрати смаколики" : System.out.println("Витрати на смаколики = " + costs[6]);
				break;
			case "коментарі" : Day.showComments(day);
				break;
			case "витрати категорії" : 
				for (Iterator i = mapCosts.entrySet().iterator(); i.hasNext();) {
					   Map.Entry entry = (Map.Entry) i.next();
					   System.out.println(entry.getKey() + " = " + entry.getValue());
					};
					break;
			case "витрати сортувати" : Day.sort(day);
				break;
			case "витрати середні" : Day.average(costs);
				break;
			case "витрати середні без комунальних" : Day.averageWithoutUtilities(costs);
				break;
			case "допомога" : while((help = bb.readLine()) != null) {
				System.out.println(help);
			}
			
			bb.close();
			break;
			case "дні" : System.out.println(Arrays.toString(day));
			break;
			default : System.out.println("Введіть команду коректно. Щоб дізнатись про наявні команди, введіть \"допомога\".");
			break;
			}
		
		} catch(IOException e) {
				System.err.println(e.getMessage());
			}
		
		}
	}
}