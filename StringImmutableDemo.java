import java.io.*;
import java.lang.String;
public class StringImmutableDemo
{
    public static void main(String args[])
    {
        String s1="SASI";
        s1.concat("SITE");
        System.out.println("After concatinating s1 and s3 is "+s1);
        String s="REKHA";
        s=s.concat("SATTI");
        System.out.println("After concatinating s1 and s2 is "+s);
    }
}

