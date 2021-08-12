package assignment.week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		// Sort the array
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) // check if the iterator variable is not equal to the array values respectively

			{
				// print the number
				System.out.println("Missing number in the Array: " + (i + 1));

				// once printed break the iteration

				break;

			}

		}

	}

}
