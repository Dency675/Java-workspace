package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q17NumbersAddUpToSum8_v01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array (Don't enter repeated numbers): ");
		int arraySize = scanner.nextInt();

		int numberArray[] = new int[arraySize];

		System.out.print("Enter the elements of the array: ");
		for (int index = 0; index < numberArray.length; index++) {
			numberArray[index] = scanner.nextInt();
		}

		int sum = 0;
		int temp1, temp2;
		System.out.println("Possible combination of numbers that are add to sum 8 are : ");
		for (int index = 0; index < numberArray.length; index++) {
			temp1 = numberArray[index];
			if (numberArray[index] <= 8) {
				for (int index2 = index + 1; index2 < numberArray.length; index2++) {
					sum = numberArray[index];
					if ((sum + numberArray[index2]) <= 8) {
						if ((sum + numberArray[index2]) == 8)
							System.out
									.println(temp1 + " + " + numberArray[index2] + " = " + (sum + numberArray[index2]));
						temp2 = numberArray[index2];
						sum += numberArray[index2];
						for (int index3 = index2 + 1; index3 < numberArray.length; index3++) {
							sum = temp1 + temp2;
							if ((sum + numberArray[index3]) <= 8) {
								sum += numberArray[index3];
								if (sum == 8)
									System.out
											.println(temp1 + " + " + temp2 + " + " + numberArray[index3] + " = " + sum);
							}
						}
					}
				}
			}
		}

	}

}
