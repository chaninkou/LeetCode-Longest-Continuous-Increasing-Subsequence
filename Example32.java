package example32;
import java.util.Scanner;
/*   
Author: Chan In Kou
Purpose: The Display will show a loop practice
*/
public class Example32 {

	public static void main(String[] args) {
	    //create a Scanner
		Scanner in = new Scanner(System.in);
		
		//declaring variables
		int sum = 0;
		int sumSquare = 0;
		int c;
		int a;
		int b;
		double square;
		double product = 1;
			
		//enter the value
		while(true)
		{
			//entering the values for a and b
			System.out.print("Enter the values for a and b: ");
			a = in.nextInt();
			b = in.nextInt();
			//so the order doesn't matter
			if (a > b) 
			{
					c = a;
					a = b;
					b = c;
			}
			//must be positive
			if(a > 0 && b > 0)
				break;
			System.out.println("a and b cannot be negative"); 
        }		  
		
		//loop for [a-b]
		for (double n = a; n <=b; n++) {
			//finding the sum
			sum += n;
			//finding the sum of squares
			square = (n * n);
			sumSquare += square;
			//finding the product of all even number
			if(n % 2 == 0)
			{
			product *= n;
			}
		}      	
		
		//spaces
		System.out.println("");
		
		//display the sum
		System.out.println("Sum of all numbers between " + a + " and " + b + ": \t\t" + sum);
		
		//display the product of all even number better a and b
		System.out.printf("Product of all even numbers between " + a + " and " + b + ": \t" + "%.0f\n", product);

	    //sum of all squares
		System.out.println("Sum of all squares between " + a + " and " + b + ": \t\t" + sumSquare);	
	}
}
