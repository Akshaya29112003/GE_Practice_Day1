package Basic_Core_Programs;

import java.util.Scanner;

public class Harmonic_Number_4 {
    public static void sample_harmonic(int n){
        double sum = 0.00;
        for(int i=1;i<=n;i++){
            sum+=(double)1/i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sample_harmonic(n);
    }
}
