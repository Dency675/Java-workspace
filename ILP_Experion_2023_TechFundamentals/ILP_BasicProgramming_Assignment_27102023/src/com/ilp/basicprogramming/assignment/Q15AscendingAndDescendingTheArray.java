package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q15AscendingAndDescendingTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q15AscendingAndDescendingTheArray q15AscendingAndDescendingTheArray = new Q15AscendingAndDescendingTheArray();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array : ");
		int arraySize = scanner.nextInt();
		
		int numberArray[] = new int[arraySize];
		
		System.out.print("Enter the elements in the array : ");
		for(int index=0; index<numberArray.length;index++) {
			numberArray[index]=scanner.nextInt();
		}
		
		System.out.print("Ascending order of the array : ");
		q15AscendingAndDescendingTheArray.AscendingSortingArray(numberArray);
		System.out.println();
		System.out.print("Descending order of the array : ");
		q15AscendingAndDescendingTheArray.DescendingSortingArray(numberArray);

	}
	void DescendingSortingArray(int numberArray[]) {
		int value;
		for (int index = 0; index < numberArray.length; index++) {
			value = numberArray[index];
			for (int index2 = index + 1; index2 < numberArray.length; index2++) {
				if (value < numberArray[index2]) {
					numberArray[index] = numberArray[index2];
					numberArray[index2] = value;
					value = numberArray[index];
				}
			}
		}
		for (int index = 0; index < numberArray.length; index++)
			System.out.print(numberArray[index] + " ");
	}

	void AscendingSortingArray(int numberArray[]) {
		int value;
		for (int index = 0; index < numberArray.length; index++) {
			value = numberArray[index];
			for (int index2 = index + 1; index2 < numberArray.length; index2++) {
				if (value > numberArray[index2]) {
					numberArray[index] = numberArray[index2];
					numberArray[index2] = value;
					value = numberArray[index];
				}
			}
		}
		for (int index = 0; index < numberArray.length; index++)
			System.out.print(numberArray[index] + " ");
	}

}
