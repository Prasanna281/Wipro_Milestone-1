/*A train X m long passes a man, running at 5 km/hr in the same direction in which the train is
going, in Y seconds. Design an algorithm to accept the values of X and Y as input from the user
and then calculate the speed of the train.
Note: values of X and Y must be positive and non-zero.*/

import java.util.*;
public class Activity8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		float ans=(float)x/(float)y;
		float result=ans*(float)18/(float)5;
		System.out.println((int)result+5);

	}

}
