package HARLAN_and_AIDS;

import java.util.Scanner;
public class fibonacci {
    public static void main (String[]args) {
       shet();
    }
    static int fibo (int n) {
        if (n == 1) {
            return 1;
        }
        if(n == 0){
           return 0;
        }
        //if(n <= 1){ return n; }
        else {
            return fibo (n - 1) + fibo (n - 2);
        }
    }
    static void shet() {
        System.out.print("Paease Enter Value: ");
        int b = new Scanner(System.in)
        .nextInt();
        
        for (int a = 0; a <= b; a++) {
            System.out.print("f(" + a + ")\t");
        }
        System.out.println();
            for(int a = 0; a <= b; a++) {
               for(int m= 0; m <= a; m++) {
                    System.out.print(fibo(m) + " " + "\t");
               }
               System.out.print("\n");
            
        }
    } 
}
