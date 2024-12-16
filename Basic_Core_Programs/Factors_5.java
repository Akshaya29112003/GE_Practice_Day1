package Basic_Core_Programs;

import java.util.Scanner;

public class Factors_5 {
    public static void sample_factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                int c = 0;
                for(int j=1;j<=i;j++){
                    if(i%j == 0)
                        c++;
                }
                if(c==2)
                    System.out.print(i+" ");
            }
            else    continue;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sample_factors(n);
    }
}
