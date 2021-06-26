import java.util.*;
class Swapping
{
  public static void main(String args[])
  {
    int x,y;
    System.out.println("enter two numbers");
    Scanner scn=new Scanner(System.in);
    x=scn.nextInt();
    y=scn.nextInt();
    System.out.println("numbers before swapping");
    System.out.println(+x +" " +y);
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("numbers after swapping");
    System.out.println(+x +" " +y);
    }
}  