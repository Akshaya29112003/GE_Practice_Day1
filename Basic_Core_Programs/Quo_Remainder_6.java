package Basic_Core_Programs;

import java.util.Scanner;

public class Quo_Remainder_6 {
    public static void sample_Que_Re(int n, int m){
        double quo = n/m;
        double rem = n%m;
        System.out.println("Quotient : "+quo+" Remainder : "+rem);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        sample_Que_Re(n,m);
    }
}
