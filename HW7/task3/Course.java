package hw07.task3;

public enum Course {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);
	private int corse;

	private Course(int corse) {
		this.corse = corse;
	}

	public int getCorse() {
		return corse;
	}

	public void setCorse(int corse) {
		this.corse = corse;
	}

}
