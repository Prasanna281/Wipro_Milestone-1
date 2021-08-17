/*A train running at the speed of x km/hr crosses a pole in y seconds. Design an algorithm to
accept x and y as inputs from the user and then calculate the length of the train.
Note: values of x and y must be positive and non-zero.*/

import java.util.*;
public class Activity7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		x=x*1000;
		float ans=(float)x/(float)3600;
		System.out.println(ans*y);
	}

}
