
package no.hvl.dat100;


import static javax.swing.JOptionPane.*; 
import static java.lang.Integer.*;
public class OppgaveO2 {

	public static void main(String[] args) {
		
		int Brutto = parseInt(showInputDialog("Bruttoinntekt"));
		int Trinn ;
		int Trinn1 ;
		int Trinn2 ;
		int Trinn3 ;
		int Trinn4;
		int Trinn5;
		double skatt = 0;
		
		if (Brutto > 1350001 ) {
			Trinn5 = Brutto - 1350001;
			Brutto = Brutto - Trinn5;
			skatt = skatt + (Trinn5 * 0.176);
			 System.out.println(skatt);}
			
			 if (Brutto >= 937001 ) {
				Trinn4 = Brutto - 937001;
				Brutto = Brutto - Trinn4;
				skatt = skatt + (Trinn4 * 0.166);}
				
			 
				if (Brutto >= 670001 ) {
					Trinn3 = Brutto - 670001;
					Brutto = Brutto - Trinn3;
					skatt = skatt + (Trinn3 * 0.136);
					System.out.println(Brutto);}
				
				
				if (Brutto >= 292851 ) {
					Trinn2 = Brutto - 292851;
					Brutto = Brutto - Trinn2;
					skatt = skatt + (Trinn2 * 0.04);
					System.out.println(Brutto);}
				
			    if (Brutto >= 208051 ) {
					Trinn1 = Brutto - 208051;
					Brutto = Brutto - Trinn1;
					skatt = skatt + (Trinn1 * 0.017);
					System.out.println(Brutto);}
			
		
			
				;
			showMessageDialog(null, skatt);
		
		
			
			
	   
		}
	
	
		
		
	}
		
		
		