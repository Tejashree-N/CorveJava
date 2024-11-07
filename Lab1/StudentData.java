package controlFlow;

import java.util.Scanner;

class Student {
    private int[] marks = new int[5];

 

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public int getTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double getAverage() {
        return (double) getTotal() / marks.length;
    }

    public char getGrade() {
        double avg = getAverage();

        if (avg >= 90) {
            return 'A';
        } else if (avg >= 80) {
            return 'B';
        } else if (avg >= 70) {
            return 'C';
        } else if (avg >= 60) {
            return 'D';
        } else {
            return 'F';
        }
        
        
    }

    public void displayResults() {
        System.out.println("Total Marks: " + getTotal());
        System.out.printf("Average Marks: %.2f%n", getAverage());
        System.out.println("Grade: " + getGrade());
    }
}

public class StudentData {
    public static void main(String[] args) {


        Student student = new Student();
        student.inputMarks();
        student.displayResults();
        
       
    }
}
