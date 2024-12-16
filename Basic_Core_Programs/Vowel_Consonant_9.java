package Basic_Core_Programs;

import java.util.Scanner;

public class Vowel_Consonant_9 {
    public static void sample_Vol_Con(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel Character");
        else
            System.out.println("Consonant Character");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        sample_Vol_Con(ch);
    }
}
