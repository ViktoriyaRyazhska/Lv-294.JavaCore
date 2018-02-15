package Task2;

public  class Employee extends Object {
   public String employeeId;
   public String name;
   
   public Employee(String id, String name) {
       this.employeeId = id;
       this.name = name;
   }
   
   @Override
    public String toString() {
        return "Id: " + employeeId + ", Name: " + name;
    }
}