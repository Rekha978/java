import java.io.*;
import java.util.*;
class CircleArea2{
    double x,y,r;
    double area()
    {
        return(22/7.0)*r*r;
    }

void setCircle(double a,double b,double c)
    {
     x=a;
     y=b;
     r=c;
    }
}
public class CircleMain2
{
    public static void main(String args[])
    {
        CircleArea2 ob1=new CircleArea2();
        CircleArea2 ob2=new CircleArea2();
        ob1.setCircle(3.0,4.0,100);
        ob2.setCircle(5.0,7.0,90);
        System.out.println("Area of circle 1 is "+ob1.area());
        System.out.println("Area of circle 2 is "+ob2.area());
        
        
    }
}
