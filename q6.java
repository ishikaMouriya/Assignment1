/*
 *Ishika Mouriya
 *2241013366
 *Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
method can't use the multiplication, modulus, or division operators, The method signature is
as follows.
public static boolean isOdd(int n)
Sample Run:
Enter a number 37
37 is odd: true
 */
import java.util.*;
public class q6 
{
	public static boolean isOdd(int n)
	{ boolean t=false;
		for(int i=1;i<=n;i=i+2)
		{
			if(i==n)
				t=true;
			
		}
		return t;
	}
	
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter a number");
	n=sc.nextInt();
	boolean r=isOdd(n);
	if(r==true)
	System.out.println("odd");
	else
		System.out.println("even");
	}

}
