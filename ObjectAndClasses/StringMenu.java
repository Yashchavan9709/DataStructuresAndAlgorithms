// package DataStructuresAndAlgorithms.ObjectAndClasses;

import java.util.*;

public class StringMenu {
    static void getReverseString(String str1) {
        String ans = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            ans = ans + str1.charAt(i);
        }
        System.out.println("Reverse string is :" + ans);
    }

    static void getStringLength(String str1) {
        int length = str1.length();
        System.out.println("Length of string is :" + length);
    }

    static void getAltChar(String str1) {

        for (int i = 0; i < str1.length(); i++) {
            if (i % 2 == 0) {
                System.out.print("Alternate characters are :" + str1.charAt(i) + "     ");
            }
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        getReverseString(str);
        getStringLength(str);
        getAltChar(str);
        // StringMenu obj = new StringMenu();
        // obj.getAltChar(str);
    }
}
