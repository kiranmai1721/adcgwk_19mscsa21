import java.util.*;
class EvenOdd
{
     public static void main(String args[])
     {
       Scanner scn = new Scanner(System.in);
       System.out.println("enter the number");
       int n=scn.nextInt();
       String temp="null";
       temp = ((n & 1) ==0)?"even":"odd";
       System.out.println(temp);
     }
}
