package Basic_Core_Programs;

import java.util.Scanner;

public class Leap_Year_2 {
    public static void sample_leap(int x){
        if(x%4 == 0 || (x%100 != 0 && x%400 == 0))
            System.out.println("Yes it's a leap year");
        else
            System.out.println("No it's not a leap year");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sample_leap(x);
    }
}
