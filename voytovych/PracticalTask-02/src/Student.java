
public class Student {

	private String name;
	private int rating;

	private static int sum = 0;
	private static int count = 0;

	public Student() {
		count++;
	}

	public Student(String name, int rating) {

		this.name = name;
		this.rating = rating;
		count++;
		sum = sum + rating;
	}

	public Student(String name) {

		this.name = name;
		count++;
	}

	public boolean betterStudent(Student s) {

		return this.rating > s.getRating();
	}
	
	public static double avgRating() {
		return ((double)sum) / count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		sum = sum - this.rating;
		this.rating = rating;
		sum = sum + this.rating;
	}
	
	@Override
	public String toString() {
		return "Name " + name;
	}

}
