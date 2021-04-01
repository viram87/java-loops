package examples;

import java.util.Scanner;

public class count_digit {

    public static void main(String[] args) {

            Scanner v1 = new Scanner(System.in);

            System.out.println("Enter the number : ");
            int n = v1.nextInt();

            System.out.println(" ");

            int count = 0;

            while(n > 0)
            {
                n = n/10;
                count++;
            }
            System.out.println(count);


            v1.close();
        
    
        
    }
    
}
