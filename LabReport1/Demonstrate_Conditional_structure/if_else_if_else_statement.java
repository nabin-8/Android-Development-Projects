package Demonstrate_Conditional_structure;

import java.util.Scanner;

public class if_else_if_else_statement {
    public static void main(String[] args) {
        int y;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Your Percentage: ");
            y = input.nextInt();
            if (y >= 30 && y < 50) {
                System.out.println("YourMarks: pass");
                System.out.println("Your Percentage is: " + y);

            } else if (y >= 50 && y < 70) {
                System.out.println("YourMarks: good");
                System.out.println("Your Percentage is: " + y);
            } else if (y >= 70 && y < 90) {
                System.out.println("YourMarks: Distinsion");
                System.out.println("Your Percentage is: " + y);
            }

            else if (y >= 90 && y <= 100) {
                System.out.println("YourMarks: Exilent");
                System.out.println("Your Percentage is: " + y);
            } else {
                System.out.println("YourMarks: Fail");
                System.out.println("Your Percentage is: " + y);

            }
        }
    }
}
