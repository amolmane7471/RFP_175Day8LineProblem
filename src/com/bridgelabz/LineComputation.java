package com.bridgelabz;
import java.util.Scanner;
public class LineComputation {
	static double x1,y1,x2,y2;

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

	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparison Computation Program");
		System.out.println("\nEnter Cordinates Of Line 1 ");
		getData();
		double line1 = lengthOfLine1(x1,y1,x2,y2);
		System.out.println("Distance Btw Two Points:"+line1);

	}
}
