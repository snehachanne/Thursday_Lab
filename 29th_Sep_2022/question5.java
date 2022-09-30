package question1;
import java.util.*;
//Lab QUE5: WAP to accept no from user in array and find out average and sum of array numbers.

public class question5 
{

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int i,avg,sum=0,size;
		System.out.println("Enter size of array");
		size=in.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements");
		for(i=0;i<size;i++)
		{
			a[i]=in.nextInt();
		
		}
		for(i=0;i<size;i++)
		{
			sum+=a[i];
		}
		System.out.println("Sum of array = "+sum);
		System.out.println("Average of array = "+(sum/size));
	}

}
