package endava;

import java.util.Scanner;

public class Studenti {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi broj studenata:");
		int brojStudenata = input.nextInt();
		int maxBrojBodova = 0;
		String imeStudenta = "";
		for (int i=0;i<brojStudenata;i++) {			
			System.out.println("Unesi ime studenta:");
			String ime = input.next();
			System.out.println("Unesi broj bodova:");
			int brojBodova = input.nextInt();
			if (brojBodova>maxBrojBodova) {
				maxBrojBodova = brojBodova;
				imeStudenta = ime;
			}		
			
		}
		System.out.println("Najvise poena ima student:");
		System.out.println(maxBrojBodova);
		System.out.println(imeStudenta);
	}
	

}
