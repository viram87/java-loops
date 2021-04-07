/* Draw patterns 

01
02 03
04 05 06
07 08 09 10  
11 12 13 14 15

*/

package Patterns;

import java.util.Scanner;

public class pattern5 {

    public static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = v1.nextInt();

        int count = 0;

        System.out.println("");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.format("%02d ", count);
            }

            System.out.println(" ");
        }

        v1.close();
    }

}
