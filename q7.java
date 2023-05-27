/*
 Ishika Mouriya
 2241013366
 Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs.
Sample Run:
Enter number of elements of Array: 5
Enter elements of the array: 12 14 12 14 13
Maximum element of Array is 14 and occurs 2 times.
Minimum element of Array is 12 and occurs 2 times.
First occurrence of maximum element is at position 2.

 */
import java.util.*;
public class q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n;System.out.println("enter a number");
		n=sc.nextInt();int i=0,c=0,d=0,mp1=0,mp2=0;
		int a[]=new int[n];
		System.out.println("enter the elements");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			//System.out.print(a[i]+" ");
		}
		for( i=0;i<n;i++)
		{
			
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int max=a[0],min=a[0];
		for( i=0;i<n;i++)
		{
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
		}
		for( i=0;i<n;i++)
		{
			if(a[i]==max)
				{c++;
			if(c==1)
				mp1=i+1;}
			if(a[i]==min)
				{d++;mp2=i+1;}
		}
		System.out.println("the max digit in the array is="+max+"and it occurs="+c+"times");
		System.out.println("the min digit in the array is="+min+"and it occurs="+d+"times");
		System.out.println("First occurrence of maximum element is at position "+mp1);
		System.out.println("last occurrence of minimum element is at position "+mp2);
	}

}
