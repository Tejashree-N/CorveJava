package activity;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year To Check Whether it's Leap year or not:");
		
		int Year= sc.nextInt();
		Boolean LeapYear= (Year % 4 == 0 || Year % 400 == 0);
		if(LeapYear) {
			System.out.println(Year +" It is A Leap Year");
		}
		else {
			System.out.println(Year +" It is not A Leap Year");
		}
	}

}
