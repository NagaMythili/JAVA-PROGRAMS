import java.util.*;
class Pro14
{
	public static void main(String...P)
	{
		int max_value=0,sum=0;
		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the vaues");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int x:a)
		{
			if(max_value<x)
			{
				max_value=x;
			}
		}
		for(int i=0;i<a.length;i++)
		{
		if(a[i]==max_value)
		{
			continue;
		}
		sum+=a[i];

	}
	System.out.println("Sum of the remaining array elements except max  : "+sum);
	}
}