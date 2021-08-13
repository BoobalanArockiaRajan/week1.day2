package week1.day2;

public class Findintersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mynum1 = { 1, 2, 3, 4, 6, 7 };
		
		int[] mynum2 = { 1, 2, 8, 9, 4, 7 };
		System.out.println("Intersection of two Arrays are  : ");
		
		for (int i = 0; i < mynum1.length; i++) {
			
			for (int j = 0; j < mynum2.length; j++) {
				if (mynum1[i] == mynum2[j]) {
					System.out.println(mynum1[i]);
				}
			}
		}
	}
}
