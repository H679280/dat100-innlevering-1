package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import javax.swing.JOptionPane;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 11; i++) {
			
			String poengsum = showInputDialog("Poengsum: ");
			int tallP = parseInt(poengsum);
			boolean validInput = false;

			
			
			if (tallP >= 90 && tallP <= 100) {
				System.out.println("Karakter A");
				
			}
			
			
			if (tallP >= 80 && tallP < 90) {
				System.out.println("Karakter B");
				
			}
			
			if (tallP >= 60 && tallP < 80) {
				System.out.println("Karakter C");
				
			}
			
			
			if (tallP >= 50 && tallP < 60) {
				System.out.println("Karakter D");
				
			}
			
			
			if (tallP >= 40 && tallP < 50) {
				System.out.println("Karakter E");
				
			} 
			
			
			if (tallP >= 0 && tallP < 40) {
				System.out.println("Karakter F");
				
				
			}
			
			while (!validInput) {
				
				try {
					
					if (tallP >= 0 && tallP <= 100) {
						validInput = true;
						
					} else {
						JOptionPane.showMessageDialog(null, "Feilmelding: Poengsum på være et tall mellom 0 og 100");
						
					}
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Feilmelding: Venligst skriv inn et gyldig tall");
				}
			
			}
			
			
			
		}

	}

}
