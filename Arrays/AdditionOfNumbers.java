import java.util.*;

class AdditionOfNumbers {
    static void getAddition(int a, int b) {
        int sum = a + b;
        System.out.println("Addition is " + sum);
    }

    static void getSubtraction(int a, int b) {
        int sub = a - b;
        System.out.println("Subtraction is " + sub);
    }

    static void getMultiplication(int a, int b) {
        int mult = a * b;
        System.out.println("Product is " + mult);
    }

    static void getModDiv(int a, int b) {
        int div = a / b;
        int mod = a % b;
        System.out.println("Quoicent is " + div);
        System.out.println("Remainder is " + mod);
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 20;

        getAddition(a, b);
        getSubtraction(a, b);
        getMultiplication(a, b);
        getModDiv(a, b);

        char ch1 = 'A';
        char ch2 = 'B';
        String ans = Character.toString(ch1) + Character.toString(ch2);
        System.out.println(ans);

        long a1 = 1000000000000000l;
        int b1 = (int) a1;
        System.out.println(b1);
    }
}