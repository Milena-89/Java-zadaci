package endava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi broj x:");
		int brojX = input.nextInt();
		System.out.println("Unesi broj y:");
		int brojY = input.nextInt();
		System.out.println("Unesi kod operacije:");

		String kod = input.next();
		System.out.println(kod);

		String sabiranje = "S";
		String oduzimanje = "O";
		String deljenje = "D";
		String mnozenje = "M";

		if (kod.equals(sabiranje)) {
			System.out.println(brojX + brojY);
		} else if (kod.equals(oduzimanje)) {
			System.out.println(brojX - brojY);

		} else if (kod.equals(deljenje)) {
			System.out.println(brojX / brojY);
		} else {
			System.out.println(brojX * brojY);
		}

	}

}
