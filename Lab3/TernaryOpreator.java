package sample;

import java.util.Scanner;

public class TernaryOpreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks");
		
		double mark = sc.nextDouble();
		
		String result=(mark>=50)?"pass":"Fail";
		
		System.out.println("You"+" "+result+" In the Exam");


	}

}
