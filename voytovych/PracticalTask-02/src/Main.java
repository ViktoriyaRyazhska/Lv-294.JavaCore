
public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Igor", 5);
		Student s2 = new Student("Olya");
		s2.setRating(4);
		Student s3 = new Student();
		s3.setName("Ivan");
		s3.setRating(3);

		System.out.println(Student.avgRating());
		System.out.println(s1);

	}

}
