package stringAssignment;

import java.util.Scanner;

public class PrefixSuffix {

	public void PrefixSuffix() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Prefix");

		String prefix = sc.next();

		System.out.println("Enter Suffix");

		String suffix = sc.next();

		boolean isPrefix;

		boolean isSuffix;

		String array = prefix + suffix;

		for (int i = 0; i < array.length() - 1; i++) {

			if (prefix == array.substring(0, array.length() - suffix.length())) {

				System.out.println("true");
				
				break;
			}
			else {
				
				System.out.println("false");
			}
		}

	}

}
