/*Write a program to check leap year using if else. How to check whether a given year is a leap year or not*/

import java.util.Scanner;
class LeapYearCheck
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);//for taking input from the user

		System.out.println("Enter year: ");
		int year=sc.nextInt();

		if((year%4==0 && year%100!=0) || year%400==0)//checking condition
			System.out.println(year+" is leap year");
		else
			System.out.println(year+" is not leap year");
	}
}

/*Output:
Enter year:
2012
2012 is leap year

Enter year:
1800
1800 is not leap year
*/