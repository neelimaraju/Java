package JavaBasics;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) 
	{
		int month,year;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Year (yyyy) :");
		
		year =sc.nextInt();
		
       Scanner sc1 =new Scanner(System.in);
		
		System.out.println("Enter Month 1 to 12 :");
		
		month =sc1.nextInt();
		
		if((month==2) && (year%4==0))
		{
			System.out.println("Number of days is 29");
		}
		else if(month==2)
		{
			System.out.println("Number of days is 28");
		}
		else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)

	    {

			System.out.println("Number of days is 31");
	    }
		else

	    {

			System.out.println("Number of days is 30");
	    }
	}

}
