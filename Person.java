
public class Person {
	private String name;
	int birthYear;

	public Person() {}
	
    public Person (String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
	
	public Person (String name) {
	this.name = name;	
	}
	
	public String getName() {
		return name;
		}
	
	public void setName(String name) {
		this.name = name;
		}
	
	public void setBirthYear (int birthYear) {
		this.birthYear = birthYear;
		}
	
	public int getBirthYear() {
	return birthYear;
	}
	
/*	public static int getCurrentYear()
	{
		java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
		calendar.setTime(new java.util.Date());
		return calendar.get(java.util.Calendar.YEAR);
	}
	public static  void age (Person pr) {
		int ageOfPerson = getCurrentYear()-pr.getBirthYear();
		System.out.println("Age of "+ pr.getName() + " = " + ageOfPerson );
		}
	public static void output (Person pr) {	
		System.out.println("Person name = " + pr.getName() + ", birth of year =" + pr.birthYear);
		}
	
	
	public static Person    input (String name,int birthYear) {
		Person person5 = new Person();
		person5.setName(name);
		person5.setBirthYear(birthYear);
		return (person5);
	}
	public static  void  input()  throws IOException {
	    BufferedReader br = new BufferedReader(	new InputStreamReader(System.in));
	    Person person5 = new Person();
	System.out.println("Input name");
	String name = br.readLine();
	person5.setName(name);
	System.out.println("Input birthYear");
	String birthYear = br.readLine();
	int m1 = Integer.parseInt(birthYear);
	person5.setBirthYear(m1);
	}	

	public static void changeNane(Person pr, String newPersonName) {
		pr.setName(newPersonName);
		}
*/	
}
