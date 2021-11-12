package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 100, 49, 398, 34, 1, 267 };
		int lenarr = arr.length;
		System.out.println("Length of the array is " + lenarr);

		Arrays.sort(arr);
		System.out.println("sort array");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(+arr[i]);

		}

		System.out.println("Largest Number is:" + arr[lenarr - 1]);
		System.out.println("First Number is:" + arr[0]);

	}
}
