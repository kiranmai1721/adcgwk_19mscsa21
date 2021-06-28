import java.util.*;
class VowelsUsingSwitch
{
 public static void main(String args[])
 {
  char ch,temp;
  System.out.println("enter a character");
  Scanner scn=new Scanner(System.in);
  ch=((scn.nextLine()).charAt(0));
  temp=Character.toUpperCase(ch);
  switch(temp)
  {
   case 'A':
   case 'E':
   case 'I':
   case 'O':
   case 'U':System.out.println("vowel");
   break;
   default:
   System.out.println("consonant");
  }
}
}