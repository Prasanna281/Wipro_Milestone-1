/*Design an algorithm to accept a number from the user and check if it a prime number or not.*/

import java.util.*;
public class Activity12 {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   int number=sc.nextInt();
		   int flag=0;
		   for(int i=1;i<=number;i++)
		   {
		       if(number%i==0)
		       {
		           flag+=1;
		       }
		   }
		   if(flag==2)
		   {
		       System.out.print("The given number is prime number");
		   }
		   else{
		       System.out.print("The given number is not prime number");
		   }
	}

}
