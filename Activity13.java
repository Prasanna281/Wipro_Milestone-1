/*The difference between the length and breadth of a rectangle is 23 m. If its perimeter is 206 m,
design an algorithm to calculate its area.*/

import java.util.*;
public class Activity13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l,b,d=23;
		int p=206;
		int s=p/2;
		l=(s+d)/2;
		b=l-d;
		int area=l*b;
		System.out.println(area);
	}

}
