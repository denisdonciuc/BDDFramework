package Exeption;

public class ExepHand2 {

	public static void main(String[] args) {

		String str = "gfhf";
		String str2 = null;

		try {
			System.out.println(str.length());
			System.out.println(str2.length());

		} catch (Exception e) {

			System.out.println("Exception occured: " + e);
			e.printStackTrace();
		}

		System.out.println("out");
	}

}
