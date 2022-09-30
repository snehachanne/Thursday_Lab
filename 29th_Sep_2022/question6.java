package question1;
//Lab QUE6 : WAP to display prime no between 1 to 150 in two dimension array

public class question6 {

	public static void main(String[] args)
	{int i =0;
    int num =0;
    //Empty String
    String  primeNumbers = "";

    for (i = 1; i <= 150; i++)         
    { 		  	  
       int counter=0; 	  
       for(num =i; num>=1; num--)
	  {
          if(i%num==0)
	     {
		 counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
		 
	    System.out.print(" "+i);
	  }	
    }	
   
	}

}
