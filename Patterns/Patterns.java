import java.util.*;

public class Patterns {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        // Q. print diamond
        int cnt1 = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i + cnt1; j++) {
                System.out.print("* ");
            }
            cnt1++;
            System.out.println();
        }
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i + cnt1; j++) {
                System.out.print("* ");
            }
            cnt1--;
            System.out.println();
        }

        // Q.print row number in triangle form without inner space
        // int cnt = 0;
        // for(int i=1;i<=a;i++){
        // for(int j=1;j<=a-i;j++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=i+cnt;j++){
        // System.out.print(i);
        // }
        // cnt++;
        // System.out.println();
        // }

        // Q.print palindrome numbers in triangle form
        // for(int i=1;i<=a;i++){
        // for(int j=1;j<=a-i;j++){
        // System.out.print(" ");
        // }
        // for(int j=i;j>=1;j--){
        // System.out.print(j);
        // }
        // for(int j=2;j<=i;j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Q.print row number in triangle form with inner space
        // for(int i=1; i<=a; i++){
        // for(int j=1;j<=a-i;j++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=i;j++){
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        /*
         * Q.Printing hollow rhombus
         * for(int i=1;i<=a;i++){
         * for(int j=i;j<=a-1;j++){
         * System.out.print("  ");
         * }
         * for(int j=1;j<=a;j++){
         * if(i==1 || i==a || j==1 || j==a){
         * System.out.print("* ");
         * }
         * else{
         * System.out.print("  ");
         * }
         * }
         * System.out.println();
         * }
         * 
         * 
         * // Q.print rhombus
         * int sp = a-1;
         * for(int i=1;i<=a;i++){
         * // System.out.print(sp + " " + i);
         * for(int j=1;j<=sp;j++){
         * System.out.print("  ");
         * }
         * for(int j=1;j<=a;j++){
         * System.out.print("* ");
         * }
         * sp--;
         * System.out.println();
         * }
         * OR
         * for(int i=1;i<=a;i++){
         * for(int j=i;j<=a-1;j++){
         * System.out.print("  ");
         * }
         * for(int j=1;j<=a;j++){
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         */

        // Q.Print Butterfly pattern
        // int space = a-2;
        // int st = 1;
        // for(int i=1;i<=a;i++){
        //// System.out.print(st + "," + space + "," + st);
        //
        // for(int j=1;j<=st;j++){
        // System.out.print("* ");
        // }
        // for(int k=1;k<=space;k++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=st;j++){
        // System.out.print("* ");
        // }
        // if(i < a/2){
        // space -= 2;
        // st++;
        // }
        // if(i > a/2){
        // space += 2;
        // st--;
        // }
        // System.out.println();
        // }

        // Q.print 0 & 1 pattern
        // for(int i=1;i<=a;i++){
        // for(int j=1;j<=i;j++){
        // if((i+j) % 2 == 0){
        // System.out.print("1");
        // } else{
        // System.out.print("0");
        // }
        // }
        // System.out.println();
        // }

        // Q.Print Continue number pattern
        // for(int i=1;i<=a;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(b+" ");
        // b++;
        // }
        // System.out.println();
        // }

        // Q.Print column(ie.'j') in mirror
        // for(int i=a; i>= 1; i--){
        // for(int j=1; j<=i; j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        /*
         * Q.Print '*' pattern to right side
         * for(int i=1; i<=a; i++){
         * int space = a-1;
         * for(int j=space; j>=i; j--){
         * System.out.print(" ");
         * }
         * for(int j=1; j<=i;j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * OR
         * for(int i=1; i<=a; i++){
         * int space = a-1;
         * int count = a;
         * for(int j=space; j>=i; j--){
         * System.out.print(" ");
         * count--;
         * }
         * for(int j=1; j<=count;j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * OR
         * for(int i=1; i<=a; i++){
         * for(int j=i; j<=a-1; j++){
         * System.out.print(" ");
         * }
         * for(int j=1; j<=i;j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // Q.Print '*' in mirror
        // for(int i=1; i<=a; i++){
        // for(int j=i; j<=b; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // Q.Printing bascic pattern
        // for(int i=1; i<=a; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // Q.Print hollow Square pattern
        // for(int i = 1; i <= a; i++){
        // for(int j = 1; j <= b; j++){
        // if(i==1 || i==a || j==1 || j==b){
        // System.out.print("*");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println("");
        // }
    }
}
