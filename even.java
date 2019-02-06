/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int num;
    System.out.println("number:");

   
    Scanner input = new Scanner(System.in);
    num = input.nextInt();

   if ( num % 2 == 0 )
   {
        System.out.println(" Even");
   }
     else if (num%2<0)
     {
     	System.out.println("invalid");
     }
     else
     {
     System.out.println("Odd");
  }
}
}
