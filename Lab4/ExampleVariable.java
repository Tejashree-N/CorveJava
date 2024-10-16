package variablesTypes;
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

public class ExampleVariable {
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
		
		Employee1 e6 = new Employee1();
		e6.name = "arpita";
		e6.id = 6;
		e6.age = 25;
		e6.salary = 90000;
		
		Employee1 e7 = new Employee1();
		e7.name = "ram";
		e7.id = 7;
		e7.age = 24;
		e7.salary = 30000;
		
		Employee1 e8 = new Employee1();
		e8.name = "rohit";
		e8.id = 8;
		e8.age = 23;
		e8.salary = 40000;
		
		Employee1 e9 = new Employee1();
		e9.name = "sham";
		e9.id = 9;
		e9.age = 18;
		e9.salary = 120000;
		
		Employee1 e10 = new Employee1();
		e10.name = "shivam";
		e10.id = 10;
		e10.age = 23;
		e10.salary = 13000;
		
		System.out.println("id:"+e1.id+" "+"name:"+e1.name+" "+"age:"+e1.age+" "+"salary:"+e1.salary);
		System.out.println("id:"+e2.id+" "+"name:"+e2.name+" "+"age:"+e2.age+" "+"salary:"+e2.salary);
		System.out.println("id:"+e3.id+" "+"name:"+e3.name+" "+"age:"+e3.age+" "+"salary:"+e3.salary);
		System.out.println("id:"+e4.id+" "+"name:"+e4.name+" "+"age:"+e4.age+" "+"salary:"+e4.salary);
		System.out.println("id:"+e5.id+" "+"name:"+e5.name+" "+"age:"+e5.age+" "+"salary:"+e5.salary);
		System.out.println("id:"+e6.id+" "+"name:"+e6.name+" "+"age:"+e6.age+" "+"salary:"+e6.salary);
		System.out.println("id:"+e7.id+" "+"name:"+e7.name+" "+"age:"+e7.age+" "+"salary:"+e7.salary);
		System.out.println("id:"+e8.id+" "+"name:"+e8.name+" "+"age:"+e8.age+" "+"salary:"+e8.salary);
		System.out.println("id:"+e9.id+" "+"name:"+e9.name+" "+"age:"+e9.age+" "+"salary:"+e9.salary);
		System.out.println("id:"+e10.id+" "+"name:"+e10.name+" "+"age:"+e10.age+" "+"salary:"+e10.salary);


		
		

		
		
		
		
		
	}

}
