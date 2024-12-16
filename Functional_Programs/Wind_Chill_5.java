package Functional_Programs;

import java.util.Scanner;

public class Wind_Chill_5 {
    public static void sample_wind_chill(double t, double v){
        if(t>50 || v<3 || v>120)
                System.out.println("Invalid Input");
        else {
            double ans = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println(ans);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double t = sc.nextDouble();
        double v = sc.nextDouble();

        sample_wind_chill(t, v);
    }
}
