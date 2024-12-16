package Basic_Core_Programs;

import java.util.Scanner;

public class Largest_Among_3_nums_10 {
    public static void sample_lar_of_3_nums(int x, int y, int z){
        if(x>y && x>z)  System.out.println(x + " is largest");
        else if(y>x && y>z) System.out.println(y + " is largest");
        else System.out.println(z + " is largest");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        sample_lar_of_3_nums(x, y, z);
    }
}
