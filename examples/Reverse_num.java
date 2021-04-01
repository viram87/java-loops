package examples;

import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);

        System.out.println("Enter the numebr : ");

        int n = v1.nextInt();

        System.out.println(" ");

        System.out.print("your reversed number is : ");

        // to reverse aa number

        while (n > 0) {
            int r = n % 10;
            System.out.print(r);
            n = n / 10;

        }

        v1.close();

    }
}

/*
 * output:
 * 
 * Enter the number : 45612
 * 
 * your reversed number is : 12654
 * 
 * 
 */
