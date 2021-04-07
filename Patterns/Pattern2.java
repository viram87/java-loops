/*  draw  pattern

2  3  4  5  6
3  4  5  6  7
4  5  6  7  8
5  6  7  8  9
6  7  8  9  10
*/

package Patterns;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);

        System.out.println("Enter the number  : ");
        int n = v1.nextInt();

        System.out.println(" ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + j + "  ");
            }

            System.out.println(" ");
        }

        v1.close();
    }

}
