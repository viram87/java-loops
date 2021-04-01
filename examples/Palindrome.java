//check the number is palindrome or not

package examples;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int n = v1.nextInt();

        int temp = n;

        // for reversing the number

        int rev = 0;

        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;

        }

        System.out.println(" ");

        if (temp == rev)
            System.out.println(temp + " is a palindrome number ");
        else
            System.out.println(temp + " is not a palindrome number ");

        v1.close();
    }

}

/*
 * 
 * output - 1
 * -----------------------------------------------------------------------------
 * ------------------- Enter the number : 12321
 * 
 * 12321 is a palindrome number
 * 
 * =============================================================================
 * =====================
 * 
 * output - 2
 * -----------------------------------------------------------------------------
 * ------------------- Enter the number : 1258
 * 
 * 1258 is not a palindrome number
 * 
 * 
 * 
 * 
 * 
 */