package com.bridgelabz;
import java.util.Scanner;
public class LineComputation {
	/*
	 * UC4 : Line Computation problem using oops
	 */
	public void lineCompare() { 
		System.out.println("\nEnter Cordinates Of Line 1 ");
		getData();
		double line1 = lengthOfLine1(x1,y1,x2,y2);
		System.out.println("Distance Btw Two Points:"+line1);
		System.out.println("\nEnter Cordinates Of Line 2 ");
		getData();
		double line2 = lengthOfLine2(x1,y1,x2,y2);
		System.out.println("Distance Btw Two Points:"+line2);

		equlity(line1,line2);
		compareLine(line1,line2);
	}
	static	double x1,y1,x2,y2;

	static public void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter cord x1 value");
		x1 = sc.nextDouble();
		System.out.println("enter cord y1 value");
		y1 = sc.nextDouble();
		System.out.println("enter cord x2 value");
		x2 = sc.nextDouble();
		System.out.println("enter cord y2 value");
		y2 = sc.nextDouble();
		
	}
	/*
	 * UC1 : calculate length of line
	 */
	 static double lengthOfLine1(double a,double b,double c,double d)
	{
		double x1=a ,y1=b, x2=c, y2=d;
		return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	}

	 static double lengthOfLine2(double a,double b,double c,double d)
	{
		double x1 = a ,y1 = b, x2 = c, y2 = d;
		return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
	}
	/*
	 * UC2 : check two lines are equal using java equals method
	 */
	
	 static public void equlity(Double line1,Double line2)
	{
	 if(line1.equals(line2) == true)
		System.out.println("both lines are equal");
	 else
		 System.out.println("Line are not equal");
	}
	/*
	 * UC3 : check two lines is equal,greater or less than the other line
	 */
	static public void compareLine(Double line1,Double line2)
	{
		if(line1.compareTo(line2) == 1)
			System.out.println("line one is greater than line two");
		else if(line1.compareTo(line2) == -1)
			System.out.println("line one is less than line two");
		else
			System.out.println("both lines are equal");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparison Computation Program");
		LineComputation ob = new LineComputation();
		ob.lineCompare();
	}
	
}
