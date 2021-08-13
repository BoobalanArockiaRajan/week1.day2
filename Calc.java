package week1.day2;

public class Calc {
	
public void add(int a,int b,int c) {
	int sum=(a+b+c);
	System.out.println("Add of given num is"+sum);
}
public void sub(int d,int e) {
	int sub=(d-e);
	System.out.println("Sub of given num is"+sub);	
}
public void mul(int p,int q) {
	double mul=(p*q);
	System.out.println("Multiple of given num is"+mul);
}
public void div(int w,int y) {
	float div=(w/y);
	System.out.println("Division of given num is"+div);
}

	public static void main(String[] args) {
Calc obj=new Calc();
obj.add(10,20,30);
obj.sub(60, 45);
obj.mul(30, 40);
obj.div(90,60);

	}

}
