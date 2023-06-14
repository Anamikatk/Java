import java.util.*;
public class p8
{
	public static void main(String[] args)
	{
		int n,x;
		int loc=-1;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size of array : ");
		n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter element you want to search : ");
		x=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(x==a[i]){
				loc=i;
				break;
			}
		}
		if(loc==-1)
		{
			System.out.println("%d is not found."+x);
		}
		else
		{
			System.out.println(x+" is found at "+loc);
		}
	}
}
				
