package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
		String melding = "Skriv inn et heltall: ";
		
		int tall = Integer.parseInt(showInputDialog(melding));
		
		System.out.println("Fakultetet av " + tall + " er " + fakultet(tall));
	
		
	}
	
	public static long fakultet (int n) {
		
		if (n == 0 || n == 1) {
			return 1;
			
		} else {
			return n * fakultet(n - 1);
		}
		
		
	}

}