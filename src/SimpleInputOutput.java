/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//import classes
import java.util.Scanner; //import Scanner class
/**
 *
 * @author Instructor Base code
 */
public class SimpleInputOutput {

    public static void main(String[] args) {
        //variable declaration
        Scanner cin = new Scanner(System.in); //declare scanner object

        //declare named constants
        final int SECRET = 11;
        final double RATE = 12.50;

        // declare variables
        int num1;
        int num2;
        int newNum;
        String name;
        double hoursWorked;
        double wages;

        //executable statements

        // User Input - Input Two Integers
        System.out.println("Enter a value for num1 and num2. Press enter after each value selected.");
        num1 = cin.nextInt();
        num2 = cin.nextInt();

        // Display num1 and num2
        System.out.println("The value of num1 = " + (num1));
        System.out.println("The value of num2 = " + (num2));


        // Calculate new Num
        newNum = (num1 * 2) + num2;
        System.out.println(newNum);


        // Update New Num
        newNum = (SECRET);
        System.out.println("The value of newNum has been updated");
        System.out.println(newNum);

        // Input Hours Worked
        System.out.println("Enter a decimal number between 0 and 70");
        hoursWorked = cin.nextDouble();

        // Calculate Wages
        wages = (RATE * hoursWorked);
        System.out.println("Wages: $" + (wages));

        // Display Employee Information
        System.out.println("Enter your name.");
        name = cin.next();
        System.out.println("Name:" + (name));
        System.out.println("Pay Rate: $" + (RATE));
        System.out.println("Hours Worked:" + (hoursWorked));
        System.out.println("Salary: $" + (wages));





        
    }

}
