

package com.mycompany.fibonacciseries;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Eneter the number of terms you want to display in the Fibonacci Series ");
        int input = scan.nextInt();
        
        int first = 0;
        int second = 1;
        
        System.out.println("Fibonacci Series up to " + input + " terms");
        
        for (int i = 1; i <= input; i++){
        
        System.out.print(first + " ");
        
        int nextnum = first + second;
        first = second;
        second = nextnum;
        
    
        
    }
    }
}
