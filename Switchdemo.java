import java.io.*;
import java.util.Scanner;
public class Switchdemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from 0 to 5 ");
        int num=sc.nextInt();
        switch(num){
            case 0: System.out.println("You entered Zero");
                    break;
            case 1:System.out.println("You entered one");
                    break;
            case 2:System.out.println("You entered Two");
                    break;
            case 3:System.out.println("You entered Three");
                    break;
            case 4:System.out.println("You entered Four");
                    break;
            case 5:System.out.println("You entered Five");
                    break;
            default:System.out.println("You entered invalid number");
        }
    }
}
