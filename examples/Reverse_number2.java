package examples;

import java.util.Scanner;

public class Reverse_number2 {
    static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = v1.nextInt();

        int rev = 0, r;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        System.out.println("your reversed number is : " + rev);

        v1.close();
    }

}
