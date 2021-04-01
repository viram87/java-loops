//Find the sum of n number 

package examples;

import java.util.Scanner;

public class Sum_of_n {

	public static void main(String[] args) {
		
 		Scanner v1 = new Scanner(System.in);
		
		System.out.println("Enter the number to sum :");
		
		int n = v1.nextInt();
		
		int sum = 0;
		
		for(int i = 0 ; i <=n ; i++)
		{			
			sum = sum + i;
		}
		
		System.out.println(" ");
		
		System.out.println("sum of 1 to " + n + " is :" + sum);

		v1.close();
		
	}

}
