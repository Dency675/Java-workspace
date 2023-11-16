package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q18RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array : ");
		int arraySize = scanner.nextInt();

		int numberArray[] = new int[arraySize];
		int temporaryNumberArray[] = new int[arraySize];

		int flag = 0;
		int temporaryPosition = 0;

		System.out.print("Enter the elements in the array : ");
		for (int index = 0; index < numberArray.length; index++) {
			numberArray[index] = scanner.nextInt();
		}

		for (int index = 0; index < numberArray.length; index++) {
			flag = 0;
			for (int index2 = 0; index2 < temporaryNumberArray.length; index2++) {
				if (numberArray[index] == temporaryNumberArray[index2]) {
					flag = 1;
				}

			}
			if (flag == 0) {
				temporaryNumberArray[temporaryPosition] = numberArray[index];
				temporaryPosition++;
			}
		}

		System.out.println("Array after removal of duplicates : ");
		for (int index = 0; index < temporaryPosition; index++) {
			System.out.print(temporaryNumberArray[index] + " ");

		}

	}

}
