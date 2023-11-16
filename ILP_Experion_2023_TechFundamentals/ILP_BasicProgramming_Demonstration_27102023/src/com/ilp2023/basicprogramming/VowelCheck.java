package com.ilp2023.basicprogramming;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		char letters[] = new char[5];
		int count = 0;

		System.out.println("Enter the characters: ");
		for (int index = 0; index < letters.length; index++) {
			letters[index] = scanner.next().charAt(0);
		}

//		for(int index = 0; index < letters.length; index++ ) {
//			if(letters[index]=='a' || letters[index]=='e' || letters[index] =='i' || letters[index]=='o' || letters[index]=='u') {
//				count++;
//			}
//		}

		for (int index = 0; index < letters.length; index++) {
			switch (letters[index]) {
			case 'a', 'e', 'i', 'o', 'u':
				count++;
				break;
			}
		}

		System.out.println(count);
		count = 0;

		for (int index = 0; index < letters.length; index++) {
			switch (letters[index]) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
			// this method is called fall through in switch case

		}
		System.out.println(count);

	}

}
