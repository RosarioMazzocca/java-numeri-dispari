package org.generation.italy.cicli;
import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {
	public static void main(String[] args) {
		
	System.out.println("Quanti vuoi che sia lungo l'array? ");
	 Scanner scanner = new Scanner(System.in);
	 int lunghezzaArray = scanner.nextInt();
	 System.out.println("L'array è composto da: " + lunghezzaArray + " numeri");
	 
	 System.out.println("Creo un array con " + lunghezzaArray + " numeri naturali casuali");
	 int[] n = new int[lunghezzaArray];
	 
	 Random numeriRandom = new Random();
	 
	    
		int[] numeri = new int[lunghezzaArray];
		for (int i = 0; i < lunghezzaArray; i++) {
			
			n[i] = numeriRandom.nextInt(100);
			if (n[i] % 2 != 0) {
				System.out.print(" " + n[i] );
			} 
			
		 }
			
	 }
}


