/*Write a java program to check given number is perfect number or not*/

import java.util.Scanner;

class PerfectNumber
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);//creating object
		
		System.out.println("Enter number: ");
		int num=sc.nextInt();//taking input from the user

		int sum=0;

		//iterating loop and adding the divisible values
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				sum+=i;
		}

		if(sum==num)
			System.out.println(num+" is perfect number");
		else
			System.out.println(num+" is not perfect number");
	}
}

/*Output:
Enter number:
28
28 is perfect number

Enter number:
4
4 is not perfect number
 */