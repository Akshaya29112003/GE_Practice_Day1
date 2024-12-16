package Basic_Core_Programs;

import java.util.*;

public class Power_Of_Two_3 {
    public static void sample_power(int n) {

            int power = (int) Math.pow(2, n);

            if (power % 4 == 0 && (power % 100 != 0 || power % 400 == 0))
                System.out.println(2 + " ^ " + n + " = " + power + " Is a leap year");
            else
                System.out.println(2 + " ^ " + n + " = "+ power + " Is not a leap year");
        }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0 && n<=31)
            sample_power(n);
        else
            System.out.println("Invalid Input");
    }
}
