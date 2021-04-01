//Factorial of the given number 

package examples;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	

		Scanner v1 = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = v1.nextInt();
		
		int fact = 1;
		
		for(int i = 1 ; i<=n ; i++)
		{
			fact = fact * i;
		}
		
		System.out.println("");
		System.out.println("factorial is :" + fact) ;
		
		v1.close();
		
	}

}


