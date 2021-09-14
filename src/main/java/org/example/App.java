package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 *
 */
public class App 
{
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double Weight;
        double Height;

        while (true){
            System.out.print("Enter your body weight (in pounds): ");
            String Pounds = input.nextLine();
            if (isNumeric(Pounds)){
                Weight = Double.parseDouble(Pounds);
                break;
            }
            else{
                System.out.print("Sorry the value that you entered is non-numeric. Please try again.\n");
            }
        }

        while (true){
            System.out.print("Enter your height (in inches): ");
            String H = input.nextLine();
            if (isNumeric(H)){
                Height = Double.parseDouble(H);
                break;
            }
            else{
                System.out.print("Sorry the value that you entered is non-numeric. Please try again.\n");
            }
        }

        double BMI = ((Weight / (Height*Height)) * 703);
        if(BMI>= 18.5 && BMI <=25){
            System.out.printf("Your BMI is %f. \nYou are within the ideal weight range ", BMI);
        }
        else if(BMI < 18.5){
            System.out.printf("Your BMI is %f. \nYou are underweight. You should see a doctor. ", BMI);
        }
        else{
            System.out.printf("Your BMI is %f. \nYou are overweight. You should see a doctor. ", BMI);
        }
        

    }
}
