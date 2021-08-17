/*Design an algorithm to accept 25 integer elements for an array then find the maximum number
in the set and display it.*/

import java.util.*;
public class Activity1 {

	public static void main(String[] args) {
		int n=25, max;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[n];
		System.out.println("Enter the elements of array:");
		for(int i = 0; i< n; i++)
		{
			a[i] = sc.nextInt();
		}
		max = a[0];
		for(int i = 0; i< n; i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
		System.out.println("Maximum value in the array is:"+max);
	}

}
