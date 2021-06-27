import java.util.*;
class LeapYear
{
 public static void main(String args[])
 {
  int n;
  System.out.println("enter a year");
  Scanner scn=new Scanner(System.in);
  n=scn.nextInt();
  if(n%4==0)
  {
   if(n%100==0)
   {
    if(n%400==0)
    { 
    System.out.println("Leap year");
    }
    else
    System.out.println("not a leap year");
   }
  else 
  System.out.println("leap year");
  }
  else
  System.out.println("not a leap year");
 }
}
