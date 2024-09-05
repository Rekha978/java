 import java.io.*;
  import java.util.*;
  class CircleArea
  {
      double r;
      double area()
      {
          return(22/7.0)*r*r;
      }
      void setCircle(double r)
      {
          this.r=r;
      }
  }
  public class CircleMain3
  {
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          CircleArea ob1=new CircleArea();
          CircleArea ob2=new CircleArea();
          System.out.println("Enter radius of two circles:");
          double radius1=sc.nextDouble();
          double radius2=sc.nextDouble();
          ob1.setCircle(radius1);
          ob2.setCircle(radius2);
          System.out.println("Area of first circle is"+ob1.area());
          System.out.println("Area of the second circle is"+ob2.area());
      }
  }
