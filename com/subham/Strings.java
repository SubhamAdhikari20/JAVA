package com.subham;

public class Strings {
    public static void main(String[] args) {
        // In java, String is a class rather than primitive data type. Thus, it has special support.
        // Strings are immutable so, they cannot be changed.
        // For instance, we can write:
        /*
        String a = new String("Subham Adhikari");
        String b = "Subham Adhikari";
        // System.out.println(a);
        System.out.printf("My name is %s", b);

        String name = "Employee";
        int value = name.length();
        System.out.println(value);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String str1 = "        Subham          ";
        System.out.println(str1);
        String upd_str1 = str1.trim();
        System.out.println(upd_str1);

        String str2 = "This is not power of your creation";
        String upd_str2 = str2.substring(2, 13);    // from index "2" to index "12" (to (n-1) index because end index is excluded)
        System.out.println(str2);
        System.out.println(upd_str2);

        String str3 = "This is not power of your creation";
        // String upd_str3 = str3.replace('i', 's');
        String upd_str3 = str3.replace("is", "on");
        System.out.println(str3);
        System.out.println(upd_str3);

        String str4 = "This is not power of your creation";
        boolean upd_str4 = str4.startsWith("h");
        System.out.println(str4);
        System.out.println(upd_str4);

        String str5 = "This is not power of your creation";
        boolean upd_str5 = str5.endsWith("y");
        System.out.println(str5);
        System.out.println(upd_str5);

        String str6 = "This is not power of your creation";
        char upd_str6 = str6.charAt(5);
        System.out.println(str6);
        System.out.println(upd_str6);
        */

        String str7 = "This is not power of your creation";
        int upd_str7 = str7.indexOf("po");
        int upd_str8 = str7.indexOf("ur", 3);
        System.out.println(str7);
        System.out.println(upd_str7);
        System.out.println(upd_str8);




    }
}
