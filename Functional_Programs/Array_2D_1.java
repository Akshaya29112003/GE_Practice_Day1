package Functional_Programs;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array_2D_1 {
    public static void sample_2D_Array(int r, int c){
        int a[][] = new int[r][c];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();

        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                pw.print(a[i][j]+" ");
            }
            pw.println();
        }
        pw.flush();
        pw.close();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int c = sc.nextInt();

            sample_2D_Array(r, c);

            sc.close();
    }
}
