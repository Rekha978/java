import java.io.*;
import java.util.*;
class Evenodd
{
 public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter an integer to check the whether it is even or odd ");
	num=sc.nextInt();
	if(num%2==0)
	{
	 System.out.println(num+"Even integer");
	}
	else
	{
	 System.out.println(num+"odd integer");
	}
   }
 }
