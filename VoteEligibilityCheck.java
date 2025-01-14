/* Write java program to check  candidate eligible for voting or not*/

import java.util.Scanner;
class VoteEligibilityCheck
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);//taking input from the user

		System.out.println("Enter your age:");
		int age=sc.nextInt();

		if(age>18)//checking whether candidate is eligible or not
			System.out.println("You are eligible for voting");
		else
			System.out.println("You are not eligible for voting");
	}
}

/*Output:
Enter your age:
15
You are not eligible for voting

Enter your age:
22
You are eligible for voting
*/