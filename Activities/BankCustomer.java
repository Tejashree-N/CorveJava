package activity;

public class BankCustomer {
	int AcNo;
	String AcType;
	double AcAmt;//Amount in the account
	
	//creating Parameterized Constructor
	BankCustomer(int AcNo, String AcType, double Acamt){
		this.AcNo = AcNo;
		this.AcType = AcType;
		this.AcAmt = Acamt;
		
	}
	
	void display() {
		System.out.println("Account Number: "+ AcNo +"\n"+"Account Type: "+ AcType +"\n"+ "Amount in the Account: " + AcAmt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankCustomer c1= new BankCustomer(10001,"Saving", 300000);
		 BankCustomer c2= new BankCustomer(10002,"Current", 50000);
		 
		 c1.display();
		 c2.display();
		 

	}

}
