package hw08;

import hw08.task3.Currency;

//import hw08.task1.Sentence;
//import hw08.task2.SpaceCutter;

public class Main {

	public static void main(String[] args) {

		// Sentence s = new Sentence();
		// s.start();
		// String sentence = "I    am      learning     Java   Core";
		// System.out.println(sentence);
		// SpaceCutter cutter = new SpaceCutter(sentence);
		// // cutter.cutt1();
		// cutter.cutt2();
		// System.out.println(cutter.getSentence());
		String text = "If one $$1488.04 $12,34 $158.786pattern $100.01 is followed $0.50by another, the two 88 1488patterns must $8736 match consecutively";
		Currency currency = new Currency(text);
		currency.displayUS();
	}

}
