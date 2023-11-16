package com.ilp2023.basicprogramming;

import java.util.Scanner; //we are importing a package not a module

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int markList[] = new int[5];
		// in java array is a class. so to create a array we need to use keyword 'new'
		// here markList is a variable which is pointing to the address that i created
		// by new int[5]
		// markList is reference variable that is pointing to the base(starting) address
		// of the array
		// markList[] is used to make it understand it is an array
		
		Scanner scanner = new Scanner(System.in);
		for (int index = 0; index < markList.length; index++) {
			markList[index] = scanner.nextInt();
		}
		// length is member or a property of array class
		System.out.println("Entered values are: ");
		for (int index = 0; index < 5; index++) {
			System.out.println(markList[index]);
		}

	}

}
