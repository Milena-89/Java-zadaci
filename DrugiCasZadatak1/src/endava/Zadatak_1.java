package endava;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi prvi broj:");
		int prviBroj = input.nextInt();
		System.out.println("Unesi drugi broj:");
		int drugiBroj = input.nextInt();
		int manjiBroj;
		int veciBroj;

		if (prviBroj < drugiBroj) {
			manjiBroj = prviBroj+1;
			veciBroj = drugiBroj;
		} else {
			manjiBroj = drugiBroj+1;
			veciBroj = prviBroj;
		}

		while (manjiBroj < veciBroj) {
			if (manjiBroj % 2 == 0) {
				System.out.println(manjiBroj);
			}

			manjiBroj++;
		}

	}
}
