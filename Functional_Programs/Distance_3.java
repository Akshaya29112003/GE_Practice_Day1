package Functional_Programs;

import java.util.Scanner;

public class Distance_3 {
    public static void sample_distance(int x, int y){
        double ans = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(ans);
    }

    public static void main(String[] ans){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        sample_distance(x, y);
    }
}
