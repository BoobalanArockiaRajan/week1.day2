package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MALAYALAM";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("Given String is Palindrome ");
		} else
			System.out.println("Given String is not Palindrome ");

	}

}
