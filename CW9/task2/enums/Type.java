package cw09.task2.enums;

public enum Type {
	LILY("lily"), ROSE("rose"), VIOLET("violet"), CARNATION("carnation");
	private String name;

	private Type(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
