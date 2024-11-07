package activity;
public class EmployeeDetails {
	static int eid;
	static String ename;
	static String companyname="TCS";


 static void DisplayEmp(int eid, String ename) {
	 System.out.println("Employee ID: "+ eid);
	 System.out.println("Employee name: "+ ename);
	 System.out.println("Company Name: "+ companyname);
 }
 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		EmployeeDetails.DisplayEmp(101,"Teju");
		

		EmployeeDetails.DisplayEmp(102, "Tejashree");
		
	}

}

