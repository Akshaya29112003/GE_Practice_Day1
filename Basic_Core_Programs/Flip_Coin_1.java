package Basic_Core_Programs;
import java.util.*;
import java.lang.*;

public class Flip_Coin_1 {
    public static void sample_flip(int x){
        List<Double> hl = new ArrayList<>();
        List<Double> tl = new ArrayList<>();
        int heads_count = 0, tails_count = 0;
        for(int i=0;i<x;i++){
            double y = Math.random();
            System.out.println(y);
            if(y<0.5)
                tl.add(y);
            else
                hl.add(y);
        }
        int hc = hl.size();
        int tc = tl.size();

        System.out.println("heads Percentage :"+ ((double)hc/x)*100);
        System.out.println("Tails Percentage :"+ ((double)tc/x)*100);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        sample_flip(x);
    }


}


