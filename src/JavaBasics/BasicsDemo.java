package JavaBasics;

import java.util.Scanner;

public class BasicsDemo {

	public static void main(String[] args)
	{
		
		Scanner scanner =new Scanner(System.in);
		
//		System.out.println("Enter age: ");
//		
//		int age =scanner.nextInt();
//		
//		if(age < 18)
//		{
//		System.out.println("Not eligible to vote");
//		}
//		else
//		{
//			System.out.println("Eligible to vote!");
//		}
		scanner.close();
		pattern2();
	}
	private static void guess(Scanner scanner)
	{
		int number = scanner.nextInt();
	}
//	//To display pattern
//	 1
//	 12
//	 123
//	private static void pattern()
//	{
//		for(int i=1;i<=3;i++)
//		{
//			for(int j =1; j<=i;j++)
//			{
//		  System.out.print(j);
//			}
//			System.out.println();
//		}
		private static void pattern2()
		{
			int k=1;
			for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(k);
					k++;
				}
				System.out.println();
			}
		
	}

}
