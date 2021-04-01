//diplay arithmatic series given by the user 

package examples;

import java.util.Scanner;

public class Arithmatic_Series {

    public static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);

        // a = first term
        // d = common difference
        // n = number of terms

        System.out.println("Program to print the arithmatic series...");
        System.out.println("Enter a , d and n : ");
        int a = v1.nextInt();
        int d = v1.nextInt();
        int n = v1.nextInt();

        int term = a;

        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            term = term + d;

        }
        v1.close();

    }

}

/*
 * 
 * output :
 * 
 * Enter a , d and n : 10 5 5
 * 
 * 10 15 20 25 30
 * 
 * 
 * 
 */
