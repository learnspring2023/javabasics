package loops;

import java.util.Scanner;

public class LearnLoops {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the statement to be printed");
		String line = scanner.nextLine();
		System.out.println("Enter the number of times to be printed");
		int times = scanner.nextInt();
		System.out.println("times:"+times);
		for (int x = 1; x <= times; x++) {
			System.out.println(x+":"+line);
		}

	}
}
