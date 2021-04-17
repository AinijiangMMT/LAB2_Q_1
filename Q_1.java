package questionAnswerDiscord;

import java.util.Scanner;

public class Q_1{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int nums = 0;
		System.out.println("Enter your first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter your next number:");
		int num2 = sc.nextInt();
		if (num1 >= num2) {
			num = num1;
			nums = num2;
		} else {
			num = num2;
			nums = num1;

			do {

				System.out.println("Do you want to enter another number: 0-No, 1- yes");

				int num3 = sc.nextInt();
				if (num3 == 0) {
					System.out.println("Smallest Number is:" + nums);
					System.out.println("Largest Number is:" + num);
					break;

				} else {
					System.out.println("Enter your next number:");
					int num4 = sc.nextInt();
					if (num <= num4) {
						num = num4;
						continue;
					} else {
						if (nums > num4) {
							nums = num4;
							continue;
						} else {

							continue;
						}
					}
				}
			} while (true);
		}
	}
}
