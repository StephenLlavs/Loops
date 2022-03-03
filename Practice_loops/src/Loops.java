import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		int[] nums = new int[9];

		System.out.println("Enter 10 Numbers: ");
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 9; i++) {
			System.out.print("Enter your numbers>> ");
			nums[i] = input.nextInt();
		}

		for (int i = 0; i < 9; i++) {
			System.out.println(nums[i]);
		}

		System.out.println("Here are your numbers listed Backwards");

		for (int i = nums.length-1; i >= 0; i--) {
			
			System.out.println(nums[i]);
		}

	}

}
