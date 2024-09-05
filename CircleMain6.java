import java.io.*;
  import java.util.*;
  class CircleArea
  {
      double r;
      CircleArea()
      {
          r=0;
      }
      CircleArea(double r)
      {
          this.r=r;
      }
      CircleArea(int r)
      {
          this.r=r;
      }
      double area()
      {
          return(22/7.0)*r*r;
      }
      double area(double x)
      {
          return(22/7.0)*x*x;
      }
      void setCircle(double r)
      {
          this.r=r;
      }
  }
  public class CircleMain6
  {
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          CircleArea c1=new CircleArea();
          CircleArea c2=new CircleArea(3.6);
          CircleArea c3=new CircleArea(5);
          System.out.println("Area of first circle is : "+c1.area());
          System.out.println("Area of first circle obtated is : "+c1.area(8.0));
          System.out.println("Enter redius of  circle: ");
          double radius=sc.nextDouble();
          CircleArea c4=new CircleArea();
          c4.setCircle(radius);
          System.out.println("Area of second circle  is: "+c2.area());
          System.out.println("Area of third circle is: "+c3.area());
          System.out.println("Area of Fourth circle is"+c4.area());
          
      }
  }
