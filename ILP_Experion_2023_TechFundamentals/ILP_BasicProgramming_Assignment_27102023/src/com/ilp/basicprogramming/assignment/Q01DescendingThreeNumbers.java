package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q01DescendingThreeNumbers {
	int firstNumber, secondNumber, thirdNumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q01DescendingThreeNumbers assignment = new Q01DescendingThreeNumbers();
		assignment.order();

	}

	public void order() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		int thirdNumber = scanner.nextInt();
		System.out.print("The order of three numbers are ");
		if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
			if (secondNumber > thirdNumber) {
				System.out.print(firstNumber + " " + secondNumber + " " + thirdNumber);
			} else {
				System.out.print(firstNumber + " " + thirdNumber + " " + secondNumber);
			}
		} else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
			if (firstNumber > thirdNumber) {
				System.out.print(secondNumber + " " + firstNumber + " " + thirdNumber);
			} else {
				System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);
			}
		} else {
			if (firstNumber > secondNumber) {
				System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
			} else {
				System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
			}
		}
	}
}
