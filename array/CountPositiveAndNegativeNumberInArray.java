package com.mahait.array;

public class CountPositiveAndNegativeNumberInArray {
		public static void main(String[] args) {
			
			int[] array1 = {-1,11,2,3,4,5,6,7,8,-9,-8,-6,-5,4,-3};
			int negativeNumberCount = 0;
			int positiveNumberCount = 0;
			int[] negativeNumberArray = new int[array1.length];
			int [] positiveNumberArray = new int[array1.length];
			
			for (int i = 0; i < array1.length; i++) {
				if(array1[i] >= 0) {
					positiveNumberArray[positiveNumberCount] = array1[i];
					positiveNumberCount ++;
				}else
				{
					negativeNumberArray[negativeNumberCount] = array1[i];
					negativeNumberCount ++;
				}
			}
			System.out.println("Positive Number is : ");
			printArrayElements(positiveNumberArray,positiveNumberCount);
			
			System.out.println("\nNegative Number is : ");
			printArrayElements(negativeNumberArray,negativeNumberCount);
			
			System.out.println("\nPositive Number Count is : "+positiveNumberCount);
			
			System.out.println("Negative Number Count is : "+negativeNumberCount);
			
		}

		public static void printArrayElements(int[] array, int size) {
			for (int i = 0; i < size; i++) {
				System.out.print(array[i] + " ");
			}
			
		}
}
