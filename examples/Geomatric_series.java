//write a simple java code to display geomatric series ....

package examples;

import java.util.Scanner;

public class Geomatric_series {

    public static void main(String[] args) {

        Scanner v1 = new Scanner(System.in);

        // a = first term
        // r = common ratio
        // n = number of terms

        System.out.println("Enter a , r and n : ");

        int a = v1.nextInt();
        int r = v1.nextInt();
        int n = v1.nextInt();

        int term = a;

        System.out.println(" ");

        for (int i = 1; i <= n; i++) {
            System.out.println(term);
            term = term * r;

        }

        v1.close();

    }
}
