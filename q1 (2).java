import java.util.*;

public class q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n ;
		System.out.println("enter a number");
		n=sc.nextInt();
		try {
		if(n<0) {
			throw new NumberFormatException("negative number");
		}
		System.out.println("the number is lucky"+n);}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		}

	}


