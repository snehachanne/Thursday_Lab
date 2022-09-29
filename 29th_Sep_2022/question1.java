package question1;
//Lab QUE1: Write a program to accept a number from user and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class question1 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);	
		int sum_even=0, sum_odd=0,n;
		char ch;
		do
		{
	    System.out.println("Enter No:");
	    n=in.nextInt();
	    if(n%2==0)
	    {
	    	sum_even+=n;
	    }
	    else
	    {
	    	sum_odd+=n;
	    }
	    System.out.println("Do you want to enter no again..(y/n)");
	    ch=in.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
		System.out.println("Addition of even no = "+sum_even);
		System.out.println("Addition of even no = "+sum_odd);
	}

}
