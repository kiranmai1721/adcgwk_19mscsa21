import java.util.*;
class EvenOddDigits
{
 public static void main(String args[])
 {
  int n;
  Scanner scn=new Scanner(System.in);
  System.out.println("enter the n value");
  n=scn.nextInt();
  int even=0,odd=0;
  while(n>0)
  {
   int rem=n%10;
   if(n%2==0)
    even+=1;
   else
    odd+=1;
   n=n/10;
  }
  System.out.println(even + "even digits");
  System.out.println(odd + "odd digits");
 }
}