//display all  digit one by one....

package examples;

import java.util.Scanner;


//display all given digits one by one 

public class Display_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner v1 = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int n = v1.nextInt();
		
		System.out.println(" ");
		
		while(n > 0)
		{
			int r = n % 10;
			n = n/10;
			System.out.println(r);
			
		}
		
		v1.close();
		

	}

}


/*
 * 
 *  output :
 * Enter the number : 
 * 123
 * 
 * 3
 * 2
 * 1
 * 
 *  
*/
