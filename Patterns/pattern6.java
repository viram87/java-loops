/* Draw the pattern

5  4  3  2  1   
5  4  3  2
5  4  3
5  4
5

*/

package Patterns;

import java.util.Scanner;

public class pattern6 {

    public static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = v1.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + "  ");
            }
            System.out.println(" ");
        }

        v1.close();

    }

}
