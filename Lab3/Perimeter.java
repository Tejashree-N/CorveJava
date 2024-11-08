package activity;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int choice;
        double perimeter;
        
        do {
            System.out.println("\n--- Perimeter Calculation Menu ---");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: // Square
                    System.out.print("Enter the side length of the square: ");
                    double side = sc.nextDouble();
                    perimeter = 4 * side;
                    System.out.println("Perimeter of the square: " + perimeter);
                    break;
                
                case 2: // Rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = sc.nextDouble();
                    perimeter = 2 * (length + width);
                    System.out.println("Perimeter of the rectangle: " + perimeter);
                    break;
                
                case 3: // Circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    perimeter = 2 * Math.PI * radius;
                    System.out.println("Perimeter (Circumference) of the circle: " + perimeter);
                    break;
                
                case 4: // Exit
                    System.out.println("Exiting the program.");
                    break;
                
                default: // Invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } while (choice != 4);
        
    }
}
