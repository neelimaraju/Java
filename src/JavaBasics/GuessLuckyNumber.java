package JavaBasics;

import java.util.Scanner;

public class GuessLuckyNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

			System.out.println("Guess my Lucky Number from 1 to 10: ");
		int luckyNum = 7;
		int num = scanner.nextInt();
		int count=1;
		
		while(luckyNum!= num)
		{
			count++;
	
			System.out.println("You guess was wrong.\n Try again.");
			num=scanner.nextInt();
			
	
		}
		
		System.out.println("You guessed it in "+count+" guesses.");
	}

}

