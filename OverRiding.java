import java.lang.*;
import java.io.*;
import java.util.*;
 //class Shape
//{
//	int l,b;
//	void getd()throws IOException
//	{
	//	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	//	System.out.println ("Enter the length of Rectangle:");
	//	l=Integer.parseInt(br.readLine());
	//	System.out.println ("Enter the breadth of Rectangle:");
	//	b=Integer.parseInt(br.readLine());
//	}
//	 void area();
//}
class Square
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
class Rectangle extends Square
//class Rectangle extends Shape
{
	int l,b;
	void area()
  {
  Scanner sc = new Scanner(System.in);

    System.out.println ("Enter the length of Rectangle:");
    l = sc.nextInt();
    System.out.println ("Enter the breadth of Rectangle:");
    b = sc.nextInt();
		int a=l*b;
		System.out.println ("Area of Rectangle is "+a +"sq units");
	}
}
class Circle extends Square
//class Circle extends Shape
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
class OverRiding
{
	public static void main(String args[]) throws IOException
	{
		//Rectangle R = new Rectangle();
		//R.getd();
		//R.area();


		Square S=new Square();
    S.area();

Rectangle R = new Rectangle();
R.area();
    Circle C = new Circle();

    C.area();


	}
}
