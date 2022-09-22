import java.util.*;
//Write a program to accept a number from the user and check if a given number is palindrome or not.
public class Palindrom 
{
    public static void main(String args[])
    {
        int num,temp,sum=0,r;// Declare all the require variable
        System.out.println("Enter number:");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        temp=num; // temporary stored the value of num into temp variable
        while(num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum) //compare the originl value of num and the sum is euqual or not
        {
            System.out.println(temp+" is palindrom num");
        }
        else
        {
            System.out.println(temp+" is not palindrom num");
        }
    }
}
