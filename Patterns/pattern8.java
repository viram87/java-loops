/* Draw the pattern

* * * * *  
  * * * *
    * * *
      * *
        *  

*/

package Patterns;

import java.util.Scanner;

public class pattern8 {

    public static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = v1.nextInt();

        System.out.println(" ");

        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }

            // for stars
            for (int k = 0; k <= n - i; k++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }

        v1.close();

    }

}
