package Exeption;

public class ExepHand {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		try {
			int total = 10 / 0;

			System.out.println(total);

		} catch (ArithmeticException e) {

			System.out.println("you should not divide a number by zero:" + e);
		}
		System.out.println("outside try catch block");

	}

}
