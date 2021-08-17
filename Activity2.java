/*Design an algorithm to accept 10 integer elements for an array and then find the number of
times the number with the maximum value occurs in the array.
For Example –
If input elements are: 1, 2, 5, 6, 8, 9, 9, 3, 4, and 2
Output must be 2
Reason: The number with the highest value in the array is 9. It occurs 2 times in the array.*/

import java.util.*;
public class Activity2 {

	public static void main(String[] args) {
		int n=25,c=0, max;
		Scanner s = new Scanner(System.in);
		int a[] = new int[n];
		System.out.println("Enter the elements of array:");
		for(int i = 0; i< n; i++)
		{
			a[i] = s.nextInt();
		}
		max = a[0];
		for(int i = 0; i< n; i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
		for(int i = 0; i< n; i++)
		{
			if(max == a[i])
			{
				c=c+1;
			}
		}
		System.out.println(c);
	}

}
