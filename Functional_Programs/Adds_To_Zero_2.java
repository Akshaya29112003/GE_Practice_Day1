package Functional_Programs;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Adds_To_Zero_2 {
    public static void sample_Add(int n, int[] a){
        int count = 0;
        Set<String> set = new HashSet<>();

        for(int i=0;i<n-2;i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        String triString = a[i] + " , " + a[j] + " , " + a[k];

                        if (!set.contains(triString)) {
                            set.add(triString);
                            count++;
                            System.out.println(triString);
                        }
                    }
                }
            }
        }
        System.out.println(count);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        sample_Add(n, a);
    }
}
