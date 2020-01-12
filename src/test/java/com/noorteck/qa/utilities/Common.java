package com.noorteck.qa.utilities;

public class Common {

	/**
	 * This Method compare two Strings
	 * 
	 * @param acc
	 * @param exp
	 * @return
	 */

	public static boolean comparTwoVal(String acc, String exp) {

		boolean result = false;
		try {

			if (acc.equalsIgnoreCase(exp)) {
				result = true;
				System.out.println("Expected: " + exp + "Actual: " + acc + "Is equal");
			} else {
				System.out.println("Expected: " + exp + "Actual: " + acc + "Is Not equal");
			}
		} catch (Exception e) {
			System.out.println("Not Comparebale " + e);
			e.printStackTrace();
		}
		return result;

	}

	public static boolean x(String acc, String exp) {

		boolean result = false;

		try {
			if (acc.equalsIgnoreCase(exp)) {
				result = true;
			}

		} catch (Exception e) {
			System.out.println("Not Comparebale " + e);
			e.printStackTrace();
		}
		return result;

	}
}
