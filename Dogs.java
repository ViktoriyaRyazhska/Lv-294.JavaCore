package HW3;

public class Dogs {
	public String name;
	public enum breed {poodle,collie,shepherd};
	public int age;
	static int old;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Dogs(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Dogs other = (Dogs) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Dogs [name=" + name + ", age=" + age + "]";
	}
	public static void maxNumber(int a,int b,int c) {
		int maxInt;
		
		if (a<=b){ maxInt = b; }
		    else {maxInt = a;}
		if (maxInt<=c){ maxInt = c;}
	
	   // System.out.println("MaxInt =  "+ maxInt);
		old = maxInt;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dogs d1= new Dogs("Ada", 2);
Dogs d2= new Dogs("Jerry", 3);
Dogs d3= new Dogs("Ada", 4);

String p = d1.getName(); 
String c = d2.getName(); 
String f = d3.getName(); 
String str1 = ((p == c)||(p==f)||(c==f))? "There is two dogs with the same name" : 
	                                      "There is no two dogs with the same name";

System.out.println(str1);

maxNumber(d1.getAge(),d2.getAge(),d3.getAge());


String nameOldDog=" ";
switch (old) {
    case 2:  nameOldDog = d1.getName();
             break;
    case 3:  nameOldDog = d2.getName();
             break;
    case 4:  nameOldDog = d3.getName();
             break;

}
System.out.println("Name of the oldest dog "+nameOldDog+  ".  It is " +old+ " years old" );
	}
	
	
}
