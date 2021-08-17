/*In an election between two candidates, one got 55% of the total valid votes, 20% of the votes
were invalid. The total number of votes was X (value greater than 5000), design an algorithm to
accept a value for X from the user and calculate the number of valid votes that the other
candidate got.*/

import java.util.*;
public class Activity9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int valid=x*80/100;
		int result=valid*45/100;
		System.out.println(result);
	}

}
