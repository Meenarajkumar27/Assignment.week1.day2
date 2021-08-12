package assignment.week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare a String
		String text1 = "stops";
		// Declare another String
		String text2 = "potss";
		boolean b = false;
		if (text1.length() == text2.length()) {
			char[] ch = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch2);

			// System.out.println("Is text1 equals to text2 : " +
			// Arrays.equals(ch, ch2));
			for (int i = 0; i < ch.length - 1; i++) {
				if (ch[i] == ch2[i]) {
					b = true;

				} else {
					b = false;
					break;
				}

			}

			if (b == true) {
				System.out.println("Both the array are same");
			} else {
				System.out.println("Both the array are diff");
			}

		}
	}
}
