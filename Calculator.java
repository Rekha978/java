import java.io.*;
import java.util.Scanner;
class Calculator
{
    public static void main(String args[])
    {
        char operator;
        Double number1,number2,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter two numbers to perform calculator");
        number1=sc.nextDouble();
        number2=sc.nextDouble();
        System.out.println("\nChoose an operation(+,-,*,/ or %):");
        operator=sc.next().charAt(0);
        switch(operator)
        {
            case'+':
                result=number1+number2;
                System.out.println("\n"+number1+ "+" +number2+ "=" +result);
                break;
            case'-':
                result=number1-number2;
                System.out.println("\n"+number1+ "-" +number2+ "=" +result);
                break;
            case'*':
                result=number1*number2;
                System.out.println("\n"+number1+ "*" +number2+ "=" +result);
                break;
            case'/':
                result=number1/number2;
                System.out.println("\n"+number1+ "/" +number2+ "=" +result);
                break;
            case'%':
                result=number1%number2;
                System.out.println("\n"+number1+ "%" +number2+ "=" +result);
                break;
            default:
                System.out.println("\n"+"Invalid operator!");
        }
    }
}
