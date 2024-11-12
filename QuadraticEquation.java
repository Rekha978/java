import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class QuadraticEquation
{
    public static void main(String args[])
    {
        double a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.print("Coefficient of a: ");
        a=obj.nextDouble();
        System.out.print("Coefficient of b: ");
        b=obj.nextDouble();
        System.out.print("Coefficient of c : ");
        c=obj.nextDouble();
        double d=b*b-4*a*c;
        double r1=(-b+Math.sqrt(d))/(2*a),r2=(-b-Math.sqrt(d))/(2*a);
    
        if (d>0)
        {
             System.out.println("roots are real and distinct ");
             System.out.println("Root1 : "+r1);
             System.out.println("Root2 : "+r2);
        
         }
        else if(d==0)
        {
            System.out.println("roots are equal ");
            System.out.println("root : "+r1);
        }
        else
            System.out.println("roots are imaginary");
    }
}
