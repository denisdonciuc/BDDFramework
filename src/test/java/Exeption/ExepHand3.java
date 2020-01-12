package Exeption;

public class ExepHand3 {

	public static void main(String[] args) {

		try {
			int num = 45 / 0;
			System.out.println(num);

		} catch (ArithmeticException e) {

			System.out.println("Arithmetic Exception");
			
		} finally {
			System.out.println("Finally Block");
		}
	}

}
