package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q17NumbersAddUpToSum8_v02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int arraySize = scanner.nextInt();
		
		int numberArray[] = new int[arraySize];


		System.out.print("Enter the elements of the array: ");
		for (int index = 0; index < numberArray.length; index++) {
			numberArray[index] = scanner.nextInt();
		}
		int sum=0;
		for(int index=0;index<numberArray.length;index++) {
			Integer temporaryNumberArray[] = new Integer[arraySize];
			int temporaryNumberArrayPosition = 0;
			sum = numberArray[index];
			temporaryNumberArray[temporaryNumberArrayPosition] = numberArray[index];
			backTracting(numberArray,index,sum, temporaryNumberArray, temporaryNumberArrayPosition);
			
		}
	}
	 static void backTracting(int[] numberArray ,int position,int sum , Integer[] temporaryNumberArray,int temporaryNumberArrayPosition) {
		 for(int index=position+1;index<numberArray.length;index++) {
			 if((sum+numberArray[index])<=8) {
				 sum+=numberArray[index];
				 temporaryNumberArrayPosition++;
				 temporaryNumberArray[temporaryNumberArrayPosition]=numberArray[index];
				 for(int index2 =0; index2 <= temporaryNumberArrayPosition; index2++)
					 System.out.print(temporaryNumberArray[index2]+" + ");
				 System.out.println(" = "+sum);
			 }
			 if(sum<8) {
				 backTracting(numberArray,index,sum,temporaryNumberArray, temporaryNumberArrayPosition);
			 }
			 else {
				 temporaryNumberArray[temporaryNumberArrayPosition]=null;
				 temporaryNumberArrayPosition--;
			 }
		 }
	}

}
