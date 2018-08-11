package Day1HomeWork;

import java.util.Scanner;

public class FindBiggestNumber {

	public static void main(String[] args) {

		int[] numbers = {22,32,42,-22,-9};
		int max=0;
		
		
		for (int i=0;i<5;i++) {
			
			if (numbers[i] > max)
			{
				 max =numbers[i];
				
			}
			
		}
				
		System.out.println(max);
		}
			}


		