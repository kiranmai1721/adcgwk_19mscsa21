import java.util.*;
class RangeOfEven
{
 public static void main(String args[])
 {
  int n,m;
  Scanner scn=new Scanner(System.in);
  System.out.println("enter the range values");
  n=scn.nextInt();
  m=scn.nextInt();
  System.out.println("even numbers in the given range in reverse order are");
  for(int i=m;i>=n;i--)
  {
   if(i%2==0)
   System.out.println(i);
  }
 }
}