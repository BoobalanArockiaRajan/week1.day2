package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Change me";
		char n1[] = test.toCharArray();
		for (int i = 0; i < n1.length; i++) {

			if (i % 3 != 0) {
				n1[i] = Character.toUpperCase(n1[i]);
			}
		}

		System.out.println(String.valueOf(n1));
	}
}