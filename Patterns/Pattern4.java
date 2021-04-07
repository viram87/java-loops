package Patterns;

/* Draw pattern

1  
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/

import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = v1.nextInt();

        System.out.println(" ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(" ");
        }

        v1.close();

    }

}
