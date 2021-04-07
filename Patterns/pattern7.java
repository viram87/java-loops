package Patterns;

import java.util.Scanner;

public class pattern7 {

    public static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);

        System.out.println("Enter the numeb : ");

        int n = v1.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println(" ");

        }

        v1.close();

    }

}
