package org.palindrom;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Palindrom {

	public static void main(String[] args) {

		System.out.println(getPalindromByChars());

	}

	public static int getPalindromByChars() {

		Set<Integer> palList = new HashSet<Integer>();

		for (int i = 999; i > 99; i--) {

			for (int j = 999; j > 99; j--) {

				int palindrom = i * j;

				if (isPalindromByChars(palindrom)) {

					palList.add(palindrom);
				}
			}
		}

		return Collections.max(palList);
	}

	public static boolean isPalindromByChars(int palindrom) {

		int res = String.valueOf(palindrom).length() / 2;
		int lastIndex = String.valueOf(palindrom).length() - 1;

		char[] num = String.valueOf(palindrom).toCharArray();

		for (int i = 0; i < res; i++) {

			if (num[i] != num[lastIndex - i]) {
				return false;
			}

		}

		return true;
	}
}
