/*Write a program to find the perimeter of Square*/

import java.util.Scanner;
class PerimeterSquare
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);//for taking input from the user

		System.out.println("Enter the length of side of Square");
		float side=sc.nextFloat();//taking length of side as input from the user
		
		float peri=4*side;//calculating perimeter of square
		
		//displaying output
		System.out.println("The perimeter of Square is: "+peri);
	}
}

/*Output:
Enter the length of side of Square
10.5
The perimeter of Square is: 42.0
*/