package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q19CountAndReplaceCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String sentence = scanner.nextLine();

		System.out.print("Enter the Character: ");
		char character = scanner.next().charAt(0);

		System.out.print("Enter the Character to be replaced with : ");
		char replaceCharacter = scanner.next().charAt(0);

		int count = 0;
		for (int index = 0; index < sentence.length(); index++) {
			if (character == sentence.charAt(index)) {
				count++;
			}
		}
		sentence = sentence.replace(character, replaceCharacter);

		System.out.println("Count of the Character: " + count );
		System.out.println("The string after replace : " +sentence);

	}

}
