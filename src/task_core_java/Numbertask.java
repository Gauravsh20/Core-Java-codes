package task_core_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbertask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter an integer: ");

			try {
				int num = scanner.nextInt();
				System.out.println("Hello");
				break;
			} catch (InputMismatchException e) {
				System.out.println("Not an integer");
				scanner.nextLine(); // consume the invalid input
			}
		}
	}
}
