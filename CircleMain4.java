import java.io.*;
  import java.util.*;
  class CircleArea
  {
      double x,y,r;
      CircleArea()
      {
          x=0;
          y=0;
          r=0;
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
  public class CircleMain4
  {
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          CircleArea ob1=new CircleArea();
          CircleArea ob2=new CircleArea();
          System.out.println("Enter radius of first circle:");
          double radius1=sc.nextDouble();
          System.out.println("Enter radius of second circle:");
          double radius2=sc.nextDouble();
          ob1.setCircle(radius1);
          ob2.setCircle(radius2);
          System.out.println("Area of first circle is"+ob1.area());
          System.out.println("Area of the second circle is"+ob2.area());
      }
  }
