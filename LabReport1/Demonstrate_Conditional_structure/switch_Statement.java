package Demonstrate_Conditional_structure;

import java.util.Scanner;

public class switch_Statement {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number from(0-to-4)");
        i = sc.nextInt();
        switch (i) {
            case 0:
                System.out.println("i is0");
                break;
            case 1:
                System.out.println("Dilip");
                break;

            default:
                break;
        }
    }
}
