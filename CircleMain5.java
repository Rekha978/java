import java.io.*;
  import java.util.*;
  class CircleArea
  {
      double r;
      CircleArea()
      {
          r=0;
      }
      CircleArea(double c)
      {
          r=c;
      }
      double area()
      {
          return(22/7.0)*r*r;
      }
      void setCircle(double r)
      {
          this.r=r;
      }
  }
  public class CircleMain5
  {
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          CircleArea ob1=new CircleArea();
          CircleArea ob2=new CircleArea(5);
          System.out.println("Enter radius of  circle-1: ");
          double radius=sc.nextDouble();
          ob1.setCircle(radius);
          System.out.println("Area of first circle is "+ob1.area());
          System.out.println("Area of the second circle is "+ob2.area());
      }
  }
