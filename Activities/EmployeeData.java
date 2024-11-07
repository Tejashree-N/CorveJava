package variables;
class Employee1
{
	//Static Variable
	public  int id;
	public String name;
	public int age;
	public int salary;
	

	public void display()
    {
      
      System.out.println(id);
      System.out.println(name);
      System.out.println(age);
      System.out.println(salary);
    }
	
}


public class EmployeeData {
	
	public static void main(String[] args)
	{
		System.out.println("the employee details are:");
		
		Employee1 e1 = new Employee1();
		e1.name = "teju";
		e1.id = 1;
		e1.age = 22;
		e1.salary = 80000;

		Employee1 e2 = new Employee1();
		e2.name = "tejashree";
		e2.id = 2;
		e2.age = 21;
		e2.salary = 70000;
		
		Employee1 e3 = new Employee1();
		e3.name = "rohan";
		e3.id = 3;
		e3.age = 23;
		e3.salary = 60000;
		
		Employee1 e4 = new Employee1();
		e4.name = "komal";
		e4.id = 4;
		e4.age = 21;
		e4.salary = 50000;
		
		Employee1 e5 = new Employee1();
		e5.name = "amit";
		e5.id = 5;
		e5.age = 21;
		e5.salary = 20000;
		
		
		System.out.println("id:"+e1.id+" "+"name:"+e1.name+" "+"age:"+e1.age+" "+"salary:"+e1.salary);
		System.out.println("id:"+e2.id+" "+"name:"+e2.name+" "+"age:"+e2.age+" "+"salary:"+e2.salary);
		System.out.println("id:"+e3.id+" "+"name:"+e3.name+" "+"age:"+e3.age+" "+"salary:"+e3.salary);
		System.out.println("id:"+e4.id+" "+"name:"+e4.name+" "+"age:"+e4.age+" "+"salary:"+e4.salary);
		System.out.println("id:"+e5.id+" "+"name:"+e5.name+" "+"age:"+e5.age+" "+"salary:"+e5.salary);
		
	}
		

}
