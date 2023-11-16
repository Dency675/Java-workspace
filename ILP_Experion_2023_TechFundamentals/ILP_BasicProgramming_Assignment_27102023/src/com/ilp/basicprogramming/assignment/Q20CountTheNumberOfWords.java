package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q20CountTheNumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String sentence = scanner.nextLine();

		int wordCount = 1;

		sentence = sentence.trim();
		if (sentence.length() == 0) {
			wordCount = 0;
		} else {
			for (int index = 0; index < sentence.length(); index++) {
				if (sentence.charAt(index) == ' ' && sentence.charAt(index + 1) != ' ') {
					wordCount++;
				}
			}
		}
		System.out.print("The number of words : " + wordCount);

	}

}
