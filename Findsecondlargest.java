package week1.day2;

import java.util.Arrays;

public class Findsecondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrnum = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(arrnum);

		System.out.println("The Second Largest element of Array is "+ arrnum[arrnum.length-2]) ;
		
		

	}

}
