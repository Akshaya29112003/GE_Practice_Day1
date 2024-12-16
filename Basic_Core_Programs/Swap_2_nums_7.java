package Basic_Core_Programs;

import java.util.Scanner;

public class Swap_2_nums_7 {
    public static void sample_swap(int n, int m){
        int temp = n;
        n = m;
        m = temp;

        System.out.println(n+" "+m);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        sample_swap(n, m);
    }
}
