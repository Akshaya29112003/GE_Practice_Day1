package Basic_Core_Programs;

import java.util.Scanner;

public class Even_Odd_8 {
    public static void sample_ev_odd(int n){
        if(n%2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sample_ev_odd(n);
    }
}
