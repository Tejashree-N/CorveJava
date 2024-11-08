package activity;
class User {
 int id;
 String name;

 public User(int id, String name) {
     this.id = id;
     this.name = name;
 }


 public void displayUser() {
     System.out.println("User ID: " + id);
     System.out.println("User Name: " + name);
 }
}

class Employee extends User {
	double salary;

 public Employee(int id, String name, double salary) {
     super(id, name);
     this.salary = salary;
 }

 
 public double calculateAnnualSalary() {
     return salary * 12;
 }

public void displayEmployee() {
     displayUser();
     System.out.println("Monthly Salary: " + salary);
     System.out.println("Annual Salary: " + calculateAnnualSalary());
 }
}

public class AnnulSalary {
	public static void main(String[] args) {
        Employee emp = new Employee(101, "tejashree", 50000.0);
        emp.displayEmployee();
    }
	

}
