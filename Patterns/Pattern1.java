/*draw the pattern 

1  1  1  1  1
2  2  2  2  2
3  3  3  3  3
4  4  4  4  4 
5  5  5  5  5

*/
package Patterns;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = v1.nextInt();

        System.err.println(" ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + "  ");
            }

            System.out.println(" ");
        }

        v1.close();

    }

}
