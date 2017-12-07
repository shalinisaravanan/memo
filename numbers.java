import java.io.*;
import java.util.*;
public class numbers
{
public static void main(String args[])
{
int number;
sc=new Scanner(System.in);
System.out.println("enter the integer value");
number=sc.nextInt();
if(number>=0)
{
System.out.println("Given number is positive");
}
else
{
System.out.println("given number is negative");
}
}
}
