package question1;
/*Lab QUE3: WAP to accept a no from user and check it is prime or not.
Pass this number in different function and check it is even or odd. 
IF number is even than check it 
is divisible by 10 or not in different function and is no is
odd than check it is divisible by 3 or not in different function*/
import java.util.*;

public class question_3
{

	public static void main(String[] args) 
	{
		
		Scanner in=new Scanner(System.in);
		question_3 q=new question_3();
		int n,i,temp=0;
		char ch;
		do
		{
		System.out.println("Enter no");
		n=in.nextInt();
		    for (i=1;i<=n;i++)
		    {
		     if(n%i==0)
		     {
		    	temp++; 
		     }
		    }

		    if (temp==2)
		    {
		      System.out.println(n+ " is a prime number.");
		    }
		    else
		    {
		      System.out.println(n + " is not a prime number.");
		    }
		 q.even_odd(n);
		 System.out.println("Do you want to enter another no");
		 ch=in.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
	     
	}
	void even_odd(int n)
	{
		if(n%2==0)
		{
			System.out.println(n+" is even no");
		    divisible_10(n);
		}
		else
		{
			System.out.println(n+" is odd no");
			divisible_3(n);
		}
	}
	void divisible_10(int n)
	{
		if(n%10==0)
			System.out.println(n+" is divisible by 10");
		else
			System.out.println(n+" is not divisible by 10");
	}
	void divisible_3(int n) 
	{
		if(n%3==0)
			System.out.println(n+" is divisible by 3");
		else
			System.out.println(n+" is not divisible by 3");
	}

}
