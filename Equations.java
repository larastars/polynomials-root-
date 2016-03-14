import java.util.Scanner;
import java.text.*;
public class Equations {
	
	private static double upper;
	private static double lower;
	private static int x5, x4, x3, x2, x1, x0;
	private static int num;
	private static double precision = 0.000001;
	
	public static void readCoefficent() 
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the numbers of coefficent: ");
		num = keyboard.nextInt();
		if (num == 0)
		{
			System.out.println("Enter the coefficent of x0 = ");
			x0 = keyboard.nextInt();
			System.out.println("the equation is:");
			System.out.println("y= " + x0);
		}
		else if (num == 1)
		{
			System.out.println("Enter the coefficent of x1 = ");
			x1 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x0 = ");
			x0 = keyboard.nextInt();
			System.out.println("the equation is:");
			System.out.println("y= " + x1 + "x +" + x0);
		}
		else if (num == 2)
		{
			System.out.println("Enter the coefficent of x2 = ");
			x2 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x1 = ");
			x1 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x0 = ");
			x0 = keyboard.nextInt();
			System.out.println("the equation is:");
			System.out.println("y= " + x2 + "x^2 + "+ x1 + "x + " + x0);
		}
		else if (num == 3)
		{
			System.out.println("Enter the coefficent of x3 = ");
			x3 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x2 = ");
			x2 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x1 = ");
			x1 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x0 = ");
			x0 = keyboard.nextInt();
			System.out.println("the equation is:");
			System.out.println("y= " + x3 + "x^3 + " + x2 + "x^2 + "+ x1 + "x + " + x0);
		}
		else if (num == 4)
		{
			System.out.println("Enter the coefficent of x4 = ");
			x4 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x3 = ");
			x3 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x2 = ");
			x2 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x1 = ");
			x1 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x0 = ");
			x0 = keyboard.nextInt();
			System.out.println("the equation is:");
			System.out.println("y= " + x4 + "x^4 + " + x3 + "x^3 + " + x2 + "x^2 + "+ x1 + "x + " + x0);
		}
		else if (num == 5)
		{
			System.out.println("Enter the coefficent of x5 = ");
			x5 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x4 = ");
			x4 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x3 = ");
			x3 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x2 = ");
			x2 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x1 = ");
			x1 = keyboard.nextInt();
			System.out.println("Enter the coefficent of x0 = ");
			x0 = keyboard.nextInt();
			System.out.println("the equation is:");
			System.out.println("y= " + x5 + "x^5 + " + x4 + "x^4 + " + x3 + "x^3 + " + x2 + "x^2 + "+ x1 + "x + " + x0);
		}
		else 
		{
			System.out.println("Error, enter numbers between 0-5");
			System.exit(0);
		}
		
	}
	
	public static void calcuate()
	{
		System.out.println("Roots: ");
		DecimalFormat dt = new DecimalFormat("###.##");
		
		for (double x = -10; x < 10 ; x =+ x + 0.01)
		{
			double y1 = evaluate(x);
			double y2 = evaluate(x+ 0.01);
			double m;
			
			if (((y1 > 0)&&(y2 < 0))||((y1 < 0)&&(y2 > 0)))
			{
				if (y1 > 0)
				{
					setUpper(x);
					setLower(x+precision);
				}
				else 
				{
					setUpper(x+precision);
					setLower(x);
				}
				
				m = (getUpper() + getLower())/2;
				if (m > 0)
				{
					setUpper(m);
				}
				else
				{
					setLower(m);
				}
				
				System.out.println(dt.format(x));
			}
			
			
		}
		
	}
	private static void setLower(double d)
	{
		lower = d;
		
	}
	private static void setUpper(double x) 
	{
		upper = x;
		
	}
	public static double getUpper()
	{
		return upper;
	}
	public static double getLower()
	{
		return lower;
	}

	private static double evaluate(double x) 
	{
		//put # in the equation
		double evEquation = (x5 * Math.pow(x, 5)) + (x4 * Math.pow(x, 4)) + (x3 * Math.pow(x, 3)) + (x2 * Math.pow(x, 2)) + (x1 * Math.pow(x, 1)) + (x0 * Math.pow(x, 0)) ;
		return evEquation;
	}
	
	
	

}
