package second.exercise;

import java.util.Map;

public class Show {
	public static void output(Map<String, String> map) {
		StringBuilder surnameAndInitials = new StringBuilder();
		StringBuilder nameMiddleNameLastName = new StringBuilder();
		surnameAndInitials.append(map.get("surname") + " " + String.valueOf(map.get("name").charAt(0)) + "."
				+ String.valueOf(map.get("patronymic").charAt(0)) + ".");
		nameMiddleNameLastName.append(map.get("name") + " " + map.get("patronymic") + " " + map.get("surname"));

		System.out.println("Surnames and initials: \"" + surnameAndInitials + "\"");
		System.out.println("Name: \"" + map.get("name") + "\"");
		System.out.println("Name, middle name and last name: \"" + nameMiddleNameLastName + "\"");
	}
}
