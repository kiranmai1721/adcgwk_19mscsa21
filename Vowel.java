import java.util.*;
class Vowel
{
 public static void main(String args[])
 {
  char ch;
  System.out.println("enter a character");
  Scanner scn=new Scanner(System.in);
  ch=scn.next().charAt(0);
  if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
  System.out.println("vowel");
  else
  System.out.println("consonant");
 }
}