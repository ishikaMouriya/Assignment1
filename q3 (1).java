/*
 Write a java program to check whether a number is a spy number or not.
Example:
N = 132
Sum of digit of N = 1 + 3 + 2 = 6
Product of digit of N = 1 × 3 × 2 = 6
So, 132 is a spy number.
Sample Run:
Enter a number: 1124
1124 is a spy number.
 */

import java.util.*;
public class q3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;int p=1,s=0;int d=0;
		System.out.println("enter a number");
		n=sc.nextInt();
		while(n!=0)
		{
			d=n%10;
		s=s+d;
		p=p*d;
		n=n/10;
	}
		if(s==p)
			System.out.println("spy number");
		else 
			System.out.println("not spy number");
	}

}
