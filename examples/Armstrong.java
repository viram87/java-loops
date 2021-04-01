//check the number is armstrong or not

package examples;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        
    Scanner v1 = new Scanner(System.in);

    System.out.println("Enter the number :");
    int n = v1.nextInt();

    int sum = 0;

    int temp = n;


    //make the sum of cube of every digit
    while(n > 0)
    {
        int r = n % 10;
        sum = sum + (r * r * r);
        n = n / 10;
        


    }    

    //compare the sum with the main numeber given by user                       

    if(sum == temp)
    {
        System.out.println("it is a armstrong number");
    } else
    {
        System.out.println("its not armstrong number ");
    }




    v1.close();
        
    }

    
    
}
