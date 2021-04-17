package questionAnswerDiscord;

import java.util.Scanner;

public class BunyaminPinarLab2_Q1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first number:");
		int firstNum = scan.nextInt();
		int largest, smallest, answer, firstNumber, nextNumer;

		System.out.print("Enter your next number:");
		int nextNumber = scan.nextInt();
		if (firstNum > nextNumber) {
			largest = firstNum;
			smallest = nextNumber;
		} else {
			smallest = firstNum;
			largest = nextNumber;

		}

		System.out.print("Do you want to enter another number: 0-No, 1-Yes");
		answer = scan.nextInt();

		while (answer == 1) {
			System.out.print("Enter your next number:");
			nextNumber = scan.nextInt();

			if (nextNumber > largest) {
				largest = nextNumber;
			} else if (nextNumber < smallest) {
				smallest = nextNumber;
			}

			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			answer = scan.nextInt();
		}

		System.out.println("Smallest Number is:" + smallest);
		System.out.println("Largest Number is:" + largest);
	}

}