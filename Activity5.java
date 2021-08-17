/*Design an algorithm which accepts 10 integer values, calculates the average and prints it.*/

import java.util.*;
public class Activity5 {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  int a=0;
		  for(int i=0;i<10;i++)
		  {
			  System.out.print("Input "+i+" number: ");
			  int n = in.nextInt();
			  a+=n;	  
		  }
		  System.out.println("Average of ten5 numbers is: " + (a/ 10));
		
	}

}
