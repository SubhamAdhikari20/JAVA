package com.subham;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        /*
        int i = 23;
        int a = i++;    // first "a" is assigned "i" then "i" is incremented
        System.out.println(a);
        System.out.println(a);
        int b = ++i;    // first "i" is incremented then "b" is assigned "i"
        System.out.println(b);
        System.out.println(b);
        */

        // Q.1
//        float a = (float) 7/4 * 9/2;
/*        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);  */

        // Q.2
        // Encrypt
        /*
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // Decrypt
        grade = (char) (grade - 8);
        System.out.println(grade);
        */

        // Q.3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int user_num = sc.nextInt();
        int given_num = 45;
        if (given_num > user_num)
        {
            System.out.println("Greater");
        }
        else if (given_num < user_num)
        {
            System.out.println("Smaller");
        }
        else
        {
            System.out.println("Equal");
        }

        // Q.4
//        float v,u,b,a,s;
//        b = (v^2 - u^2)/(2*a*s);


    }
}
