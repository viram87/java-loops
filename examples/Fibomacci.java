package examples;

import java.util.Scanner;

public class Fibomacci {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        Scanner v1 = new Scanner(System.in);

        System.out.println("Ente the number : ");

        int n = v1.nextInt();

        System.out.println(" ");

        System.out.println(a + " ");
        System.out.println(b + " ");

        for (int i = 0; i <= n - 2; i++) {

            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }

        v1.close();

    }

}
