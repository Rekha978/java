import java.io.*;
import java.util.*;
import java.lang.*;
class Primitivedatatypes
{
    static byte a;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static char g;
    static boolean h;
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("byte value: ");
        a=obj.nextByte();
        System.out.print("short value: ");
        b=obj.nextShort();
        System.out.print("int value : ");
        c=obj.nextInt();
        System.out.print("long value: ");
        d=obj.nextLong();
        System.out.print("float value: ");
        e=obj.nextFloat();
        System.out.print("double value: ");
        f=obj.nextDouble();
        System.out.print("char value: ");
        g=obj.next().charAt(0);
        System.out.print("boolean value: ");
        h=obj.nextBoolean();
        System.out.println("bytevar: "+a);
        System.out.println("shortvar: "+b);
        System.out.println("intvar: "+c);
        System.out.println("longvar: "+d);
        System.out.println("floatvar: "+e);
        System.out.println("doublevar: "+f);
        System.out.println("charvar: "+g);
        System.out.println("booleanvar: "+h);
    }
}
