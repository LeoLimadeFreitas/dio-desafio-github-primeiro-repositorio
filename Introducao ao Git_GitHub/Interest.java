package week3;
import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("This program will ask the user for a monthly deposit,"
				+ " and an annual interest rate, and then calculate the balance after 6 months.\n");
		//Variables
		int months = 6;
		System.out.println("Please enter the amount to be deposited each month:");
		int dep = Integer.parseInt(input.nextLine());
		System.out.println("Please enter the annual interest rate percent:");
		double rate = Double.parseDouble(input.nextLine());
		rate /= 1200;
		rate++;
		//Result
		double res = dep*(rate + (Math.pow(rate, 2)) + (Math.pow(rate, 3)) + 
				(Math.pow(rate, 4)) + (Math.pow(rate, 5) + (Math.pow(rate, 6))));//Future Value formula
		
		System.out.printf("\nThe ending balance after 6 months is: $%.2f", res);
	}

}
