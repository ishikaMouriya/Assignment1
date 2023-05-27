import java.util.*;
public class q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double w;System.out.println("enter the mass of the body in kg");
		w=sc.nextDouble();
		double h;System.out.println("enter the height of the body in meter");
		h=sc.nextDouble();
		double BMI=w/(h*h);
		if(BMI<=18.5)
					System.out.println("underweight");
		else if(BMI>18.5&&BMI<=24.9)
			System.out.println("normal weight");
		else if(BMI>25.0&&BMI<=29.9)
			System.out.println("overweight");
		else if(BMI>30.0)
			System.out.println("obese");

	}

}
