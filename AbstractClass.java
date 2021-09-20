import java.lang.*;
import java.io.*;
import java.util.*;
abstract class Shape
{
	int l,b;
	void getd()throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println ("Enter the length of Rectangle:");
		l=Integer.parseInt(br.readLine());
		System.out.println ("Enter the breadth of Rectangle:");
		b=Integer.parseInt(br.readLine());
	}
	abstract void area();
}
class Square extends Shape
{
	int x;

	void area()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println ("Enter the side of Square");
		  x = sc.nextInt();

		  System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
	}
}
class Rectangle extends Shape
{
	void getd()throws IOException
	{
		super.getd();
	}
	void area()
	{
		int a=l*b;
		System.out.println ("Area of Rectangle is "+a +"sq units");
	}
}
class Circle extends Shape
{
	int r;

	void area()
	{
			Scanner sc = new Scanner(System.in);

		System.out.println ("Enter the radius of circle");
		 r = sc.nextInt();


		double b=3.14*r*r;
		System.out.println ("Area of Circle is "+b+"sq units");
	}
}
class AbstractClass
{
	public static void main(String args[]) throws IOException
	{
		Rectangle R = new Rectangle();
		R.getd();
		R.area();
		Circle C = new Circle();

		C.area();

		Square S=new Square();

		S.area();
	}
}
