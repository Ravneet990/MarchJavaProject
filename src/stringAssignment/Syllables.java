package stringAssignment;

import java.util.Arrays;

public class Syllables {

	public void getSyllables() {

		String syllables1 = "buf-fet";

		String syllables2 = "beau-ti-ful";

		String syllables3 = "mon-u-men-tal";

		String syllables4 = "on-o-mat-o-poe-ia";

		String[] splitBuffet = syllables1.split("-");

		System.out.println(splitBuffet.length);

		String[] splitBeautiful = syllables2.split("-");

		System.out.println(splitBeautiful.length);

		String[] splitMonumental = syllables3.split("-");

		System.out.println(splitMonumental.length);

		String[] splitOnomatopoeia = syllables3.split("-");

		System.out.println(splitOnomatopoeia.length);

	}

}
