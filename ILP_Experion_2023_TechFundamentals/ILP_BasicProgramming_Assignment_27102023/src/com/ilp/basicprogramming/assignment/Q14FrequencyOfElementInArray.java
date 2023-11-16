package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q14FrequencyOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in array : ");
		int length = scanner.nextInt();
		int count;

		System.out.print("Enter the elements in the array : ");
		char elementArray[] = new char[length];
		for (int index = 0; index < elementArray.length; index++) {
			elementArray[index] = scanner.next().charAt(0);
		}

		System.out.print("Enter an element to find the frequency : ");
		char element = scanner.next().charAt(0);

//		char temp;
//		for(int index=0;index<elementArray.length;index++) {
//			temp = elementArray[index];
//			count=0;
//			for(int index2=0;index2<elementArray.length;index2++) {
//				if(temp == elementArray[index2])
//					count++;
//			}
//			System.out.println(count + " " + elementArray[index]);
//		}

		count = 0;
		for (int index2 = 0; index2 < elementArray.length; index2++) {
			if (element == elementArray[index2])
				count++;
		}
		System.out.println("The frequency of " + element + " is " + count + ".");

	}

}
