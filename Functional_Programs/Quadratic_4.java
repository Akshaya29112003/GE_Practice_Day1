package Functional_Programs;

import java.util.Scanner;

public class Quadratic_4 {
    public static void sample_quadratic(int a, int b, int c){
        double delta = (b*b) - (4*a*c);
        double x = (-b + Math.sqrt(delta)) / (2*a);
        double y = (-b - Math.sqrt(delta)) / (2*a);

        System.out.println(x+" "+y);
    }

    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sample_quadratic(a, b, c);
    }
}
