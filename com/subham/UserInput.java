package com.subham;
import java.util.Scanner;   // importing external code

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner ok = new Scanner(System.in);    // "in" means input stream - wants to take input from the user
//        System.out.print("Enter number1: ");
//        int num1 = ok.nextInt();
//        System.out.print("Enter number2: ");
//        int num2 = ok.nextInt();
//        System.out.println(num1+num2);

//        System.out.print("Enter the number: ");
//        boolean b1 = ok.hasNextInt();   // stores boolean value
//        System.out.println("Is the given number integer? ");
//        System.out.println(b1);

//        String str1 = ok.next();      // prints only one word before the first space
//        System.out.println(str1);
        String str2 = ok.nextLine();    // prints the entire line
        System.out.println(str2);


    }
}
