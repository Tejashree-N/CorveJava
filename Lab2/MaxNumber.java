package activity;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
      //Enter the first number
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        //Enter the second number
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Use the ternary operator to find the maximum number
        int max = (num1 > num2) ? num1 : num2;

        // Display the maximum number
        System.out.println("The maximum number is: " + max);
        sc.close();
    }
}
