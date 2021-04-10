/* draw the pattern

        *  
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

*/

package Patterns;

import java.util.Scanner;

public class pattern10 {

    public static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = v1.nextInt();

        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // for stars
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }

        v1.close();

    }

}
