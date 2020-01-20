package endava;

import java.util.Random;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java!");
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("What is your name?");
//		String name = input.nextLine();
//		System.out.println("Hi " + name);
		
		Random rand = new Random();
	    int randomNum = rand.nextInt(50)+1;
	    Scanner input = new Scanner(System.in);
		System.out.println("Koji je tvoj broj?");
		int mojBroj= input.nextInt();

	    System.out.println(randomNum);
	    
	    int difference = randomNum - mojBroj;
	    
	    if(difference == 0) {
	    	System.out.println("Neverovatno! Pogodili ste tacan broj!");
	    } else if(difference <= 5 && difference >= -5) {
	    	System.out.println("Dobar pokusaj, bili ste jako blizu!");
	    } else {
	    	System.out.println("Vise srece drugi put...");
	    }
	    

	    }
	}
		
		
	


