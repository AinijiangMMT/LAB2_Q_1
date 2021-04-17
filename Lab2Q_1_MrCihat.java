package questionAnswerDiscord;
import java.util.Scanner;
public class Lab2Q_1_MrCihat {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num = input.nextInt();
        int smallest = num;
        int largest = num;
        int decider;

        for (int i = 0; true; i++) {

            System.out.println("Enter your next number: ");
            num = input.nextInt();

            System.out.println("Do you want to enter another number? 0-No, 1-Yes");
            decider = input.nextInt();

            if (num < smallest) {
                smallest = num;
            } else if (num > largest) {
                largest = num;
            }

            if (decider == 0) {
                break;
            }

            if (decider != 0 && decider != 1) {
                System.out
                        .println("invalid request!! Program is going to stop execution with" + " current result.....");
                break;
            }

        }

        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);

    }

}


