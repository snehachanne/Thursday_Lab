package question1;
//Lab QUE2:Write a program to calculate HCF of Two given number.
import java.util.*;
public class question2 
{

	public static void main(String[] args) 
	{
		int diff,a,b,hcf=1,min;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two no:");
		a=in.nextInt();
		b=in.nextInt();
		min=a<b?a:b;
		if(a%min==0 && b%min==0)
		{	
		hcf=min;
		}
		else
		{
		if(a>b)
		{
        diff=a-b;
		}
		else
		{
		diff=b-a;
		}

		while(diff>=1)
		{

		if(a%diff==0 && b%diff==0)

		{
		hcf=diff;

		break;
		}
        else
        {
		diff=diff/2;

		}
        }
		}
    System.out.println("HCF = "+hcf);

	}

}
