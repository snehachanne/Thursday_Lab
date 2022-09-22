import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class hotel_bill
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int menu_item, menu1,qty;
        String s1="";
        int total=0;  
		char ans,st,ma,de;
        int a[];
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Menu:\n1:Starters \n2:Main course \n3:Deserts");
			menu_item=sc.nextInt();
			switch(menu_item)
			{
			case 1:
                do
                {
				System.out.println("1:Veg Manchurian\t\t 160Rs.");
				System.out.println("2:Paneer Tikka   \t\t 190Rs.");
				System.out.println("3:Veg Crispy     \t\t 170Rs.");
                System.out.println("Order your fav starter");
                menu1=sc.nextInt();
                System.out.println("Enter quantity");
                qty=sc.nextInt();

                if(menu1==1)
                {
                    s1+="\nVeg Manchurian\t\t "+qty+"\t160Rs.";
                    total=total+(160*qty);
                }
                else if(menu1==2)
                {
                    s1+="\nPaneer Tikka   \t\t "+qty+"\t190Rs.";
                    total=total+(190*qty);
                }
                else
                {
                    s1+="\nVeg Crispy     \t\t "+qty+"\t170Rs.";
                    total=total+(170*qty);
                }
                System.out.println("Do you want to add any Starter:(y/n)");
                st=sc.next().charAt(0);
                }
                while(st=='Y'||st=='y');
                break;
			case 2:
                do
                {
				System.out.println("1:Kaju Masala   \t\t 300Rs.");
				System.out.println("2:Cheeze Anguri \t\t 350Rs.");
				System.out.println("3:Malai Kofta   \t\t 250Rs.");
                System.out.println("Order your fav Item");
				menu1=sc.nextInt();
                System.out.println("Enter quantity");
                qty=sc.nextInt();

                if(menu1==1)
                {
                    s1+="\nKaju Masala   \t\t "+qty+"\t300Rs.";
                    total=total+(300*qty);
                }
                else if(menu1==2)
                {
                    s1+="\nCheeze Anguri \t\t"+qty+"\t350Rs.";
                    total=total+(350*qty);
                }
                else
                {
                    s1+="\nMalai Kofta   \t\t "+qty+"\t250Rs.";
                    total=total+(250*qty);
                }
                System.out.println("Do you want to add any Item in main Course:(y/n)");
                ma=sc.next().charAt(0);
                }
                while(ma=='Y'||ma=='y');
                break;
				
			case 3:
               do
               {
				System.out.println("1:Icecream    \t\t 120Rs.");
				System.out.println("2:Gulab Jamun \t\t 150Rs.");
				System.out.println("3:Cake        \t\t 160Rs.");
                System.out.println("Order your fav Desseret");
				menu1=sc.nextInt();
                System.out.println("Enter quantity");
                qty=sc.nextInt();
                if(menu1==1)
                {
                    s1+="\nIcecream    \t\t "+qty+"\t120Rs.";
                total=total+(120*qty);
                }
                else if(menu1==2)
                {
                    s1+="\nGulab Jamun \t\t "+qty+"\t150Rs.";
                total=total+(150*qty);
                }
                else
                {
                    s1+="\nCake        \t\t "+qty+"\t160Rs.";
                total=total+(160*qty);
                }
                System.out.println("Do you want to add any Dessert:(y/n)");
                de=sc.next().charAt(0);
                }
                while(de=='Y'||de=='y');
                break;
                default:
                System.out.println("Please enter valid choice..");
                break;
            }
            System.out.println("Do you want to add another item y/n");
			ans=sc.next().charAt(0);
		}
      
		while(ans=='Y'||ans=='y');
        System.out.println("Your Ordered Items Are:");
        System.out.println("Item   \t\t      Quantity\tCost");
        System.out.println("---------------------------------------");
        System.out.println(s1);
        System.out.println("---------------------------------------");
        System.out.println("Total=   \t\t\t" +total);
		System.out.println("Thanks for coming");

	}

}