package variablesTypes;
class Employee
{
	//Static Variable
	public static String name;
	public static int age;
}

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee.name="Tejashree";
		Employee.age = 22;
		System.out.println(Employee.name);
		System.out.println(Employee.age);
		
	}

}
