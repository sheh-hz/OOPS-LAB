import java.lang.*;
import java.io.*;
import java.util.*;
interface TestInterface
{
  abstract  void area();
  abstract void perimeter();

}

class Rectangle implements TestInterface
{
  int l,b;
public  void area()
  {
  Scanner sc = new Scanner(System.in);

    System.out.println ("Enter the length of Rectangle:");
    l = sc.nextInt();
    System.out.println ("Enter the breadth of Rectangle:");
    b = sc.nextInt();
    int a=l*b;
    System.out.println ("Area of Rectangle is "+a +"sq units");
  }

  public  void perimeter()
    {
      Scanner sc = new Scanner(System.in);

        System.out.println ("Enter the length of Rectangle:");
        l = sc.nextInt();
        System.out.println ("Enter the breadth of Rectangle:");
        b = sc.nextInt();
        int a=2*(l+b);
        System.out.println ("Area of Rectangle is "+a +"sq units");
    }
}

   class Circle implements TestInterface
   {

     int r;

   	public void area()
   	{
   			Scanner sc = new Scanner(System.in);

   		System.out.println ("Enter the radius of circle");
   		 r = sc.nextInt();


   		double b=3.14*r*r;
   		System.out.println ("Area of Circle is "+b+"sq units");
   	}

public    void perimeter()
   	{
   			Scanner sc = new Scanner(System.in);

   		System.out.println ("Enter the radius of circle");
   		 r = sc.nextInt();


   		double b=2*3.14*r;
   		System.out.println ("Area of Circle is "+b+"sq units");
   	}
   }
class InterFz
{
    public static void main(String[] args)
    {
      int a;

        Rectangle r = new Rectangle();
          Circle c = new Circle();
          do
          {
            System.out.println("Enter your choice");
            System.out.println("1.To calculate area of Rectangle ");
          System.out.println("2.To calculate perimeter of Rectangle ");
          System.out.println("3.To calculate area of Circle");
          System.out.println("4.To calculate perimeter of Circle");
          Scanner sc = new Scanner(System.in);
a=sc.nextInt();

          switch(a)
          {
            case 1:
                   r.area();
                   break;
                   case 2:
                          r.perimeter();
                          break;
                          case 3:
                                 c.area();
                                 break;
                                 case 4:
                                        c.perimeter();
                                        break;
                                        default: System.out.println("WRONG CHOICE");
                                        break;
          }}
          while(a<=4);


    }
}
