package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		String brutto = showInputDialog("Bruttolønn gitt i kr: ");
		double b = parseInt(brutto);
		double trinn1 = 1.7;
		double trinn2 = 4.0;
		double trinn3 = 13.6;
		double trinn4 = 16.6;
		double trinn5 = 17.6;
				
		
		
		if (b >= 0 && b <= 208050) {
			System.out.println("Ingen trinskatt");
		}
		
		if (b > 208050 && b <= 292850) {
			double s1 = (b * trinn1) / 100;
			System.out.println("Trinnskatt: " + s1 + "kr");
		}
		
		if (b > 292850 && b <= 670000) {
			double s2 = (b * trinn2) / 100;
			System.out.println("Trinnskatt: " + s2 + "kr");
		}
		
		if (b > 670000 && b <= 937900) {
			double s3 = (b * trinn3) / 100;
			System.out.println("Trinnskatt: " + s3 + "kr");
		}
		
		if (b > 937900 && b <= 1350000) {
			double s4 = (b * trinn4) / 100;
			System.out.println("Trinnskatt: " + s4 + "kr");
		}
		
		if (b > 1350000) {
			double s5 = (b * trinn5) / 100;
			System.out.println("Trinnskatt: " + s5 + "kr");
		}
	}

}

