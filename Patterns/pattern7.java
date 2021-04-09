/* Draw the pattern

1  2  3  4  5   
1  2  3  4
1  2  3
1  2
1

*/
package Patterns;

import java.util.Scanner;

public class pattern7 {

    public static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);

        System.out.println("Enter the numeb : ");

        int n = v1.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + "  ");
            }

            System.out.println(" ");

        }

        v1.close();

    }

}
