package questionAnswerDiscord;

import java.util.Scanner;

public class AsliyaQ_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int smallest = 0;
		int largest = 0;

		System.out.print("Enter your first number:");
		int entry = sc.nextInt();
		System.out.print("Enter your next number:");
		int num = sc.nextInt();
		if (num <= entry) {
			largest = entry;
			smallest = num;
		} else {
			largest = num;
			smallest = entry;
		}

		do {

			System.out.print("Do you want to enter another number? 0-No, 1-Yes");

			int entry1 = sc.nextInt();

			if (entry1 == 0) {
				System.out.println("largest " + largest);
				System.out.println("smallest " + smallest);
				break;

			} else if (entry1 == 1) {
				System.out.print("Enter your next number:");
				int num2 = sc.nextInt();

				if (num2 >= largest) {
					largest = num2;
				} else {

					if (num2 <= smallest) {
						smallest = num2;
					} else {
						continue;
					}
				}
			}

		} while (true);

	}
}
