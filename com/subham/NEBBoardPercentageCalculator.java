package com.subham;
import java.util.Scanner;

public class NEBBoardPercentageCalculator {
    /*
    public static void percentage_calculator(float a, float b, float c, float d, float e){
        System.out.println("The percentage of the student is: " + ((a+b+c+d+e)/500 * 100) + "%");
    }

    public static void GPA_calculator(float a, float b, float c, float d, float e){
        System.out.println("The GPA of the student is: " + ((a+b+c+d+e)/500 * 4));
    }

    public static void km_into_miles_calculator(float dis){
        System.out.println("The distance in miles is: " + (dis*0.62) + " miles");
    }
    */


    public static void main(String[] args) {
        /*
        System.out.println("NEB Board Percentage Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of computer: ");
        float marks_computer= sc.nextFloat();
        System.out.print("Enter the marks of english: ");
        float marks_english= sc.nextFloat();
        System.out.print("Enter the marks of maths: ");
        float marks_maths = sc.nextFloat();
        System.out.print("Enter the marks of science: ");
        float marks_science= sc.nextFloat();
        System.out.print("Enter the marks of social: ");
        float marks_social= sc.nextFloat();

        percentage_calculator(marks_computer,marks_maths,marks_english,marks_social,marks_science);
        GPA_calculator(marks_computer,marks_maths,marks_english,marks_social,marks_science);

        // Convert Kilometer into miles
        System.out.println("Kilometer into miles Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        float distance = sc.nextFloat();
        km_into_miles_calculator(distance);

        // Detect if integer

        System.out.println("Detect if integer");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        boolean num = sc.hasNextInt();
        if (num)
        {
            System.out.println("The given value is a valid integer");
        }
        else
        {
            System.out.println("Invalid");
        }
        */

        int marks1 = 45;
        int marks2 = 95;
        int marks3 = 48;
        float cgpa = (float) (marks1 + marks2 + marks3)/30;     // Typing casting
        System.out.println(cgpa);
    }
}




