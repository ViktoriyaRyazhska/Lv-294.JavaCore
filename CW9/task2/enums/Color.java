package cw09.task2.enums;

public enum Color {
	RED("red"), BLUE("blue"), YELLOW("yellow"), PINK("pink");
	private String name;

	private Color(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
