/*Design an algorithm to find the greatest number that will divide 43, 91 and 183 so as to leave
the same remainder in each case.*/

public class Activity14 {

	public static void main(String[] args) {
		int a=43,b=91,c=183;
		int d=Math.abs(a-b);
		int e=Math.abs(b-c);
		int f=Math.abs(c-a);
		int m=((d>e)?d:e)>f?e:f;
		int max=0,s=0;
		for(int i=2;i<=m;i++)
		{
			if(d%i==0 && e%i==0 && f%i==0)
			{
				if(i>max)
				{
					max=i;
				}
			}
		}
		System.out.print(max);	
	}

}
