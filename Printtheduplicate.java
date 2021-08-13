package week1.day2;

public class Printtheduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 21, 19, 17, 21, 15, 13, 11, 16, 25, 17, 19, 18, 20 };
		int length = arr.length;

		System.out.println("The length of given array is :" + length);
		{
			int count;
			for (int i = 0; i < arr.length - 1; i++) {
				count = 0;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j])
						count++;
				}
				if (count > 0)
					System.out.println("Duplicate number in Array are : " + arr[i]);
			}
		}
	}
}
