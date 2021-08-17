/*Design an algorithm to print a pyramid based on level entered by the user.
Sample output is shown below.
Enter the level of pyramid: 10
The pyramid is -
         1
        232
       45654
      7890987
     123454321
    67890109876
   2345678765432
  901234565432109
 78901234543210987
6789012345432109876*/

import java.util.*;
public class Activity3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the level of pyramid : ");
		int n=sc.nextInt();
		int p=1,s=n-1,num=1;
		System.out.println("The pyramid is -");
		while(p<=n){
			for(int i=1;i<=s;i++)
				System.out.print(" ");
			for(int i=1;i<=p;i++){
				if(num>9){
					num=num%9-1;
				}
				System.out.print(num);num++;
			}
			int rev=num-2;
			for(int i=1;i<p;i++){
				if(rev<0){
					rev=9;
				}
				System.out.print(rev);
				rev--;
			}
			p++;System.out.print("\n");
			s--;
		}
	}

}
