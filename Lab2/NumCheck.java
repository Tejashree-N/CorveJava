package activity;

import java.util.Scanner;

public class NumCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Enter a bit position
        System.out.print("Enter the bit position to check: ");
        int n = sc.nextInt();
        
        //nth bit is set using a bitwise operation
        boolean isSet = (num & (1 << n)) != 0;
        if (isSet) {
            System.out.println("The " + n + "th bit of " + num + " is SET (1).");
        } else {
            System.out.println("The " + n + "th bit of " + num + " is NOT SET (0).");
        }
        sc.close();
    }
}
