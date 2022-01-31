package question1.driver;

import java.util.Scanner;

import question1.utilities.BalanceBrackets;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string containing brackets:");
		String str = sc.nextLine();
		
		BalanceBrackets balanceBrackets = new BalanceBrackets(str);
		
		balanceBrackets.findBrackets();
		
		sc.close();
	}

}